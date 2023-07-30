package com.company;

import java.awt.event.MouseEvent;

public class search_account_by_employee extends search_account {
    Employee employee;

    public search_account_by_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 12);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 13);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 14);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button4MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 15);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 16);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        manage_account_by_employee manage_account_by_employee = new manage_account_by_employee(employee);
        manage_account_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_account_by_employee.setVisible(true);
        dispose();
    }

}
