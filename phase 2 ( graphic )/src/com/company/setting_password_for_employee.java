package com.company;

import java.awt.event.MouseEvent;

public class setting_password_for_employee extends password_pannel_with_out_favorites {
    Employee employee;

    public setting_password_for_employee(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        if (passwordField1.getText().equals("") | passwordField2.getText().equals("")) {
            OK ok = new OK("one ore more fields are empty!", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else {
            if (passwordField1.getText().equals(passwordField2.getText())) {
                if (passwordField1.getText().length() >= 7) {
                    boolean have_number = false;
                    for (int i = 0; i < passwordField1.getText().length(); i++) {
                        if (passwordField1.getText().charAt(i) >= 48 && passwordField1.getText().charAt(i) <= 57) {
                            have_number = true;
                        }
                    }
                    if (have_number) {
                        if (!passwordField1.getText().toLowerCase().equals(passwordField1.getText())) {
                            employee_main_menu employee_main_menu = new employee_main_menu(employee);
                            employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            employee_main_menu.setVisible(true);
                            synchronized (employee) {
                                employee.change_password(this.passwordField1.getText());
                                this.dispose();
                            }

                        } else {
                            OK ok = new OK("password must include uppercase letter(s)", 1);
                            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            ok.setVisible(true);
                        }
                    } else {
                        OK ok = new OK("password must include number(s)", 1);
                        ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                    }
                } else {
                    OK ok = new OK("password must be at least 8 characters", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            } else {
                OK ok = new OK("   passwords are not equal", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        }
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        employee_main_menu employee_main_menu = new employee_main_menu(employee);
        employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        employee_main_menu.setVisible(true);
        dispose();
    }

}
