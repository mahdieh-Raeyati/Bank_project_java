package com.company;

import com.google.gson.annotations.SerializedName;

import javax.swing.*;
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

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    //ADD A employee
    public void make_employees_profile_file(Employee employee) {
        File employeeProfileFile = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        if (employeeProfileFile.exists()) {
            employees = gson_to_arrayList_employee(employees);
            System.out.println(employees.toString());
        }
        employees.add(employee);
        arrayList_to_gson_employee(employees);
        OK ok = new OK("employee created successfully!", 1);
        ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ok.setVisible(true);
        System.out.println();
    }

    // checking if a customer exist
    public void exit_customer(String ID) {
        String result = "";
        File customerfile = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<>();

        boolean customer_found = false;
        if (customerfile.exists()) {
            customers = gson_to_arrayList_customer(customers);
            for (Customer customer : customers) {
                if (customer.nationalID.equals(ID)) {
                    result = customer.toString();
                    customer_found = true;
                    break;
                }
            }
            if (customer_found) {
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(null);
                File file = fc.getSelectedFile();
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(result);
                    fileWriter.close();
                } catch (IOException e) {
                    OK ok = new OK("not successful!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            } else {
                OK ok = new OK("there is no customer with this ID!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);

            }
        } else {
            OK ok = new OK("no customer exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // checking if an account exist
    public void exit_account(String account_number) {
        File accountfile = new File("accounts.json");
        ArrayList<Account> accounts = new ArrayList<>();
        String result = "";
        boolean account_found = false;
        if (accountfile.exists()) {
            accounts = gson_to_arrayList_account(accounts);
            for (Account account : accounts) {
                if (account.getAccount_number().equals(account_number)) {
                    result = account.toString();
                    account_found = true;
                }
            }
            if (account_found) {
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(null);
                File file = fc.getSelectedFile();
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(result);
                    fileWriter.close();
                } catch (IOException e) {
                    OK ok = new OK("not successful!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            } else {
                OK ok = new OK("there is no account with this number!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("no account exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    // changing password of the employee
    public void change_password(String new_password) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new password:");

        File employeeprofileFile = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<>();
        if (employeeprofileFile.exists()) {

            employees = gson_to_arrayList_employee(employees);

            synchronized (employees) {
                for (Employee employee : employees) {
                    if (employee.nationalID.equals(this.nationalID)) {
                        employee.password = new_password;
                    }
                }
                OK ok = new OK("       password changed successfully!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
                arrayList_to_gson_employee(employees);
            }
        }
    }

    @Override
    public String toString() {
        return "      firstName : " + this.firstName + "\n" + "      lastName : " + this.lastName + "\n " + "     nationalID : " + this.nationalID + "\n" +
                "      phoneNumber : " + this.phoneNumber + "\n" + "      gender : " + this.gender + "\n" + "      email : " + this.email + "\n" +
                "      birthDate : " + this.birthDate + "\n" + "      address : " + this.address + "\n" + "     salary : " + this.salary
                + "\n" + "     ****************************************************************" + "\n";
    }
}

