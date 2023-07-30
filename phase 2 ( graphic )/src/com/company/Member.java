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
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Member {
    @SerializedName("FirstName")
    protected String firstName;

    @SerializedName("LastName")
    protected String lastName;

    @SerializedName("NationalID")
    protected String nationalID;

    @SerializedName("PhoneNumber")
    protected String phoneNumber;

    @SerializedName("Gender")
    protected String gender;

    @SerializedName("Email")
    protected String email;

    @SerializedName("BirthDate")
    protected String birthDate;

    @SerializedName("Address")
    protected String address;

    @SerializedName("Password")
    protected String password;


    public Member(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email,
                  String birthDate, String address, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    // searching among customers
    public void search_customer(int number, String str, boolean full_search) {
        //1 >>>search customer by manager    //2>>>>search manager by customer
        String result = "";
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();

        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);

            boolean customer_found = false;
            boolean found = false;
            for (Customer customer : customers) {
                if (number == 1) {
                    customer_found = customer.firstName.equals(str);

                } else if (number == 2) {
                    customer_found = customer.lastName.equals(str);

                } else if (number == 3) {
                    customer_found = customer.nationalID.equals(str);

                } else if (number == 4) {
                    customer_found = customer.phoneNumber.equals(str);

                } else if (number == 5) {
                    customer_found = customer.gender.equals(str);

                } else if (number == 6) {
                    customer_found = customer.email.equals(str);

                } else if (number == 7) {
                    customer_found = customer.birthDate.equals(str);

                } else if (number == 8) {
                    customer_found = customer.address.equals(str);

                }

                if (customer_found) {
                    found = true;
                    result += customer.toString() + "\n";

                    if (full_search) {
                        File accountfile = new File("accounts.json");
                        ArrayList<Account> accounts = new ArrayList<>();

                        if (accountfile.exists()) {
                            accounts = gson_to_arrayList_account(accounts);

                            for (Account account : accounts) {
                                if (account.getNationalID().equals(customer.nationalID)) {
                                    result += ">>>> : " + account.toString() + "\n";
                                }
                            }
                            result += "\n";
                        }
                    }
                }
            }
            if (found) {
                just_show just_show = new just_show(result);
                just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                just_show.setVisible(true);
            } else {
                OK ok = new OK("customer not found!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("No customer exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // writing to gson customer file
    public void arrayList_to_gson_customer(ArrayList customers) {
        Gson gson = new Gson();
        String result = gson.toJson(customers);
        try {
            FileWriter cWriter = new FileWriter("customer profile.json");
            synchronized (cWriter) {
                cWriter.write(result);
                cWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //READ FROM FILE AND CONVERT TO STRING FOR CUSTOMER
    public ArrayList gson_to_arrayList_customer(ArrayList customers) {
        Gson gson = new Gson();
        String data = "";
        File customerProfileFile = new File("customer profile.json");
        try {
            Scanner reader = new Scanner(customerProfileFile);
            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        customers = gson.fromJson(data, new TypeToken<ArrayList<Customer>>() {
        }.getType());
        return customers;
    }

    //READ FROM FILE AND CONVERT TO STRING FOR EMPLOYEE
    public ArrayList gson_to_arrayList_employee(ArrayList employees) {
        Gson gson = new Gson();
        String data = "";
        File employeeProfileFile = new File("employee profile.json");
        try {
            Scanner reader = new Scanner(employeeProfileFile);
            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        employees = gson.fromJson(data, new TypeToken<ArrayList<Employee>>() {
        }.getType());
        return employees;
    }

    // printing customers list
    public void show_customers_list() {
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        if (file.exists()) {
            String result = "";
            customers = gson_to_arrayList_customer(customers);
            Collections.sort(customers, Comparator.comparing(Customer::getLastName));

            for (Customer customer : customers) {
                result += customer.toString();
            }
            just_show just_show = new just_show(result);
            just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            just_show.setVisible(true);
        } else {
            OK ok = new OK("No customer exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);

        }
    }

    // writing to gson employee file
    public static void arrayList_to_gson_employee(ArrayList employees) {
        Gson gson = new Gson();
        String result = gson.toJson(employees);
//        System.out.println(result);
        try {
            FileWriter cWriter = new FileWriter("employee profile.json");
            synchronized (cWriter) {
                cWriter.write(result);
                cWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deleting a customer
    public void delete_customer_profile(String customerId) {
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();
        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);

            Boolean deletedCustomer = false;
            synchronized (customers) {
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(customerId)) {
                        customers.remove(i);
                        OK ok = new OK("Deleted successfully!", 1);
                        ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                        deletedCustomer = true;
                        break;
                    }
                }
                if (deletedCustomer) {
                    arrayList_to_gson_customer(customers);
                } else {
                    OK ok = new OK("there's no customer with this id!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            }
        } else {
            OK ok = new OK("No customer exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // editing a customer information
    public void edit_customer_profile(String nationalID, Customer customer_) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers = gson_to_arrayList_customer(customers);

        synchronized (customers) {
            for (Customer customer : customers) {
                if (customer.nationalID.equals(nationalID)) {
                    customers.remove(customer);
                    break;
                }
            }
            customers.add(customer_);
            arrayList_to_gson_customer(customers);
        }
    }

    // checking if a customer exist
    public boolean exist_customer(String nationalID) {

        File file = new File("customer profile.json");
        ArrayList<Customer> customers = null;

        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);
            for (Customer customer : customers) {
                if (customer.nationalID.equals(nationalID)) {
                    return true;
                }
            }
        } else {
            OK ok = new OK("No customer exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
        return false;
    }

    // creating a new account
    public void create_account(String nationalID, String Money, int Number1, int Number2) {
        //       number1     1>>>.made_of_manager       2>>>made_of_employee   3>>>made_of_customer
        //       number2     1>>>> current              2>>> saving
        Scanner input = new Scanner(System.in);

        if (exist_customer(nationalID)) {
            String type_of_account;
            String date_of_account_creation;
            String account_number;
            String money;
            String last_deposit_interest;
            ArrayList<ArrayList<String>> Financial_transactions = new ArrayList<ArrayList<String>>();

            //type
            if (Number2 == 1) {
                type_of_account = "current";
            } else {
                type_of_account = "saving";
            }

            // date of creation
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            date_of_account_creation = myDateObj.format(myFormatObj);

            //account number
            DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyHHmmss");
            String number = myDateObj.format(myFormatObj1);
            account_number = nationalID + number;

            //money
            if (Number1 == 1 || Number1 == 2) {
                money = Money;
            } else {
                money = "0";
            }

            //last deposit interest
            if (type_of_account.equals("saving")) {
                last_deposit_interest = date_of_account_creation;
            } else {
                last_deposit_interest = "null";
            }
            ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
            Account account = new Account(type_of_account, nationalID, date_of_account_creation,
                    account_number, money, last_deposit_interest, Financial_transactions, a);

            File file = new File("accounts.json");
            ArrayList<Account> accounts = new ArrayList<>();
            if (file.exists()) {
                accounts = gson_to_arrayList_account(accounts);
            }
            synchronized (accounts) {
                accounts.add(account);
                arrayList_to_gson_account(accounts);
                just_show just_show = new just_show("    account created!" + "\n" + account.print_accounts());
                just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                just_show.setVisible(true);
            }
        } else {
            OK ok = new OK("customer not found!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // reading from gson account file
    public ArrayList gson_to_arrayList_account(ArrayList accounts) {

        Gson gson = new Gson();
        String data = "";
        File file = new File("accounts.json");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        accounts = gson.fromJson(data, new TypeToken<ArrayList<Account>>() {
        }.getType());
        return accounts;
    }

    // writing to gson account file
    public void arrayList_to_gson_account(ArrayList accounts) {
        Gson gson = new Gson();
        String result = gson.toJson(accounts);
        try {
            FileWriter cWriter = new FileWriter("accounts.json");
            synchronized (cWriter) {
                cWriter.write(result);
                cWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // deleting an account
    public void delete_account(String account_Number) {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);

            Boolean deletedAccount = false;
            synchronized (accounts) {
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAccount_number().equals(account_Number)) {
                        accounts.remove(i);
                        OK ok = new OK("Deleted successfully!", 1);
                        ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                        deletedAccount = true;
                        break;
                    }
                }
                if (deletedAccount) {
                    arrayList_to_gson_account(accounts);
                } else {
                    OK ok = new OK("there's no account with this number!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            }
        } else {
            OK ok = new OK("no account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // printing accounts list
    public void show_accounts_list() {
        File file = new File("accounts.json");
        String result = "";
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);

            for (Account account : accounts) {
                result += account.print_accounts();
            }
            just_show just_show = new just_show(result);
            just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            just_show.setVisible(true);
        } else {
            OK ok = new OK("no account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // searching among accounts
    public void search_account(String str, int number) {
        String result = "";
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();

        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);

            boolean account_found = false;
            boolean found = false;
            for (Account account : accounts) {
                if (number == 1) {
                    account_found = account.getAccount_number().equals(str);

                } else if (number == 2) {
                    account_found = account.getType_of_account().equals(str);

                } else if (number == 3) {
                    account_found = account.getdate_of_account_creation().equals(str);

                } else if (number == 4) {
                    account_found = account.getLast_deposit_interest().equals(str);

                } else if (number == 5) {
                    account_found = account.getMoney().equals(new BigDecimal(str));

                }
                if (account_found) {
                    result += account.toString() + "\n";
                    found = true;
                }
            }
            if (found) {
                just_show just_show = new just_show(result);
                just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                just_show.setVisible(true);

            } else {
                OK ok = new OK("No account found!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);

            }
        } else {
            OK ok = new OK("No account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // printing the list of transactions of an account
    public void show_transactions_list() {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            String result = "";
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                for (int i = 0; i < account.getFinancial_transactions().size(); i++) {
                    for (int j = 0; j < 5; j++) {
                        result += account.getFinancial_transactions().get(i).get(j) + "\n";
                    }
                    result += "\n";
                }
            }
            just_show just_show = new just_show(result);
            just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            just_show.setVisible(true);
        } else {
            OK ok = new OK("No account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // searching among transactions
    public void search_transaction(int number, String str) {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            String result = "";
            ArrayList<ArrayList<ArrayList<String>>> arrayListss = new ArrayList<>();
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
                for (int i = 0; i < account.getFinancial_transactions().size(); i++) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int j = 0; j < 6; j++) {
                        arrayList.add(account.getFinancial_transactions().get(i).get(j));
                    }
                    arrayLists.add(arrayList);
                }
                arrayListss.add(arrayLists);
            }
            boolean transaction_found = false;
            boolean found = false;

            for (int i = 0; i < accounts.size(); i++) {
                for (int j = 0; j < accounts.get(i).getFinancial_transactions().size(); j++) {
                    if (number == 1) {
                        transaction_found = arrayListss.get(i).get(j).get(0).contains(str);
                    } else if (number == 2) {
                        transaction_found = arrayListss.get(i).get(j).get(1).contains(str);
                    } else if (number == 3) {
                        transaction_found = arrayListss.get(i).get(j).get(2).contains(str);
                    } else if (number == 4) {
                        transaction_found = arrayListss.get(i).get(j).get(3).contains(str);
                    } else if (number == 5) {
                        transaction_found = arrayListss.get(i).get(j).get(4).trim().toLowerCase().contains(str);
                    } else {
                        transaction_found = arrayListss.get(i).get(j).get(5).contains(str);
                    }
                    if (transaction_found) {
                        result += arrayListss.get(i).get(j).get(0) + " \n " + arrayListss.get(i).get(j).get(1) +
                                " \n " + arrayListss.get(i).get(j).get(2) + " \n " + arrayListss.get(i).get(j).get(3) + " \n " +
                                arrayListss.get(i).get(j).get(4) + " \n " + arrayListss.get(i).get(j).get(5) + "\n" +
                                "  ***********************************************************************  " + "\n";
                        found = true;
                    }
                }
            }
            if (found) {
                just_show just_show = new just_show(result);
                just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                just_show.setVisible(true);
            } else {
                OK ok = new OK("transaction not found!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("No account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    //transferring money from one account to another
    public void transfer_money(String source_account_number, String destination_account_number, String money_, int number) {
        //number >>1 >>> using by employee , // number2 >> using by customer
        if (source_account_number.equals("") | destination_account_number.equals("") | money_.equals("")) {
            OK ok = new OK("One or mor fields are empty!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else {
            BigDecimal Money = new BigDecimal(money_);
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("HH:mm");
            String data = "";
            Gson gson = new Gson();
            int source_number = 0;
            int destination_number = 0;
            File file = new File("accounts.json");
            ArrayList<Account> accounts;
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
                accounts = gson.fromJson(data, new TypeToken<ArrayList<Account>>() {
                }.getType());
                Boolean source_found = false;
                if (number == 1) {
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getAccount_number().equals(source_account_number)) {
                            source_number = i;
                            source_found = true;
                            break;
                        }
                    }
                } else {
                    if (number == 2) {
                        for (int i = 0; i < accounts.size(); i++) {
                            if (accounts.get(i).getAccount_number().equals(source_account_number) &&
                                    accounts.get(i).getNationalID().equals(this.nationalID)) {
                                source_number = i;
                                source_found = true;
                                break;
                            }
                        }
                    }
                }
                Boolean destination_found = false;
                if (source_found) {

                    synchronized (accounts) {
                        for (int i = 0; i < accounts.size(); i++) {
                            if (accounts.get(i).getAccount_number().equals(destination_account_number)) {
                                destination_number = i;
                                destination_found = true;
                                break;
                            }
                        }

                        if (destination_found) {
                            if (!((accounts.get(source_number).getMoney().compareTo(Money) == -1))) {
                                ArrayList<String> source = new ArrayList<String>();
                                accounts.get(source_number).setMoney(accounts.get(source_number).getMoney().subtract(Money));

                                //source
                                source.add("source account : " + accounts.get(source_number).getAccount_number());

                                //date
                                source.add("date : " + myDateObj.format(myFormatObj));

                                //time
                                source.add("time : " + myDateObj.format(myFormatObj1));

                                // amount of money transfer
                                source.add("money exchanged : -" + Money.toString());

                                //type
                                source.add("type : removal");

                                //destination
                                source.add("destination account : " + accounts.get(destination_number).getAccount_number());

                                //add to the main array list
                                accounts.get(source_number).getFinancial_transactions().add(source);


                                accounts.get(destination_number).setMoney(accounts.get(destination_number).getMoney().add(Money));
                                ArrayList<String> destination = new ArrayList<String>();

                                //source
                                destination.add("source account : " + accounts.get(source_number).getAccount_number());

                                //date
                                destination.add("date : " + myDateObj.format(myFormatObj));

                                //time
                                destination.add("time : " + myDateObj.format(myFormatObj1));

                                // amount of money transfer
                                destination.add("money exchanged : +" + Money.toString());

                                //type
                                destination.add("type : deposit");

                                //destination
                                destination.add("destination account : " + accounts.get(destination_number).getAccount_number());

                                //add to the main arraylist
                                accounts.get(destination_number).getFinancial_transactions().add(destination);

                                arrayList_to_gson_account(accounts);
                                String result = gson.toJson(accounts);
                                try {
                                    FileWriter cWriter = new FileWriter("accounts.json");
                                    cWriter.write(result);
                                    cWriter.close();
                                    OK ok = new OK("Successful", 1);
                                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                                    ok.setVisible(true);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                OK ok = new OK("Not enough money!", 1);
                                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                                ok.setVisible(true);
                            }
                        } else {
                            OK ok = new OK("Wrong destination account number!", 1);
                            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                            ok.setVisible(true);
                        }
                    }
                } else {
                    OK ok = new OK("Wrong source account  number!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }

            } else {
                OK ok = new OK("No file exist!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        }
    }

    // Check accounts
    public void checker() {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                if (account.getType_of_account().equals("saving")) {
                    account.Profit();
                } else {
                    accounts = account.period(accounts);
                }
            }
            arrayList_to_gson_account(accounts);
        }
    }


    // editing amount of money of an account
    public void edit_account(String accountNumber, String newMoney) {

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("HH:mm");

        ArrayList<Account> accounts = new ArrayList<>();
        File file = new File("accounts.json");
        accounts = gson_to_arrayList_account(accounts);

        boolean edit_account = false;
        synchronized (accounts) {
            for (Account account : accounts) {
                if (account.getAccount_number().equals(accountNumber)) {
                    ArrayList<String> profit = new ArrayList<>();
                    if (account.getMoney().compareTo(new BigDecimal(newMoney)) == -1) {

                        //source
                        profit.add("source account : bank");

                        //date
                        profit.add("date : " + myDateObj.format(myFormatObj));

                        //time
                        profit.add("time : " + myDateObj.format(myFormatObj1));

                        // amount of money transfer
                        profit.add("money exchanged : +" + new BigDecimal(newMoney).subtract(account.getMoney()));

                        //type
                        profit.add("type : deposit");

                        //destination
                        profit.add("destination account : " + account.getAccount_number());

                        account.getFinancial_transactions().add(profit);


                    } else if (account.getMoney().compareTo(new BigDecimal(newMoney)) == 1) {

                        //source
                        profit.add("source account : " + account.getAccount_number());

                        //date
                        profit.add("date : " + myDateObj.format(myFormatObj));

                        //time
                        profit.add("time : " + myDateObj.format(myFormatObj1));

                        // amount of money transfer
                        profit.add("money exchanged : " + new BigDecimal(newMoney).subtract(account.getMoney()));

                        //type
                        profit.add("type : removal");

                        //destination
                        profit.add("destination account : null");

                        account.getFinancial_transactions().add(profit);
                    }
                    account.setMoney(newMoney);
                    OK ok = new OK("changed successfully!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    edit_account = true;
                    break;
                }
            }
            if (edit_account) {
                arrayList_to_gson_account(accounts);
            } else {
                OK ok = new OK("there's no account with this number!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        }
    }


    @Override
    public String toString() {
        return "      firstName : " + this.firstName + "\n" + "      lastName : " + this.lastName + "\n " + "     nationalID : " + this.nationalID + "\n" +
                "      phoneNumber : " + this.phoneNumber + "\n" + "      gender : " + this.gender + "\n" + "      email : " + this.email + "\n" +
                "      birthDate : " + this.birthDate + "\n" + "      address : " + this.address + "\n" +
                "      ******************************************************************" + "\n";
    }


}