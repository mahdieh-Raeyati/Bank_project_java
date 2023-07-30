package com.company;

import java.awt.event.MouseEvent;

public class manage_account_by_employee extends account_pannel {
    Employee employee;

    public manage_account_by_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    //current account
    public void button1MouseClicked(MouseEvent e) {
        recive_nationalID_for_account recive_national_to_create_account = new recive_nationalID_for_account(2, 1);
        recive_national_to_create_account.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_to_create_account.setVisible(true);
    }

    @Override
    //back
    public void button9MouseClicked(MouseEvent e) {
        employee_main_menu employee_main_menu = new employee_main_menu(employee);
        employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        employee_main_menu.setVisible(true);
        dispose();
    }

    @Override
    //saving account
    public void button10MouseClicked(MouseEvent e) {
        recive_nationalID_for_account recive_national_to_create_account = new recive_nationalID_for_account(2, 2);
        recive_national_to_create_account.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_to_create_account.setVisible(true);
    }

    @Override
    //delet account
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 11);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);

    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        employee.show_accounts_list();
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        search_account_by_employee search_account_by_employee = new search_account_by_employee(employee);
        search_account_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        search_account_by_employee.setVisible(true);
        dispose();
    }

    @Override
    public void button7MouseClicked(MouseEvent e) {
        employee.show_transactions_list();
    }

    @Override
    public void button8MouseClicked(MouseEvent e) {
        search_transaction_by_employee search_transaction_by_employee = new search_transaction_by_employee(employee);
        search_transaction_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        search_transaction_by_employee.setVisible(true);
        dispose();
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 33);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }
}
