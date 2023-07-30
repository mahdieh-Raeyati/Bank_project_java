package com.company;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Member implements Serializable {
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

    // Transferring money
    public void transfer_money() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the source account number:");
        String source_account_number = input.next();
        System.out.println("Enter the destination account number:");
        String destination_account_number = input.next();
        System.out.println("Enter amount of money:");
        String money = input.next();

        BigDecimal Money = new BigDecimal(money);
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("HH:mm");
        int source_number = 0;
        int destination_number = 0;

        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);

            Boolean destination_found = false;
            if (is_yours(source_account_number) || Main.made_of_employee) {

                synchronized (accounts) {

                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getAccount_number().equals(source_account_number)) {
                            source_number = i;
                            break;
                        }
                    }

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

                            //condition
                            source.add("condition : successful");

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

                            //condition
                            destination.add("condition : successful");

                            //add to the main arraylist
                            accounts.get(destination_number).getFinancial_transactions().add(destination);


                            arrayList_to_gson_account(accounts);
                            System.out.println("successful");
                        } else {
                            System.out.println("Not enough money!");
                        }
                    } else {
                        System.out.println("Wrong destination account number!");
                    }
                }
            } else {
                System.out.println("Wrong source account!");
            }
        } else {
            System.out.println("No file exist!");
        }
    }

    // Check the account holder
    public boolean is_yours(String account_number) {

        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                if (account.getAccount_number().equals(account_number) && account.getNationalID().equals(this.nationalID)) {
                    return true;
                }
            }
        } else {
            System.out.println("File not exist!");
        }
        return false;
    }

    // printing transaction's list
    public void show_transactions_list(){
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()){
            String result = "";
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts){
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
            System.out.println(result);
        }else{
            System.out.println("File not exist!");
        }
    }

    // Searching among customers
    public void search_customer(boolean full_search) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.First name\n2.Last name\n3.NationalID\n4.PhoneNumber\n5.Gender\n6.Email\n7.BirthDate\n8.Address");
        int number = input.nextInt();
        System.out.println("Enter the desired word : ");
        String str = input.next();
        String result = "";
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();

        synchronized (customers) {
            if (file.exists()) {
                customers = gson_to_arrayList_customer(customers);

                boolean customer_found = false;
                boolean found = false;
                for (Customer customer : customers) {
                    if (number == 1) {
                        customer_found = customer.firstName.equals(str.toLowerCase());

                    } else if (number == 2) {
                        customer_found = customer.lastName.equals(str.toLowerCase());

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
                        customer_found = customer.address.equals(str.toLowerCase());

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
                            } else {
                                System.out.println("File not exist!");
                            }
                        }
                    }
                }
                if (found) {
                    System.out.println(result);
                } else {
                    System.out.println("customer not found!");
                }
            } else {
                System.out.println("No customer exist!");
            }
        }
    }

    // Searching among accounts
    public void search_account() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.account number\n2.type\n3.date of creation\n4.last deposit interest\n5.money");
        int number = input.nextInt();
        System.out.println("Enter the desired word :");
        String str = input.next();
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();

        if (file.exists()) {
            String result = "";
            accounts = gson_to_arrayList_account(accounts);

            boolean account_found = false;
            boolean found = false;
            for (Account account : accounts) {
                if (number == 1) {
                    account_found = account.getAccount_number().equals(str);

                } else if (number == 2) {
                    account_found = account.getType_of_account().equals(str.toLowerCase());

                } else if (number == 3) {
                    account_found = account.getdate_of_account_creation().equals(str);

                } else if (number == 4) {
                    account_found = account.getLast_deposit_interest().equals(str);

                } else {
                    account_found = account.getMoney().equals(new BigDecimal(str));

                }
                if (account_found) {
                    result += account.toString() + "\n";
                    found = true;
                }
            }
            if (found) {
                System.out.println(result);
            } else {
                System.out.println("account not found!");
            }
        } else {
            System.out.println("No account exist!");
        }
    }

    // Searching among transactions
    public void search_transaction() {
        Scanner input = new Scanner(System.in);
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            String result = "";
            ArrayList<ArrayList<ArrayList<String>>> arrayListss = new ArrayList<>();
            accounts = gson_to_arrayList_account(accounts);

            // CREATE array list for transactions
            for (Account account : accounts) {
                ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
                for (int i = 0; i < account.getFinancial_transactions().size(); i++) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int j = 0; j < account.getFinancial_transactions().get(i).size(); j++) {
                        arrayList.add(account.getFinancial_transactions().get(i).get(j));
                    }
                    arrayLists.add(arrayList);
                }
                arrayListss.add(arrayLists);
            }

            System.out.println("1.source account\n2.date\n3.time\n4.money exchanged(with + or - )\n5.type\n" +
                    "6.destination account\n7.condition (successful or unsuccessful)");

            int number = input.nextInt();
            String str = input.next();
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
                        transaction_found = arrayListss.get(i).get(j).get(4).contains(str);
                    } else if (number == 6) {
                        transaction_found = arrayListss.get(i).get(j).get(5).contains(str);
                    } else {
                        transaction_found = arrayListss.get(i).get(j).get(6).contains(str);
                    }
                    if (transaction_found) {
                        result += arrayListss.get(i).get(j).get(0) + " , " + arrayListss.get(i).get(j).get(1) + " , " +
                                arrayListss.get(i).get(j).get(2) + " , " + arrayListss.get(i).get(j).get(3) + " , " +
                                arrayListss.get(i).get(j).get(4) + " , " + arrayListss.get(i).get(j).get(5) + " , " +
                                arrayListss.get(i).get(j).get(6) + "\n";

                        found = true;
                    }
                }
            }
            if (found) {
                System.out.println(result);
            } else {
                System.out.println("transaction not found!");
            }
        } else {
            System.out.println("File not exist!");
        }
    }

    // printing accounts list
    public void show_accounts_list() {
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            Collections.sort(accounts, Comparator.comparing(Account::getNationalID));

            for (Account account : accounts) {
                System.out.println(account.toString());
            }
        } else {
            System.out.println("No account exist!");
        }
    }

    // printing customers list
    public void show_customers_list() {
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = null;
        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);
            Collections.sort(customers, Comparator.comparing(Customer::getLastName));

            for (Customer customer : customers) {
                System.out.println(customer.toString() + "\n");
            }
        } else {
            System.out.println("No customer exist!");
        }
    }

    // checking if customer exists
    public boolean exist_customer(String nationalID) {
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();

        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);
            for (Customer customer : customers) {
                if (customer.nationalID.equals(nationalID)) {
                    return true;
                }
            }
        } else {
            System.out.println("File not exist!");
        }
        return false;
    }

    // creating an account
    public void create_account(String nationalID) {
        Scanner input = new Scanner(System.in);

        if (exist_customer(nationalID)) {
            String type_of_account;
            String date_of_account_creation;
            String account_number;
            String money;
            String last_deposit_interest;
            ArrayList<ArrayList<String>> Financial_transactions = new ArrayList<>();
            ArrayList<ArrayList<String>> Periodic_transfer = new ArrayList<>();

            //type
            System.out.println("Choose type :\n1.current account\n2.saving account");
            int num = input.nextInt();
            if (num == 1) {
                type_of_account = "current";
            } else {
                type_of_account = "saving";
            }

            //date of creation
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            date_of_account_creation = myDateObj.format(myFormatObj);

            //account number
            DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyHHmmss");
            String number = myDateObj.format(myFormatObj1);
            account_number = nationalID + number;

            //money
            if (Main.made_of_manager || Main.made_of_employee) {
                System.out.println("enter money :");
                money = input.next();
            } else {
                money = "0";
            }

            //last deposit interest
            if (type_of_account.equals("saving")) {
                last_deposit_interest = date_of_account_creation;
            } else {
                last_deposit_interest = "null";
            }

            Account account = new Account(type_of_account, nationalID, date_of_account_creation, account_number, money,
                    last_deposit_interest, Financial_transactions, Periodic_transfer);

            File file = new File("accounts.json");
            ArrayList<Account> accounts = new ArrayList<>();
            if (file.exists()) {
                accounts = gson_to_arrayList_account(accounts);
            }
            synchronized (accounts) {
                accounts.add(account);
                arrayList_to_gson_account(accounts);
                System.out.println("account created successfully! your account number is : " + account_number);
            }
        } else {
            System.out.println("The person not found!");
        }
    }

    // Deleting an account
    public void delete_account(String account_Number) {
        Scanner input = new Scanner(System.in);
        File file = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            Boolean deletedAccount = false;

            synchronized (accounts) {
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAccount_number().equals(account_Number)) {
                        System.out.println("are you sure you want to delete this account?\n1.Yes\n2.No");
                        int item = input.nextInt();
                        if(item == 1) {
                            accounts.remove(i);
                            System.out.println("Deleted successfully");
                            deletedAccount = true;
                            break;
                        }
                        else{
                            System.out.println("operation cancelled!");
                        }
                    }
                }
                if (deletedAccount) {
                    arrayList_to_gson_account(accounts);
                } else {
                    System.out.println("there's no account with this number!");
                }
            }
        } else {
            System.out.println("File not exist!");
        }
    }

    // Deleting a customer
    public void delete_customer_profile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id that you want to remove:");
        String customerId = input.next();
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();
        if (file.exists()) {
            customers = gson_to_arrayList_customer(customers);
            Boolean deletedCustomer = false;

            synchronized (customers) {
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(customerId)) {
                        System.out.println("are you sure you want to delete this customer?\n1.Yes\n2.No");
                        int item = input.nextInt();
                        if(item == 1) {
                            customers.remove(i);
                            System.out.println("Deleted successfully");
                            deletedCustomer = true;
                            break;
                        }
                        else{
                            System.out.println("operation cancelled!");
                        }
                    }
                }
                if (deletedCustomer) {
                    arrayList_to_gson_customer(customers);
                } else {
                    System.out.println("there's no customer with this id!");
                }
            }
        } else {
            System.out.println("File not exist!");
        }
    }

    // editing amount of money of an account
    public void edit_account() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the account number:");
        String accountNumber = input.nextLine();
        System.out.println("enter new inventory:");
        String newMoney = input.nextLine();

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("HH:mm");

        ArrayList<Account> accounts = new ArrayList<>();
        File file = new File("accounts.json");
        if (file.exists()) {
            accounts = gson_to_arrayList_account(accounts);

            boolean edit_account = false;
            synchronized (accounts) {
                for (Account account : accounts) {
                    if (account.getAccount_number().equals(accountNumber)) {
                        ArrayList<String> profit = new ArrayList<>();
                        if (account.getMoney().compareTo(new BigDecimal(newMoney)) == -1) {

                            //source
                            profit.add("source account : BANK");

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

                            //condition
                            profit.add("condition : successful");

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
                            profit.add("destination account : BANK");

                            //condition
                            profit.add("condition : successful");

                            account.getFinancial_transactions().add(profit);
                        }
                        account.setMoney(newMoney);
                        System.out.println("money updated successfully!");
                        edit_account = true;
                        break;
                    }
                }
            }
            if (edit_account) {
                arrayList_to_gson_account(accounts);
            } else {
                System.out.println("there's no account with this number!");
            }
        } else {
            System.out.println("File not exist!");
        }
    }

    // editing customer's profile
    public void edit_customer_profile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer's nationalID:");

        String national = input.next();
        if (exist_customer(national)) {
            System.out.println("choose the information that you want to change:\n1.first name\n2.last name\n3.nationalID\n" +
                    "4.phone number\n5.gender\n6.birth date\n7.email\n8.address\n9.password");
            int number = input.nextInt();
            String str = input.next();

            ArrayList<Customer> customers = null;
            customers = gson_to_arrayList_customer(customers);

            synchronized (customers) {
                for (Customer customer : customers) {
                    if (customer.nationalID.equals(national)) {
                        if (number == 1) {
                            customer.firstName = str.toLowerCase();

                        } else if (number == 2) {
                            customer.lastName = str.toLowerCase();

                        } else if (number == 3) {
                            customer.nationalID = str;

                        } else if (number == 4) {
                            customer.phoneNumber = str;

                        } else if (number == 5) {
                            customer.gender = str;

                        } else if (number == 6) {
                            customer.birthDate = str;

                        } else if (number == 7) {
                            customer.email = str;

                        } else if (number == 8) {
                            customer.address = str.toLowerCase();

                        } else if (number == 9) {
                            customer.password = str;
                        }
                    }
                }
                arrayList_to_gson_customer(customers);
                System.out.println("customer edited successfully!");
            }
        } else {
            System.out.println("customer not found!");
        }
    }

    //READ ON FILE AND CONVERT TO STRING FOR CUSTOMER
    public ArrayList<Customer> gson_to_arrayList_customer(ArrayList customers) {
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

    //READ ON FILE AND CONVERT TO STRING FOR EMPLOYEE
    public ArrayList<Employee> gson_to_arrayList_employee(ArrayList employees) {
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

    // writing to gson employee file
    public static void arrayList_to_gson_employee(ArrayList employees) {
        Gson gson = new Gson();
        String result = gson.toJson(employees);
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

    // reading from gson account file
    public ArrayList<Account> gson_to_arrayList_account(ArrayList accounts) {
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

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "firstName : " + this.firstName + "\nlastName : " + this.lastName + "\nnationalID : " + this.nationalID +
                "\nphoneNumber : " + this.phoneNumber + "\ngender : " + this.gender + "\nemail : " + this.email +
                "\nbirthDate : " + this.birthDate + "\naddress : " + this.address;
    }
}