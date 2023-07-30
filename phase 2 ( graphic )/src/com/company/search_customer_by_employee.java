package com.company;

import java.awt.event.MouseEvent;

public class search_customer_by_employee extends search_human {
    Employee employee;

    public search_customer_by_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 1);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button9MouseClicked(MouseEvent e) {
        manage_customer_by_employee manage_customwe_by_employee = new manage_customer_by_employee(employee);
        manage_customwe_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customwe_by_employee.setVisible(true);
        dispose();
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 2);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 3);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button4MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 4);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 5);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 6);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button7MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 7);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }

    @Override
    public void button8MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 8);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
    }


}
