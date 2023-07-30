package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class register_employee_by_managere extends register_pannel {
    private Manager manager;

    public register_employee_by_managere(Manager manager) {
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
        File file = new File("employee profile.json");
        ArrayList<Employee> employees = new ArrayList<Employee>();
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
            employees = gson.fromJson(data, new TypeToken<ArrayList<Employee>>() {
            }.getType());
            for (Employee employee : employees) {
                if (employee.nationalID.equals(NationalIDField3.getText())) {
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
        } else if (ID_Exist) {
            label16.setText("*there is an employee with this ID");
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
        boolean gen = true;
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
            setting_password_for_employee_by_manager setting_password_for_employee
                    = new setting_password_for_employee_by_manager(FirstnField1.getText(), LastnameField.getText(),
                    NationalIDField3.getText(), phoneField5.getText(), gender, Email.getText(),
                    birthdate, address.getText(), manager);
            setting_password_for_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setting_password_for_employee.setVisible(true);
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
