package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Edit_employee_information extends register_pannel {
    Employee employee;
    Manager manager;

    public Edit_employee_information(Employee employee, Manager manager) {
        super();
        this.employee = employee;
        this.manager = manager;
        button1.setText("apply changes");
        this.FirstnField1.setText(employee.firstName);
        this.LastnameField.setText(employee.lastName);
        this.NationalIDField3.setText(employee.nationalID);
        this.phoneField5.setText(employee.phoneNumber);
        if (employee.gender.equals("female")) {
            this.FemailButton2.setSelected(true);
        } else {
            this.MailButton3.setSelected(true);
        }
        this.Email.setText(employee.email);
//        this.birthdate.setText(employee.birthDate);
        this.address.setText(employee.address);
        label11.setText("");
        this.label8.setText("Edit employee");
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
        boolean lnm = true;
        if (LastnameField.getText().equals("")) {
            label15.setText("*necessary");
            a = false;
            lnm = false;
        } else if ((!LastnameField.getText().matches("[a-zA-Z]+")) && (lnm)) {
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
        boolean ph = true;
        if (phoneField5.getText().equals("")) {
            label17.setText("*necessary");
            a = false;
            ph = false;
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
            Employee employe = new Employee(FirstnField1.getText(), LastnameField.getText(), NationalIDField3.getText()
                    , phoneField5.getText(), gender, Email.getText(), birthdate, address.getText(),
                    this.employee.password, this.employee.getSalary());
            manager.edit_employee_profile(employee.nationalID, employe);
            manage_employee manage_employee = new manage_employee(manager);
            manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            manage_employee.setVisible(true);
            OK ok = new OK("Edited successfuly", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
            dispose();
        }
    }

    public void button2MouseClicked(MouseEvent e) {
        manage_employee manage_employee = new manage_employee(manager);
        manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_employee.setVisible(true);
        dispose();
    }

}
