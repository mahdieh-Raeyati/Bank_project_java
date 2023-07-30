package com.company;

class MyRunnable implements Runnable {

    @Override
    public void run() {

        // the employee's ( virtual user ) information
        String firstName = "khosro";
        String lastName = "teimouri";
        String nationalID = "0051234567";
        String phoneNumber = "09123456789";
        String birthDate = "1379/12/25";
        String gender = "male";
        String email = "teimouri@gmail.com";
        String address = "baghche...";
        String password = "Khosro123";
        String salary = "1000000";

        Employee employee = new Employee(firstName,lastName,nationalID,phoneNumber,gender,email ,birthDate, address,password,salary);

        // calling methods on the created user object
        employee.employee_menu();
        employee.show_accounts_list();
        employee.change_password();
        employee.exit_account();
        employee.exit_customer();

    }

}
