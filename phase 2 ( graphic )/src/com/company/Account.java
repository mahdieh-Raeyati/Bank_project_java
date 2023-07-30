package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String account_number;
    private BigDecimal money;
    private String date_of_account_creation;
    private String last_deposit_interest;
    private ArrayList<ArrayList<String>> Financial_transactions;
    private ArrayList<ArrayList<String>> Periodic_transfer;
    private String type_of_account;
    private String nationalID;

    //constructor
    //constructor
    public Account(String type_of_account, String nationalID, String date_of_account_creation, String account_number,
                   String money, String last_deposit_interest, ArrayList<ArrayList<String>> Financial_transactions,
                   ArrayList<ArrayList<String>> Periodic_transfer) {
        this.type_of_account = type_of_account;
        this.nationalID = nationalID;
        this.date_of_account_creation = date_of_account_creation;
        this.account_number = account_number;
        this.money = new BigDecimal(money);
        this.last_deposit_interest = last_deposit_interest;
        this.Financial_transactions = Financial_transactions;
        this.Periodic_transfer = Periodic_transfer;
    }

    //getters
    public String getType_of_account() {
        return this.type_of_account;
    }

    public String getNationalID() {
        return this.nationalID;
    }

    public String getLast_deposit_interest() {
        return last_deposit_interest;
    }

    public ArrayList<ArrayList<String>> getFinancial_transactions() {
        return this.Financial_transactions;
    }

    public String getAccount_number() {
        return this.account_number;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public String getdate_of_account_creation() {
        return this.date_of_account_creation;
    }

    public ArrayList<ArrayList<String>> getPeriodic_transfer() {
        return Periodic_transfer;
    }

    //setters
    public void setLast_deposit_interest(String last_deposit_interest) {
        this.last_deposit_interest = last_deposit_interest;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setMoney(String money) {
        this.money = new BigDecimal(money);
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setDate_of_account_creation(String date_of_account_creation) {
        this.date_of_account_creation = date_of_account_creation;
    }

    public void setFinancial_transactions(ArrayList<ArrayList<String>> financial_transactions) {
        this.Financial_transactions = financial_transactions;
    }

    public void setType_of_account(String type_of_account) {
        this.type_of_account = type_of_account;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public static String create_account_number(String nationalID) {     //number : number Of Account
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyHHmmss");
        String number = myDateObj.format(myFormatObj1);
        return (nationalID + number);
    }

    // changing the amount of money
    public static void change_money(String account_number, String new_money) {
        String accountString = "";
        Gson gson = new Gson();
        ArrayList<Account> customers;
        File accountFile = new File("accounts.json");
        try {
            Scanner reader = new Scanner(accountFile);
            while (reader.hasNextLine()) {
                accountString += reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        customers = gson.fromJson(accountString, new TypeToken<ArrayList<Account>>() {
        }.getType());
        synchronized (customers) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).account_number.equals(account_number)) {
                    customers.get(i).setMoney(new_money);
                }
            }
        }
        String result = gson.toJson(customers);
        try {
            FileWriter customerWriter = new FileWriter("accounts.json");
            synchronized (customerWriter) {
                customerWriter.write(result);
                customerWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // calculating the profit of an account
    public void Profit() {
        LocalDate last = LocalDate.parse(last_deposit_interest);
        LocalDate now = LocalDate.now();
        Long range = ChronoUnit.DAYS.between(last, now);
        BigDecimal formula = new BigDecimal(0.15 * 30 / 365);

        while (range > 29) {
            range -= 30;
            last = last.plusMonths(1);
            this.last_deposit_interest = last.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            ArrayList<String> profit = new ArrayList<>();
            //source
            profit.add("source account : BANK");

            //date
            profit.add("date : " + this.last_deposit_interest);

            //time
            profit.add("time : 00:00");

            // amount of money transfer
            profit.add("money exchanged : +" + this.money.multiply(formula).setScale(3, RoundingMode.HALF_UP));

            //type
            profit.add("type : profit");

            //destination
            profit.add("destination account : " + this.account_number);

            this.Financial_transactions.add(profit);
            this.money = this.money.add(this.money.multiply(formula).setScale(3, RoundingMode.HALF_UP));
        }
    }

    // printing details of account
    public String print_accounts() {
        return "  account_number : " + this.account_number + "\n" + "  type of account : " + this.type_of_account + "\n" +
                "  date of account_creation :  " + this.date_of_account_creation + "\n" + "  money : " + this.money + "\n"
                + "  *******************************************************************" + "\n";
    }

    // setting the duration of auto transferring
    public ArrayList<Account> period(ArrayList<Account> accounts) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < this.Periodic_transfer.size(); i++) {
            if (!this.Periodic_transfer.get(i).get(4).equals("0")) {

                // account number
                String account_num = this.Periodic_transfer.get(i).get(0);

                // money
                BigDecimal money = new BigDecimal(this.Periodic_transfer.get(i).get(1));

                // date
                LocalDate last = LocalDate.parse(this.Periodic_transfer.get(i).get(2));

                // times
                int times = Integer.parseInt(this.Periodic_transfer.get(i).get(4));

                Long range = ChronoUnit.DAYS.between(last, now);

                // type
                if (this.Periodic_transfer.get(i).get(3).equals("weekly")) {
                    while (range > 6 && times > 0) {
                        times -= 1;
                        range -= 7;
                        last = last.plusWeeks(1);

                        accounts = record(account_num, money, last, accounts);
                        // date
                        this.Periodic_transfer.get(i).set(2, last.format(myFormatObj));

                        //times
                        this.Periodic_transfer.get(i).set(4, Integer.toString(times));
                    }
                } else {
                    while (range > 29 && times > 0) {
                        times -= 1;
                        range -= 30;
                        last = last.plusMonths(1);

                        accounts = record(account_num, money, last, accounts);
                        // date
                        this.Periodic_transfer.get(i).set(2, last.format(myFormatObj));

                        // times
                        this.Periodic_transfer.get(i).set(4, Integer.toString(times));
                    }
                }
            } else {
                this.Periodic_transfer.remove(this.Periodic_transfer.get(i));
            }
        }
        return accounts;
    }

    // saving the type of duration
    public ArrayList<Account> record(String account_num, BigDecimal money, LocalDate last, ArrayList<Account> accounts) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        synchronized (accounts) {
            for (Account account : accounts) {
                if (account.getAccount_number().equals(account_num)) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<String> arrayList1 = new ArrayList<>();

                    //source
                    arrayList.add("source account : " + this.account_number);
                    arrayList1.add("source account : " + this.account_number);

                    //date
                    arrayList.add("date : " + last.format(myFormatObj));
                    arrayList1.add("date : " + last.format(myFormatObj));

                    //time
                    arrayList.add("time : 00:00");
                    arrayList1.add("time : 00:00");

                    // amount of money transfer
                    arrayList.add("money exchanged : +" + money.toString());
                    arrayList1.add("money exchanged : -" + money.toString());

                    //type
                    arrayList.add("type : deposit");
                    arrayList1.add("type : removal");

                    //destination
                    arrayList.add("destination account : " + account.account_number);
                    arrayList1.add("destination account : " + account.account_number);

                    // condition
                    if (this.money.compareTo(money) != -1) {
                        arrayList.add("condition : successful");
                        arrayList1.add("condition : successful");
                        this.money = this.money.subtract(money);
                        account.setMoney(account.getMoney().add(money));
                    } else {
                        arrayList.add("condition : unsuccessful");
                        arrayList1.add("condition : unsuccessful");
                    }

                    account.getFinancial_transactions().add(arrayList);
                    this.getFinancial_transactions().add(arrayList1);
                }
            }
            return accounts;
        }
    }

    @Override
    public String toString() {
        String result = "account_number : " + this.account_number + "\ntype of account : " + this.type_of_account + "\nnationalID: "
                + this.nationalID + "\ndate_of_account_creation :  " + this.date_of_account_creation + "\nmoney : " + this.money;

        for (int i = 0; i < this.Periodic_transfer.size(); i++) {
            result += "\ncontinuous deposit :\n";
            result += "source account number : " + this.Periodic_transfer.get(i).get(0);
            result += "\na mount of money : " + this.Periodic_transfer.get(i).get(1);
            result += "\ndate : " + this.Periodic_transfer.get(i).get(2);
            result += "\ntype : " + this.Periodic_transfer.get(i).get(3);
            result += "\ntimes : " + this.Periodic_transfer.get(i).get(4);
        }
        result += "\n\n************************************************************************\n";
        return result;
    }
}
