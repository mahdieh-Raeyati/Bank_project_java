package com.company;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Member {

    @SerializedName("Favorite_animal")
    protected String favorite_animal;

    @SerializedName("Favorite_country")
    protected String favorite_country;

    @SerializedName("Favorite_color")
    protected String favorite_color;

    @SerializedName("Favorite_fruit")
    protected String favorite_fruit;

    //constructor
    public Customer(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email,
                    String birthDate, String address, String password, String favorite_animal, String favorite_country,
                    String favorite_color, String favorite_fruit) {
        super(firstName, lastName, nationalID, phoneNumber, gender, email, birthDate, address, password);

        this.favorite_animal = favorite_animal;
        this.favorite_color = favorite_color;
        this.favorite_country = favorite_country;
        this.favorite_fruit = favorite_fruit;
    }

    //setters
    public void setpassword(String password) {
        this.password = password;
    }

    public void setFavorite_animal(String favorite_animal) {
        this.favorite_animal = favorite_animal;
    }

    public void setFavorite_country(String favorite_country) {
        this.favorite_country = favorite_country;
    }

    public void setFavorite_color(String favorite_color) {
        this.favorite_color = favorite_color;
    }

    public void setFavorite_fruit(String favorite_fruit) {
        this.favorite_fruit = favorite_fruit;
    }

    //show list of account
    public void show_available_account() {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            String result = "";
            for (Account account : accounts) {
                if (account.getNationalID().equals(this.nationalID)) {
                    result += account.toString();
                }
            }
            if (!(result.equals(""))) {
                just_show just_show = new just_show(result);
                just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                just_show.setVisible(true);

            } else {
                OK ok = new OK("No account exist!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("No account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    //show financial transaction
    public void Financial_transactions_list(Customer customer, String account_number) {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        String DATA = "";
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            int index = 0;
            Boolean have_account = false;
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getAccount_number().equals(account_number) && customer.nationalID.equals(accounts.get(i).getNationalID())) {
                    index = i;
                    have_account = true;
                    break;
                }
            }
            if (have_account) {
                for (int i = 0; i < accounts.get(index).getFinancial_transactions().size(); i++) {
                    for (int j = 0; j < accounts.get(index).getFinancial_transactions().get(i).size(); j++) {
                        DATA += "    " + accounts.get(index).getFinancial_transactions().get(i).get(j) + "\n";
                    }
                    DATA += "\n" + "********************************************************************" + "\n";
                }
                if (DATA.equals("")) {
                    OK ok = new OK("No financial transaction exist!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                } else {
                    just_show just_show = new just_show(DATA);
                    just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    just_show.setVisible(true);
                }
            } else {
                OK ok = new OK("you have not an account with this number!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        }
    }

    //change password
    public void change_password(Customer customer, String password_, String favorite_animal
            , String favorite_color, String favorite_country, String favorite_fruit, int number) {

        String data = "";
        Gson gson = new Gson();
        File file = new File("customer profile.json");
        ArrayList<Customer> customers;
        if (file.exists()) {
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            customers = gson.fromJson(data, new TypeToken<ArrayList<Customer>>() {
            }.getType());
            int index = 0;
            synchronized (customers) {
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(customer.nationalID)) {
                        customers.get(i).setpassword(password_);
                        customers.get(i).setFavorite_animal(favorite_animal);
                        customers.get(i).setFavorite_color(favorite_color);
                        customers.get(i).setFavorite_country(favorite_country);
                        customers.get(i).setFavorite_fruit(favorite_fruit);
                        index = i;
                        break;
                    }
                }
            }
            String result = gson.toJson(customers);
            try {
                FileWriter cWriter = new FileWriter("customer profile.json");
                synchronized (cWriter) {
                    cWriter.write(result);
                    cWriter.close();
                }
                if (number == 1) {
                    OK ok = new OK("password changed successfully!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No customer exist!");
        }
    }

    // Add a new customer
    public void make_customer_profile_file(Customer customer) {
        File customerprofileFile = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        if (customerprofileFile.exists()) {
            customers = gson_to_arrayList_customer(customers);
        }
        synchronized (customers) {
            customers.add(customer);
            System.out.println(customers);
            arrayList_to_gson_customer(customers);
            OK ok = new OK("customer created successfully!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    public void Continuous_transmission(String S_account_number, String D_account_number, String money, String type, String times) {
        // "1.Weekly2.Monthly"
        boolean exist = false;
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                if (account.getAccount_number().equals(D_account_number)) {
                    exist = true;
                }
            }
            synchronized (accounts) {
                for (Account account : accounts) {
                    if (account.getAccount_number().equals(S_account_number) && account.getNationalID().equals(this.nationalID)
                            && account.getType_of_account().equals("current") && exist) {
                        ArrayList<String> data = new ArrayList<>();

                        // number
                        data.add(D_account_number);

                        // money
                        data.add(money);

                        // date
                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        data.add(myDateObj.format(myFormatObj));

                        // type
                        data.add(type.toLowerCase());

                        // times
                        data.add(times);

                        account.getPeriodic_transfer().add(data);
                        OK ok = new OK("successful!", 1);
                        ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                    }
                }
            }
            if (!exist) {
                OK ok = new OK("invalid account for continuous deposit!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
            arrayList_to_gson_account(accounts);
        } else {
            OK ok = new OK("account not exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }
}
