package com.company;

import java.awt.event.MouseEvent;

public class Edit_customers_information_by_employee extends register_pannel {
    Customer customer;
    Employee employee;

    public Edit_customers_information_by_employee(Employee employee, Customer customer) {
        super();
        this.FirstnField1.setText(customer.firstName);
        this.LastnameField.setText(customer.lastName);
        this.NationalIDField3.setText(customer.nationalID);
        this.phoneField5.setText(customer.phoneNumber);
        if (customer.gender.equals("female")) {
            this.FemailButton2.setSelected(true);
        } else {
            this.MailButton3.setSelected(true);
        }
        this.Email.setText(customer.email);
//        this.birthdate.setText(customer.birthDate);
        this.address.setText(customer.address);
        this.customer = customer;
        this.employee = employee;
        label11.setText("");
        this.label8.setText("Edit customer");
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
            Customer cUstomer = new Customer(FirstnField1.getText(), LastnameField.getText(), NationalIDField3.getText()
                    , phoneField5.getText(), gender, Email.getText(), birthdate, address.getText(),
                    customer.password, customer.favorite_animal, customer.favorite_country, customer.favorite_color, customer.favorite_fruit);
            customer.edit_customer_profile(customer.nationalID, cUstomer);
            manage_customer_by_employee manage_customer_by_employee = new manage_customer_by_employee(employee);
            manage_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            manage_customer_by_employee.setVisible(true);
            OK ok = new OK("Edited successfully!", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
            dispose();
        }
    }

    public void button2MouseClicked(MouseEvent e) {
        manage_customer_by_employee manage_customer_by_employee = new manage_customer_by_employee(employee);
        manage_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customer_by_employee.setVisible(true);
        dispose();

    }
}
