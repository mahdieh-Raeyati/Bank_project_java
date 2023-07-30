package com.company;

import java.awt.event.MouseEvent;

public class change_password_for_manager extends password_pannel_with_out_favorites {
    Manager manager;

    public change_password_for_manager(Manager manager) {
        this.label1.setText("setup a new password");
        this.manager = manager;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        if (passwordField1.getText().equals("") | passwordField2.getText().equals("")) {
            OK ok = new OK("one or more fields are empty ", 1);
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

                            manager.change_password(this.passwordField1.getText(), manager);
                            dispose();

                        } else {
                            OK ok = new OK("password must include upercase letter(s)", 1);
                            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            ok.setVisible(true);
                        }
                    } else {
                        OK ok = new OK("password must include number(s)", 1);
                        ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                    }
                } else {
                    OK ok = new OK("password must be atleast 8 characters", 1);
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
        manager_main_menu manager_main_menu = new manager_main_menu(manager);
        manager_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manager_main_menu.setVisible(true);
        dispose();
    }
}
