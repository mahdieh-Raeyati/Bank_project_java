package com.company;

import java.awt.event.MouseEvent;

public class full_search_by_employee extends search_human {
    Employee employee;

    public full_search_by_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 23);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 24);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 25);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button4MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 26);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 27);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 28);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button7MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 29);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button8MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 30);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    @Override
    public void button9MouseClicked(MouseEvent e) {
        employee_main_menu employee_main_menu = new employee_main_menu(employee);
        employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        employee_main_menu.setVisible(true);
        dispose();
    }
}
