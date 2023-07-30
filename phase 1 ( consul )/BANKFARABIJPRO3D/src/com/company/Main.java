package com.company;
import java.io.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //static's boolean to show who is doing what
    static boolean made_of_customer = true;
    static boolean customer = false;
    static boolean employee = false;
    static boolean manager = false;
    static boolean made_of_manager = false;
    static boolean made_of_employee = false;

    public static void main(String[] args) {                 // first user ( real )

        // threads are commented inorder to let the program runs properly

        /** Thread thread1 = new Thread(new MyRunnable());       // second user ( virtual )
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());       // third user ( virtual )
        thread2.start(); **/

        login();
    }

    // the login menu is shown when the program runs
    public static void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.sign in\n2.sign up\n3.forgot your password?(for customers only)");
        int number = input.nextInt();
        if (number == 1) {
            sign_in();

        } else if (number == 2) {
            sign_up();

        } else if (number == 3) {
            password_recovery();
        }
    }

    //signing up as a new member
    public static void sign_up() {
        Scanner input = new Scanner(System.in);
        // RESULT OF ERRORS
        String result = "Please :\n";

        // FIRST NAME
        Boolean NAME = true;
        System.out.println("Enter your desired first name :(just letters or space)");
        String firstName = input.nextLine();
        if (!firstName.matches("[a-zA-Z- ]+")) {
            NAME = false;
            result += "Enter your desired first name correctly\n";
        }

        // LAST NAME
        Boolean LNAME = true;
        System.out.println("Enter your desired last name :(just letters or space)");
        String lastName = input.nextLine();
        if (!lastName.matches("[a-zA-Z- ]+")) {
            LNAME = false;
            result += "Enter your desired last name correctly\n";
        }

        // NATIONAL ID
        Boolean NID = true;
        System.out.println("Enter your desired nationalID :(just 10 numbers)");
        String nationalID = input.nextLine();
        if (!((nationalID.length() == 10) && (nationalID.matches("[0-9]+")))) {
            NID = false;
            result += "Enter your desired nationalID correctly in 10 character\n";
        }

        // DON'T ENTER DUPLICATE ID
        if (NID && made_of_customer) {
            String data = "";
            Gson gson = new Gson();
            File customerprofileFile = new File("customer profile.json");
            ArrayList<Customer> customers = new ArrayList<Customer>();
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
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(nationalID)) {
                        NID = false;
                        result += "There is an account with this nationalID !\n";
                    }
                }
            }
        }

        // PHONE NUMBER
        Boolean PHONE = true;
        System.out.println("Enter your desired PhoneNumber :(just 11 numbers)");
        String phoneNumber = input.nextLine();
        if (!((phoneNumber.length() == 11) && (phoneNumber.matches("[0-9]+")))) {
            PHONE = false;
            result += "Enter your desired PhoneNumber correctly in 11 character\n";
        }

        // GENDER
        String gender = "";
        System.out.println("1.female\n2.male");
        int Number = input.nextInt();
        if (Number == 1) gender = "female";
        else gender = "male";

        // EMAIL
        Boolean EMAIL = true;
        System.out.println("Enter your desired email :(don't forget @ and .)");
        String email = input.next();
        if (!((email.contains("@") && email.contains(".")))) {
            EMAIL = false;
            result += "Enter your desired email correctly\n";
        }

        // BIRTH DATE
        Boolean BDATE = true;
        System.out.println("Enter BirthDate like : 1379/7/15");
        String birthDate = input.next();
        String year;
        String month;
        String day;
        int Day;
        int Month;
        int Year;
        if (birthDate.contains("/")) {
            year = birthDate.substring(0, birthDate.indexOf("/"));
            month = birthDate.substring(birthDate.indexOf("/") + 1);
            if (month.contains("/")) {
                day = month.substring(month.indexOf("/") + 1);
                month = month.substring(0, month.indexOf("/"));
                try {
                    Day = Integer.parseInt(day);
                    Month = Integer.parseInt(month);
                    Year = Integer.parseInt(year);
                    if (!((Day > 0 & Day < 32 && Month > 0 && Month < 13 && Year > 1280 && Year < 1400))) {
                        BDATE = false;
                        result += "Enter BirthDate like : 1379/7/15\n";
                    }
                } catch (Exception e) {
                    BDATE = false;
                    result += "Enter BirthDate like : 1379/7/15\n";
                }
            } else {
                BDATE = false;
                result += "Enter BirthDate like : 1379/7/15\n";
            }
        } else {
            BDATE = false;
            result += "Enter birthDate like : 1379/7/15\n";
        }

        // ADDRESS
        Boolean ADDRESS = true;
        System.out.println("Enter address:");
        String address = input.next();

        // PASSWORD
        Boolean PASSWORD = true;
        System.out.println("Enter your desired password :(combination of numbers, uppercase and lowercase letters in at least 7 numbers)");
        String password_ = input.next();
        boolean number = false;
        if (password_.length() >= 7) {
            for (int i = 0; i < password_.length(); i++) {
                if (password_.charAt(i) >= 48 && password_.charAt(i) <= 57) {
                    number = true;
                    break;
                }
            }
            if (!(number && !password_.toLowerCase().equals(password_))) {
                PASSWORD = false;
                result += "Enter your desired password in a combination of numbers, uppercase and lowercase letters!\n";

            }
        } else {
            PASSWORD = false;
            result += "Enter your password in a combination of numbers, uppercase and lowercase letters!\n";
        }

        // SIGN UP
        if (made_of_customer) {

            //SECURITY QUESTIONS
            String favorite_animal = "";
            System.out.println("Choose your favorite animal:\n1.Dog\n2.Cat\n3.Parrot\n4.Hamster");
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
            System.out.println("Choose your favorite country:\n1.France\n2.Australia\n3.Japan\n4.Brazil");
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
            System.out.println("Choose your favorite color:\n1.Blue\n2.Red\n3.Green\n4.Orange");
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
            System.out.println("Choose your favorite fruit:\n1.Banana\n2.Apple\n3.Orange\n4.Grapes");
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

            // Did you make a mistake or not?
            if (!(NAME && LNAME && NID && PHONE && EMAIL && BDATE && ADDRESS && PASSWORD)) {
                System.out.println(result);
                sign_up();
            } else {
                Customer customer = new Customer(firstName.toLowerCase(), lastName.toLowerCase(), nationalID, phoneNumber, gender, email, birthDate, address.toLowerCase(),
                        password_, favorite_animal, favorite_country, favorite_color, favorite_fruit);
                customer.make_customer_profile_file(customer);
            }
        }

        // REGISTRATION MANAGER
        if (manager) {
            if (!(NAME && LNAME && NID && PHONE && EMAIL && BDATE && ADDRESS && PASSWORD)) {
                System.out.println(result);
                sign_up();
            } else {
                Manager manager_ = new Manager(firstName.toLowerCase(), lastName.toLowerCase(), nationalID, phoneNumber, gender, email, birthDate, address.toLowerCase(),
                        password_);
                manager_.make_manager_profile_file(manager_);
            }

            // REGISTRATION EMPLOYEE
        } else if (employee) {
            if (!(NAME && LNAME && NID && PHONE && EMAIL && BDATE && ADDRESS && PASSWORD)) {
                System.out.println(result);
                sign_up();
            } else {
                Employee employee_ = new Employee(firstName.toLowerCase(), lastName.toLowerCase(), nationalID, phoneNumber, gender, email, birthDate, address.toLowerCase(),
                        password_, "40000000");
                employee_.make_employees_profile_file(employee_);
            }

            // REGISTRATION CUSTOMER
        } else if (customer) {
            if (!(NAME && LNAME && NID && PHONE && EMAIL && BDATE && ADDRESS && PASSWORD)) {
                System.out.println(result);
                sign_up();
            } else {
                Customer customer_ = new Customer(firstName.toLowerCase(), lastName.toLowerCase(), nationalID, phoneNumber, gender, email, birthDate, address.toLowerCase(),
                        password_, "null", "null", "null", "null");
                customer_.make_customer_profile_file(customer_);
            }
        }

    }

    // signing up if the member exist
    public static void sign_in() {
        Scanner input = new Scanner(System.in);
        System.out.println("username :");
        String username = input.nextLine();
        System.out.println("password :");
        String password = input.nextLine();
        try {
            Gson gson = new Gson();
            File adminfile = new File("admin profile.json");
            File managerfile = new File("manager profile.json");
            File employeefile = new File("employee profile.json");
            File customerfile = new File("customer profile.json");

            // IS HE/SHE ADMIN?
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
                for (int i = 0; i < admin.size(); i++) {
                    if (admin.get(i).getNationalID().equals(username) && admin.get(i).getPassword().equals(password)) {
                        admin.get(i).admin_menu();
                        break;
                    }
                }
            }

            // IS HE/SHE MANAGER?
            if (managerfile.exists()) {
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
                        manager.get(i).manager_menu();
                    }
                }
            }

            // IS HE/SHE EMPLOYEE?
            if (employeefile.exists()) {
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
                        employees.get(i).employee_menu();
                    }
                }
            }

            // IS HE/SHE CUSTOMER?
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
                        customers.get(i).customer_menu();
                    }
                }
            }

            // NOT FOUND!
            else {
                System.out.println("Not found!");
                login();
            }
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
    }

    // the method runs in order to change the forgotten password
    public static void password_recovery() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your national ID :");
        String nationalID = input.nextLine();
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
            boolean correct = false;
            synchronized (customers) {
                for (Customer customer : customers) {
                    if (customer.getFavorite_animal().equals(favorite_animal) && customer.getFavorite_color().equals(favorite_color) && customer.getFavorite_country().equals(favorite_country) && customer.getFavorite_fruit().equals(favorite_fruit) && customer.nationalID.equals(nationalID)) {
                        customer.change_password();
                        correct = true;
                    }
                }
                if (!correct){
                    System.out.println("sorry, try again!");
                }
            }
        }
    }
}