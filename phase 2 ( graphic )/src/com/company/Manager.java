package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.print.Collation;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager extends Member {


    public Manager(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email,
                   String birthDate, String address, String password) {
        super(firstName, lastName, nationalID, phoneNumber, gender, email, birthDate, address, password);
    }

    public void make_manager_profile_file(Manager manager) {
        String data = "";
        Gson gson = new Gson();
        File customerprofileFile = new File("manager profile.json");
        ArrayList<Manager> customers = new ArrayList<Manager>();
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
            customers = gson.fromJson(data, new TypeToken<ArrayList<Manager>>() {
            }.getType());
        }
        customers.add(manager);
        String result = gson.toJson(customers);
        try {
            FileWriter cWriter = new FileWriter("manager profile.json");
            cWriter.write(result);
            cWriter.close();
            System.out.println("manager created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //SEARCH AMONG EMPLOYEES
    public void search_employee(Manager manager, String str, int number) {
        String result = "";
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;
        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);

            boolean employee_found = false;
            boolean found = false;
            for (Employee employee : employees) {
                if (number == 1) {
                    employee_found = employee.firstName.equals(str);

                } else if (number == 2) {
                    employee_found = employee.lastName.equals(str);

                } else if (number == 3) {
                    employee_found = employee.nationalID.equals(str);

                } else if (number == 4) {
                    employee_found = employee.phoneNumber.equals(str);

                } else if (number == 5) {
                    employee_found = employee.gender.equals(str);

                } else if (number == 6) {
                    employee_found = employee.email.equals(str);

                } else if (number == 7) {
                    employee_found = employee.birthDate.equals(str);

                } else if (number == 8) {
                    employee_found = employee.address.equals(str);

                }

                if (employee_found) {
                    result += employee.toString() + "\n";
                    found = true;
                }
            }
            if (found) {

                show_result_for_manager show_result_for_manager = new show_result_for_manager(manager, result, 2);
                show_result_for_manager.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                show_result_for_manager.setVisible(true);
            } else {
                search_employee_by_manager search_employee_by_manager = new search_employee_by_manager(manager);
                search_employee_by_manager.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                search_employee_by_manager.setVisible(true);
                OK ok = new OK("        employee not found!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            search_employee_by_manager search_employee_by_manager = new search_employee_by_manager(manager);
            search_employee_by_manager.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            search_employee_by_manager.setVisible(true);
            OK ok = new OK("         no employee exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);

        }
    }

    //READ ON FILE AND CONVERT TO STRING FOOOOR EMPLOYEE
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

    //show list of employees
    public void show_employees_list() {
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;
        if (file.exists()) {
            String result = "";
            employees = gson_to_arrayList_employee(employees);
            Collections.sort(employees, Comparator.comparing(Employee::getLastName));

            for (Employee employee : employees) {
                result += employee.toString();
            }
            just_show just_show = new just_show(result);
            just_show.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            just_show.setVisible(true);
        } else {
            OK ok = new OK("No employee exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);

        }
    }

    // deleting an employee
    public void delete_employee_profile(String employeeId) {
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);
            System.out.println(employees.toString());
            Boolean deletedEmployee = false;
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).nationalID.equals(employeeId)) {
                    employees.remove(i);
                    OK ok = new OK("Deleted successfully!", 1);
                    ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    deletedEmployee = true;
                    break;
                }
            }
            if (deletedEmployee) {
                arrayList_to_gson_employee(employees);
            } else {
                OK ok = new OK("there's no employee with this id!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("No employee exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);

        }
    }

    public void edit_employee_profile(String nationalID, Employee employee_) {

        ArrayList<Employee> employees = null;
        employees = gson_to_arrayList_employee(employees);

        for (Employee employee : employees) {
            if (employee.nationalID.equals(nationalID)) {
                employees.remove(employee);
                break;
            }
        }
        employees.add(employee_);
        arrayList_to_gson_employee(employees);
    }

    public void change_password(String password, Manager manager) {
        String data = "";
        Gson gson = new Gson();
        File managerprofileFile = new File("manager profile.json");
        ArrayList<Manager> managers = new ArrayList<Manager>();
        if (managerprofileFile.exists()) {
            try {
                Scanner reader = new Scanner(managerprofileFile);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            managers = gson.fromJson(data, new TypeToken<ArrayList<Manager>>() {
            }.getType());

            managers.get(0).password = password;
            String result = gson.toJson(managers);
            try {
                FileWriter cWriter = new FileWriter("manager profile.json");
                cWriter.write(result);
                cWriter.close();
                manager_main_menu manager_main_menu = new manager_main_menu(manager);
                manager_main_menu.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                manager_main_menu.setVisible(true);
                OK ok = new OK("your password changed successfully!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            OK ok = new OK("no file exist!", 1);
            ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }


}