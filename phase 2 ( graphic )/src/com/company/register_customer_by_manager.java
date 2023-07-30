package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class register_customer_by_manager extends register_pannel {
    private Manager manager;

    public register_customer_by_manager(Manager manager) {
        super();
        this.manager = manager;
        label11.setText("");
    }

    @Override
    public void label11MouseClicked(MouseEvent e) {

    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        boolean a = true;
        boolean ID_Exist = false;
        String data = "";
        Gson gson = new Gson();
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        if (file.exists()) {
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException E) {
                E.printStackTrace();
            }
            customers = gson.fromJson(data, new TypeToken<ArrayList<Customer>>() {
            }.getType());
            for (Customer customer : customers) {
                if (customer.nationalID.equals(NationalIDField3.getText())) {
                    a = false;
                    ID_Exist = true;
                }
            }
        }
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
        } else if (ID_Exist) {
            label16.setText("*there is an employee with this ID");
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
        boolean adres = true;
        if (address.getText().equals("")) {
            label21.setText("*necessary");
            a = false;
            adres = false;
        } else {
            label21.setText("");
        }
        if (!(FemailButton2.isSelected() | MailButton3.isSelected())) {
            label18.setText("*choose a gender");
            a = false;
        } else {
            label18.setText("");
        }
        System.out.println(ID_Exist);
        if (a) {
            String gender = "";
            if (MailButton3.isSelected()) {
                gender = "male";
            }
            if (FemailButton2.isSelected()) {
                gender = "female";
            }
            setting_password_for_customer_by_manager setting_password_for_customer_by_manager
                    = new setting_password_for_customer_by_manager(FirstnField1.getText(), LastnameField.getText(),
                    NationalIDField3.getText(), phoneField5.getText(), gender, Email.getText(),
                    birthdate, address.getText(), manager);

            setting_password_for_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setting_password_for_customer_by_manager.setVisible(true);
            dispose();
        }

    }

    public void button2MouseClicked(MouseEvent e) {
        manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
        manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customer_by_manager.setVisible(true);
        dispose();
    }
}
