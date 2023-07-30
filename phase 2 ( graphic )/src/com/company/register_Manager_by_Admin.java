package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class register_Manager_by_Admin extends register_pannel {
    private Admin admin;

    public register_Manager_by_Admin(Admin admin) {
        super();
        this.admin = admin;
        label11.setText("");
    }

    @Override
    public void label11MouseClicked(MouseEvent e) {

    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        boolean a = true;
        if (FirstnField1.getText().equals("")) {
            label1.setText("*necessary");
            a = false;
        } else if ((!FirstnField1.getText().matches("[a-zA-Z]+"))) {
            label1.setText("*Enter name correctly");
            a = false;
        } else {
            label1.setText("");
        }
        if (LastnameField.getText().equals("")) {
            label15.setText("*necessary");
            a = false;
        } else if ((!LastnameField.getText().matches("[a-zA-Z]+"))) {
            label15.setText("*Enter last name correctly");
            a = false;
        } else {
            label15.setText("");
        }
        boolean nid = false;
        if (NationalIDField3.getText().equals("")) {
            label16.setText("*necessary");
            a = false;
            nid = false;
        } else if (!((NationalIDField3.getText().length() == 10) && (NationalIDField3.getText().matches("[0-9]+")))) {
            label16.setText("*NationalID  must be 10 numbers");
            a = false;
        } else {
            label16.setText("");
        }
        if (phoneField5.getText().equals("")) {
            label17.setText("*necessary");
            a = false;
        } else if (!((phoneField5.getText().length() == 11) && (phoneField5.getText().matches("[0-9]+")))) {
            label17.setText("*invalid");
            a = false;
        } else {
            label17.setText("");
        }
        if (Email.getText().equals("")) {
            label19.setText("*necessary");
            a = false;

        } else if (!((Email.getText().contains("@") && Email.getText().contains(".")))) {
            label19.setText("*invalid Email");
            a = false;
        } else {
            label19.setText("");
        }
        String birthdate = comboBox1.getSelectedItem().toString() + "/" + comboBox2.getSelectedItem().toString() +
                "/" + comboBox3.getSelectedItem().toString();
        if (address.getText().equals("")) {
            label21.setText("*necessary");
            a = false;
        } else {
            label21.setText("");
        }
        if (!(FemailButton2.isSelected() | MailButton3.isSelected())) {
            label18.setText("*choose a gender");
            a = false;
        } else {
            label18.setText("");
        }
        if (a) {
            String gender = "";
            if (MailButton3.isSelected()) {
                gender = "male";
            }
            if (FemailButton2.isSelected()) {
                gender = "female";
            }
            setting_password_for_manager setting_password_for_manager = new setting_password_for_manager(FirstnField1.getText(), LastnameField.getText(), NationalIDField3.getText()
                    , phoneField5.getText(), gender, Email.getText(), birthdate, address.getText(), admin);

            setting_password_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setting_password_for_manager.setVisible(true);
            dispose();
        }

    }

    public void button2MouseClicked(MouseEvent e) {
        Admin_menue admin_menue = new Admin_menue(admin);
        admin_menue.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        admin_menue.setVisible(true);
        dispose();
    }


}
