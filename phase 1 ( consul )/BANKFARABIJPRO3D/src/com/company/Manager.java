package com.company;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Manager extends Member {

    public Manager(String firstName, String lastName, String nationalID, String phoneNumber, String gender, String email,
                   String birthDate, String address, String password) {
        super(firstName, lastName, nationalID, phoneNumber, gender, email, birthDate, address, password);
    }

    //   menu
    public void manager_menu() {
        Main.made_of_manager = true;
        Main.made_of_customer = false;
        Main.made_of_employee = false;
        Main.manager = false;
        Scanner input = new Scanner(System.in);
        System.out.println("1.add a new employee" + "\n" + "2.edit an employee" + "\n" + "3.delete an employee" + "\n" +
                "4.add a new customer" + "\n" + "5.edit a customer" + "\n" + "6.delete a customer" + "\n" + "7.add a new account" +
                "\n" + "8.edit an account" + "\n" + "9.delete an account" + "\n" + "10.search employees" + "\n" +
                "11.search customers" + "\n" + "12.search accounts" + "\n" + "13.list of employees" + "\n" +
                "14.list of customers" + "\n" + "15.list of accounts" + "\n" + "16.Change password " + "\n" + "17.list of transactions"
                + "\n" + "18.search transaction" + "\n" + "19.Exit");

        int number = input.nextInt();
        if (number == 1) {
            Main.employee = true;
            Main.customer = false;
            Main.sign_up();
            manager_menu();

        } else if (number == 2) {
            edit_employee_profile();
            manager_menu();

        } else if (number == 3) {
            delete_employee_profile();
            manager_menu();

        } else if (number == 4) {
            Main.customer = true;
            Main.employee = false;
            Main.sign_up();
            manager_menu();

        } else if (number == 5) {
            edit_customer_profile();
            manager_menu();

        } else if (number == 6) {
            delete_customer_profile();
            manager_menu();

        } else if (number == 7) {
            System.out.println("Enter the nationalID :");
            String nationalID = input.next();
            create_account(nationalID);
            manager_menu();

        } else if (number == 8) {
            edit_account();
            manager_menu();

        } else if (number == 9) {
            System.out.println("Enter the account number that you want to remove :");
            String account_Number = input.next();
            delete_account(account_Number);
            manager_menu();

        } else if (number == 10) {
            search_employee();
            manager_menu();

        } else if (number == 11) {
            search_customer(false);
            manager_menu();

        } else if (number == 12) {
            search_account();
            manager_menu();

        } else if (number == 13) {
            show_employees_list();
            manager_menu();

        } else if (number == 14) {
            show_customers_list();
            manager_menu();

        } else if (number == 15) {
            show_accounts_list();
            manager_menu();

        } else if (number == 16) {
            change_password();
            manager_menu();

        } else if (number == 17) {
            show_transactions_list();
            manager_menu();

        }else if (number == 18) {
            search_transaction();
            manager_menu();

        }else {
            System.exit(0);
        }
    }

    public void change_password(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new password:");

        String data = "";
        Gson gson = new Gson();
        File managerProfileFile = new File("manager profile.json");
        ArrayList<Manager> managers;
        if (managerProfileFile.exists()) {
            try {
                Scanner reader = new Scanner(managerProfileFile);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            managers = gson.fromJson(data, new TypeToken<ArrayList<Manager>>() {
            }.getType());
            managers.get(0).password = scanner.next();
            String result = gson.toJson(managers);
            try {
                FileWriter cWriter = new FileWriter("manager profile.json");
                synchronized (cWriter) {
                    cWriter.write(result);
                    cWriter.close();
                    System.out.println("password edited successfully!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File does not exist!");
        }
    }

    // deleting an employee
    public void delete_employee_profile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee id that you want to remove:");
        String employeeId = input.next();
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;
        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);

            Boolean deletedEmployee = false;
            synchronized (employees) {
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).nationalID.equals(employeeId)) {
                        System.out.println("are you sure you want to delete this employee?\n1.Yes\n2.No");
                        int item = input.nextInt();
                        if(item == 1) {
                            employees.remove(i);
                            System.out.println("Deleted successfully!");
                            deletedEmployee = true;
                            break;
                        }
                        else{
                            System.out.println("operation cancelled!");
                        }
                    }
                }
                if (deletedEmployee) {
                    arrayList_to_gson_employee(employees);
                } else {
                    System.out.println("there's no employee with this id!");
                }
            }
        } else {
            System.out.println("File does not exist!");
        }
    }

    //making file for manager
    public void make_manager_profile_file(Manager manager){
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
        }
        managers.add(manager);
        String result = gson.toJson(managers);
        try {
            FileWriter cWriter = new FileWriter("manager profile.json");
            synchronized (cWriter) {
                cWriter.write(result);
                cWriter.close();
                System.out.println("manager created successfully!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //SEARCH AMONG EMPLOYEES
    public void search_employee() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.First name\n2.Last name\n3.NationalID\n4.PhoneNumber\n5.Gender\n6.Email\n7.BirthDate\n" +
                "8.Address\n9.Salary");
        int number = input.nextInt();
        String str = input.next();

        String result = "";
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;

        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);

            boolean employee_found = false;
            boolean found = false;
            for (Employee employee : employees) {
                if (number == 1) {
                    employee_found = employee.firstName.equals(str.toLowerCase());

                } else if (number == 2) {
                    employee_found = employee.lastName.equals(str.toLowerCase());

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
                    employee_found = employee.address.equals(str.toLowerCase());

                }else if (number==9){
                    employee_found = employee.getSalary().equals(str);

                }

                if (employee_found) {
                    result += employee.toString() + "\n";
                    found = true;
                }
            }
            if (found) {
                System.out.println(result);
            } else {
                System.out.println("employee not found!");
            }
        } else {
            System.out.println("File not exist!");
        }
    }


    // printing  employees list
    public void show_employees_list() {
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;
        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);
            Collections.sort(employees , Comparator.comparing(Employee::getLastName));

            for (Employee employee : employees) {
                System.out.println(employee.toString() + "\n");
            }
        } else {
            System.out.println("No employee exist!");
        }
    }


    public void edit_employee_profile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's nationalID:");

        String national = input.next();
        if (exist_employee(national)) {
            System.out.println("choose the information that you want to change:\n1.first name\n2.last name\n3.nationalID" +
                    "\n4.phone number\n5.gender\n6.birth date\n7.email\n8.address\n9.password\n10.salary");
            int number = input.nextInt();
            String str = input.next();

            ArrayList<Employee> employees = null;
            employees = gson_to_arrayList_employee(employees);

            for (Employee employee : employees) {
                if (employee.nationalID.equals(national)) {
                    if (number == 1) {
                        employee.firstName =str.toLowerCase();

                    } else if (number == 2) {
                        employee.lastName = str.toLowerCase();

                    } else if (number == 3) {
                        employee.nationalID = str;

                    } else if (number == 4) {
                        employee.phoneNumber = str;

                    } else if (number == 5) {
                        employee.gender = str;

                    } else if (number == 6) {
                        employee.birthDate = str;

                    } else if (number == 7) {
                        employee.email = str;

                    } else if (number == 8) {
                        employee.address = str.toLowerCase();

                    } else if (number == 9) {
                        employee.password = str;
                    }else if (number == 10){
                        employee.setSalary(str);
                    }
                }
            }
            arrayList_to_gson_employee(employees);
            System.out.println("employee edited successfully!");
        }else {
            System.out.println("employee not found!");
        }
    }

    // checking if an employee exist
    public boolean exist_employee(String nationalID){
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = null;

        if (file.exists()) {
            employees = gson_to_arrayList_employee(employees);
            for (Employee employee : employees){
                if (employee.nationalID.equals(nationalID)){
                    return true;
                }
            }
        }else {
            System.out.println("File not exist!");
        }
        return false;
    }
}