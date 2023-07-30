package com.company;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Member {

    @SerializedName("Salary")
    private String salary;

    public Employee(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email,
                    String birthDate, String address, String password, String salary) {
        super(firstName, lastName, nationalID, phoneNumber, gender, email, birthDate, address, password);
        this.salary = salary;
    }

    public void employee_menu() {
        Main.made_of_employee = true;
        Main.made_of_customer = false;
        Main.made_of_manager = false;
        Main.employee = false;
        Main.manager = false;
        Scanner input = new Scanner(System.in);

        System.out.println("1.add a new customer\n2.edit an customer\n3.delete an customer\n4.list of customers\n" +
                "5.search customers\n6.add a new account\n7.edit an account\n8.delete an account\n9.list of accounts\n" +
                "10.search accounts\n11.list of transactions\n12.search transaction\n13.search\n14.money transfer\n" +
                "15.exit the status customer\n16.exit the status account\n17.change password\n18.Exit");

        int number = input.nextInt();
        if (number == 1) {
            Main.customer = true;
            Main.sign_up();
            employee_menu();

        } else if (number == 2) {
            edit_customer_profile();
            employee_menu();

        } else if (number == 3) {
            delete_customer_profile();
            employee_menu();

        } else if (number == 4) {
            show_customers_list();
            employee_menu();

        } else if (number == 5) {
            search_customer(false);
            employee_menu();

        } else if (number == 6) {
            System.out.println("Enter the nationalID :");
            String nationalID = input.nextLine();
            create_account(nationalID);
            employee_menu();

        } else if (number == 7) {
            edit_account();
            employee_menu();

        } else if (number == 8) {
            System.out.println("Enter the account number that you want to remove :");
            String account_Number = input.next();
            delete_account(account_Number);
            employee_menu();

        } else if (number == 9) {
            show_accounts_list();
            employee_menu();

        } else if (number == 10) {
            search_account();
            employee_menu();

        } else if (number == 11) {
            show_transactions_list();
            employee_menu();

        } else if (number == 12) {
            search_transaction();
            employee_menu();

        } else if (number == 13) {
            search_customer(true);
            employee_menu();

        } else if (number == 14) {
            transfer_money();
            employee_menu();

        } else if (number == 15) {
            exit(exit_customer());
            employee_menu();

        } else if (number == 16) {
            exit(exit_account());
            employee_menu();

        } else if (number == 17) {
            change_password();
            employee_menu();

        } else {
            System.exit(0);
        }
    }

    // changing the password of employee
    public void change_password() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new password :");

        File employeeprofileFile = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<>();
        if (employeeprofileFile.exists()) {
            employees = gson_to_arrayList_employee(employees);

            synchronized (employees) {
                for (Employee employee : employees) {
                    if (employee.nationalID.equals(this.nationalID)) {
                        employee.password = scanner.next();
                    }
                }
                arrayList_to_gson_employee(employees);
                System.out.println("password changed successfully!");
            }
        }
    }

    // checking if an account exist
    public String exit_account() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String account_number = input.next();
        File accountFile = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();

        if (accountFile.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                if (account.getAccount_number().equals(account_number)) {
                    return account.toString();
                }
            }
        }
        return "No account's file exist!";
    }

    // checking if a customer exist
    public String exit_customer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nationalID:");
        String ID = input.next();
        File customerFile = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();

        if (customerFile.exists()) {
            customers = gson_to_arrayList_customer(customers);

            for (Customer customer : customers) {
                if (customer.nationalID.equals(ID)) {
                    return customer.toString();
                }
            }
        }
        return "No customer's file exist!";
    }

    // exit file
    public void exit(String result) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired name and path like this => C:\\Users\\MyName\\filename.txt");
        String file = input.next();
        try {
            File myObj = new File(file);
            if (myObj.createNewFile()) {
                System.out.println("file created successfully!");
                FileWriter myWriter = new FileWriter(file);
                synchronized (myWriter) {
                    myWriter.write(result);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file!");
                }
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //ADD A employee
    public void make_employees_profile_file(Employee employee) {

        File employeeProfileFile = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        if (employeeProfileFile.exists()) {
            employees = gson_to_arrayList_employee(employees);
        }
        synchronized (employee) {
            employees.add(employee);
            arrayList_to_gson_employee(employees);
            System.out.println("employee created successfully!");
        }
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "firstName : " + this.firstName + "\nlastName : " + this.lastName + "\nnationalID : " + this.nationalID +
                "\nphoneNumber : " + this.phoneNumber + "\ngender : " + this.gender + "\nemail : " + this.email + "\nbirthDate : "
                + this.birthDate + "\naddress : " + this.address + "\nsalary : " + this.salary + "\npassword : " + this.password;
    }
}