package com.company;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        // the employee's ( virtual user ) information
        String firstName_employee = "khosro";
        String lastName_employee = "teimouri";
        String nationalID_employee = "0051234567";
        String phoneNumber_employee = "09123456789";
        String birthDate_employee = "1379/12/25";
        String gender_employee = "male";
        String email_employee = "teimouri@gmail.com";
        String address_employee = "baghche...";
        String password_employee = "Khosro123";
        String salary_employee = "1000000";

        Employee employee = new Employee(firstName_employee,lastName_employee,nationalID_employee, phoneNumber_employee
                ,birthDate_employee, gender_employee,email_employee,address_employee,password_employee, salary_employee);

        // calling some methods on the created user object
        employee.show_accounts_list();
        employee.exist_customer(nationalID_employee);
        employee.show_accounts_list();



        // the customer's ( virtual ) information
        String firstName_customer = "batool";
        String lastName_customer = "kalanaki";
        String nationalID_customer = "0051231230";
        String phoneNumber_customer = "09122323231";
        String birthDate_customer = "1345/2/17";
        String gender_customer = "female";
        String email_customer = "kalanaki@gmail.com";
        String address_customer = "los angeles...";
        String password_customer = "Batool123";

        Customer customer = new Customer(firstName_customer,lastName_customer,nationalID_customer,phoneNumber_customer,
                gender_customer,email_customer,birthDate_customer , address_customer,password_customer,null,
                null,null,null);


        // calling some methods on the created user object
        customer.make_customer_profile_file(customer);
        customer.show_available_account();
    }
}
