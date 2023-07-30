package com.company;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.annotations.SerializedName;

public class Customer extends Member {

    @SerializedName("Favorite_animal")
    private String favorite_animal;

    @SerializedName("Favorite_country")
    private String favorite_country;

    @SerializedName("Favorite_color")
    private String favorite_color;

    @SerializedName("Favorite_fruit")
    private String favorite_fruit;

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

    //menu
    public void customer_menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.available accounts list\n2.create a new account\n3.delete account\n4.money transfer\n" +
                "5.Financial transactions list\n6.Continuous transmission\n7.Change password\n8.Exit");

        int number = input.nextInt();
        if (number == 1) {
            show_available_account();
            customer_menu();

        } else if (number == 2) {
            create_account(this.nationalID);
            customer_menu();

        } else if (number == 3) {
            System.out.println("Enter the account number that you want to remove:");
            String account_Number = input.next();
            if (is_yours(account_Number)) {
                delete_account(account_Number);
            } else {
                System.out.println("you have not such account!");
            }
            customer_menu();

        } else if (number == 4) {
            transfer_money();
            customer_menu();

        } else if (number == 5) {
            Financial_transactions_list();
            customer_menu();

        } else if (number == 6) {
            Continuous_transmission();
            customer_menu();

        } else if (number == 7) {
            change_password();
            customer_menu();

        } else {
            System.exit(0);
        }
    }

    // organizing the monthly or weekly paying
    public void Continuous_transmission() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your chosen account number:");
        String S_account_number = input.next();
        System.out.println("Enter the destination account number:");
        String D_account_number = input.next();

        boolean exist = false;
        boolean S_exist = false;
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
                    if (account.getAccount_number().equals(S_account_number) && account.getNationalID().equals(this.nationalID) && account.getType_of_account().equals("current") && exist) {
                        S_exist = true;
                        ArrayList<String> data = new ArrayList<>();

                        // number
                        data.add(D_account_number);

                        // money
                        System.out.println("Enter the desired amount");
                        String money = input.next();
                        data.add(money);

                        // date
                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        data.add(myDateObj.format(myFormatObj));

                        // type
                        System.out.println("Select the time period you want :\n1.Weekly\n2.Monthly");
                        int num = input.nextInt();
                        if (num == 1) {
                            data.add("weekly");
                        } else {
                            data.add("monthly");
                        }

                        // times
                        System.out.println("Enter the number of repetitions");
                        String times = input.next();
                        data.add(times);

                        account.getPeriodic_transfer().add(data);
                        System.out.println("successfully");
                    } else {

                    }
                }
            }
            if (!exist || !S_exist){
                System.out.println("Check the entered accounts!");
            }
            arrayList_to_gson_account(accounts);
        }else {
            System.out.println("File does not exist!");
        }
    }

    //Add a customers
    public void make_customer_profile_file(Customer customer) {

        File customerprofileFile = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();
        if (customerprofileFile.exists()) {
            customers = gson_to_arrayList_customer(customers);
            synchronized (customer) {
                customers.add(customer);
                arrayList_to_gson_customer(customers);
                System.out.println("customer created successfully!");
            }
        }
    }

    //show customer's account
    public void show_available_account() {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();

        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            String result = "";
            for (Account account : accounts) {
                if (account.getNationalID().equals(this.nationalID)) {
                    result += account.toString() + "\n";
                }
            }
            if (!(result.equals(""))) {
                System.out.println(result);
            } else {
                System.out.println("No account exist!");
            }
        } else {
            System.out.println("No file exist!");
        }
    }

    // printing the financial transactions list
    public void Financial_transactions_list() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number");
        String account_number = input.next();
        String result = "";

        if (is_yours(account_number)) {
            File file = new File("accounts.json");
            ArrayList<Account> accounts = new ArrayList<>();
            if (file.exists()) {
                accounts = gson_to_arrayList_account(accounts);
                for(Account account : accounts){
                    if (account.getAccount_number().equals(account_number)){
                        for (int i=0 ; i<account.getFinancial_transactions().size() ; i++) {
                            for (int j=0 ; j<7 ; j++) {
                                result += account.getFinancial_transactions().get(i).get(j);
                                if (!(j==6)) {
                                    result += " , ";
                                }
                            }
                            result += "\n";
                        }
                    }
                }
                System.out.println(result);
            }
        }else {
            System.out.println("you have not this account");
        }
    }

    //change password
    public void change_password() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the new password:");
        String password_ = input.nextLine();
        boolean number = false;
        if (password_.length() >= 7) {
            for (int i = 0; i < password_.length(); i++) {
                if (password_.charAt(i) >= 48 && password_.charAt(i) <= 57) {
                    number = true;
                    break;
                }
            }
            if (!(number && !password_.toLowerCase().equals(password_))) {
                System.out.println("Enter your password in a combination of numbers, uppercase and lowercase letters!\n");
                change_password();
            }
        } else {
            System.out.println("Enter your password in a combination of numbers, uppercase and lowercase letters!\n");
            change_password();
        }

        //SECURITY QUESTIONS
        String favorite_animal = "";
        System.out.println("Choose your favorite animal :\n1.Dog\n2.Cat\n3.Parrot\n4.Hamster");
        int number1 = input.nextInt();
        if (number1 == 1) {
            favorite_animal = "dog";
        } else if (number1 == 2) {
            favorite_animal = "cat";
        } else if (number1 == 3) {
            favorite_animal = "parrot";
        } else if (number1 == 4) {
            favorite_animal = "hamster";
        }

        String favorite_country = "";
        System.out.println("Choose your favorite country :\n1.France\n2.Australia\n3.Japan\n4.Brazil");
        int number2 = input.nextInt();
        if (number2 == 1) {
            favorite_country = "france";
        } else if (number2 == 2) {
            favorite_country = "australia";
        } else if (number2 == 3) {
            favorite_country = "japan";
        } else if (number2 == 4) {
            favorite_country = "brazil";
        }

        String favorite_color = "";
        System.out.println("Choose your favorite color :\n1.Blue\n2.Red\n3.Green\n4.Orange");
        int number3 = input.nextInt();
        if (number3 == 1) {
            favorite_color = "blue";
        } else if (number3 == 2) {
            favorite_color = "red";
        } else if (number3 == 3) {
            favorite_color = "green";
        } else if (number3 == 4) {
            favorite_color = "orange";
        }

        String favorite_fruit = "";
        System.out.println("Choose your favorite fruit :\n1.Banana\n2.Apple\n3.Orange\n4.Grapes");
        int number4 = input.nextInt();
        if (number4 == 1) {
            favorite_fruit = "banana";
        } else if (number4 == 2) {
            favorite_fruit = "apple";
        } else if (number4 == 3) {
            favorite_fruit = "orange";
        } else if (number4 == 4) {
            favorite_fruit = "grapes";
        }

        ArrayList<Customer> customers = new ArrayList<>();
        customers = gson_to_arrayList_customer(customers);

        synchronized (customers) {         // locks the customers
            for (Customer customer : customers) {
                if (customer.nationalID.equals(this.nationalID)) {
                    customer.password = password_;
                    customer.setFavorite_animal(favorite_animal);
                    customer.setFavorite_color(favorite_color);
                    customer.setFavorite_country(favorite_country);
                    customer.setFavorite_fruit(favorite_fruit);
                    break;
                }
            }
            arrayList_to_gson_customer(customers);
            System.out.println("your password changed successfully!");
        }
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

    public String getFavorite_fruit() {
        return favorite_fruit;
    }

    public String getFavorite_color() {
        return favorite_color;
    }

    public String getFavorite_country() {
        return favorite_country;
    }

    public String getFavorite_animal() {
        return favorite_animal;
    }
}