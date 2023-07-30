package com.company;

import java.awt.event.MouseEvent;

public class setting_password_for_customer_by_manager extends password_pannel_with_out_favorites {
    String firstName;
    String lastName;
    String nationalID;
    String phoneNumber;
    String gender;
    String email;
    String birthDate;
    String address;
    Manager manager;

    public setting_password_for_customer_by_manager(String firstName, String lastName, String nationalID, String phoneNumber
            , String gender, String email, String birthDate, String address, Manager manager) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
        this.manager = manager;
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

                            Customer customer = new Customer(this.firstName, this.lastName, this.nationalID, this.phoneNumber, this.gender,
                                    this.email, this.birthDate, this.address, this.passwordField2.getText(), "null",
                                    "null", "null", "null");
                            manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
                            manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            manage_customer_by_manager.setVisible(true);
                            dispose();
                            synchronized (customer) {
                                customer.make_customer_profile_file(customer);
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
        manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
        manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customer_by_manager.setVisible(true);
        dispose();
    }

}