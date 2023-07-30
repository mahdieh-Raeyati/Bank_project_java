package com.company;

import java.awt.event.MouseEvent;

public class transfermoney_by_employee extends Money_transfer_panel {
    Employee employee;

    public transfermoney_by_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        if ((!this.textField1.getText().matches("[0-9]+")) | (!this.textField2.getText().matches("[0-9]+")) |
                (!this.textField3.getText().matches("[0-9]+")) |
                (this.textField1.getText().equals(this.textField2.getText())) | (this.textField3.getText().equals("0"))) {
            OK ok = new OK("invalid input!", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else {
            dispose();
            employee_main_menu employee_main_menu = new employee_main_menu(employee);
            employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            employee_main_menu.setVisible(true);
            synchronized (employee) {
                employee.transfer_money(this.textField1.getText(), this.textField2.getText(), this.textField3.getText(), 1);
                this.setVisible(false);
            }
        }
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        employee_main_menu employee_main_menu = new employee_main_menu(employee);
        employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        employee_main_menu.setVisible(true);
        this.dispose();
    }
}
