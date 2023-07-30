package com.company;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int counter = 0;

    public static void main(String[] args) {                  // first user ( real )

        // threads are commented inorder to let the program runs properly

         /*Thread thread1 = new Thread(new MyRunnable());       // second user ( virtual )
         thread1.start();

         Thread thread2 = new Thread(new MyRunnable());       // third user ( virtual )
         thread2.start();*/

        login();
    }

    public static void login() {
        loginpage loginpage = new loginpage();
        loginpage.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        loginpage.setVisible(true);
    }

    public static void password_recovery(String nationalID, String favorite_animal, String favorite_country,
                                         String favorite_color, String favorite_fruit) {

        String data = "";
        Gson gson = new Gson();
        File customerprofileFile = new File("customer profile.json");
        ArrayList<Customer> customers;
        if (customerprofileFile.exists()) {
            try {
                Scanner reader = new Scanner(customerprofileFile);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            customers = gson.fromJson(data, new TypeToken<ArrayList<Customer>>() {
            }.getType());

            boolean found = false;
            synchronized (customers) {
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).favorite_animal.equals(favorite_animal) && customers.get(i).favorite_color.equals(favorite_color)
                            && customers.get(i).favorite_country.equals(favorite_country) && customers.get(i).favorite_fruit.equals(favorite_fruit)
                            && customers.get(i).nationalID.equals(nationalID)) {
                        found = true;
                        password_pannel_customer password_pannel_customer = new password_pannel_customer(customers.get(i), 2);
                        password_pannel_customer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        password_pannel_customer.setVisible(true);
                    }
                }
            }
            if (!found) {
                OK ok = new OK("   not found!", 2);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);

            }
        }
    }

    public static void sign_up(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email
            , String birthdate, String address) {
        Customer customer = new Customer(firstName, lastName, nationalID, phoneNumber, gender, email, birthdate, address,
                "password", "animal", "country", "color", "fruit");
        password_pannel_customer password_pannel_customer = new password_pannel_customer(customer, 1);
        password_pannel_customer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        password_pannel_customer.setVisible(true);
    }

    public static void sign_in(String username, String password) {
        try {
            Gson gson = new Gson();
            File customerfile = new File("customer profile.json");
            File managerfile = new File("manager profile.json");
            File adminfile = new File("admin profile.json");
            File employeefile = new File("employee profile.json");

            boolean found = false;
            if (adminfile.exists()) {
                String admininformation = "";
                ArrayList<Admin> admin;
                try {
                    Scanner reader = new Scanner(adminfile);
                    while (reader.hasNextLine()) {
                        admininformation += reader.nextLine();
                    }
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                admin = gson.fromJson(admininformation, new TypeToken<ArrayList<Admin>>() {
                }.getType());
                if (!(admin.size() == 0)) {
                    if (username.equals(admin.get(0).getNationalID()) && (password.equals(admin.get(0).getPassword()))) {
                        Admin_menue admin_menue = new Admin_menue(admin.get(0));
                        admin_menue.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        admin_menue.setVisible(true);
                        found = true;
                    }
                }
            }
            if (managerfile.exists() && !found) {
                String managerformation = "";
                ArrayList<Manager> manager;
                try {
                    Scanner reader = new Scanner(managerfile);
                    while (reader.hasNextLine()) {
                        managerformation += reader.nextLine();
                    }
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                manager = gson.fromJson(managerformation, new TypeToken<ArrayList<Manager>>() {
                }.getType());

                for (int i = 0; i < manager.size(); i++) {
                    if (manager.get(i).nationalID.equals(username) && manager.get(i).password.equals(password)) {
                        manager.get(i).checker();
                        manager_main_menu manager_main_menu = new manager_main_menu(manager.get(i));
                        manager_main_menu.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        manager_main_menu.setVisible(true);
                        found = true;
                        break;
                    }
                }
            }
            if (employeefile.exists() && !found) {
                String employeeinformation = "";
                ArrayList<Employee> employees;
                try {
                    Scanner reader = new Scanner(employeefile);
                    while (reader.hasNextLine()) {
                        employeeinformation += reader.nextLine();
                    }
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                employees = gson.fromJson(employeeinformation, new TypeToken<ArrayList<Employee>>() {
                }.getType());
                for (int i = 0; i < employees.size(); i++) {

                    if (employees.get(i).nationalID.equals(username) && employees.get(i).password.equals(password)) {
                        employees.get(i).checker();
                        employee_main_menu employee_main_menu = new employee_main_menu(employees.get(i));
                        employee_main_menu.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        employee_main_menu.setVisible(true);
                        found = true;
                        break;
                    }
                }
            }
            if (customerfile.exists()) {
                String customerinformation = "";
                ArrayList<Customer> customers;
                try {
                    Scanner reader = new Scanner(customerfile);
                    while (reader.hasNextLine()) {
                        customerinformation += reader.nextLine();
                    }
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                customers = gson.fromJson(customerinformation, new TypeToken<ArrayList<Customer>>() {
                }.getType());

                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(username) && customers.get(i).password.equals(password)) {
                        customers.get(i).checker();
                        Customer_menu customer_pannel = new Customer_menu(customers.get(i));
                        customer_pannel.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        customer_pannel.setVisible(true);
                        found = true;
                    }
                }
            }
            if (!found) {
                counter++;
                if (counter < 4) {
                    login();
                    OK ok = new OK("            not found!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                } else {
                    System.exit(0);
                }
            }
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

    }
}