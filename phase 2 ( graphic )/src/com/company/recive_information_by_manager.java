/*
 * Created by JFormDesigner on Sun Jul 26 16:31:16 IRDT 2020
 */

package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author mahdieh
 */
public class recive_information_by_manager extends JFrame {
    private Manager manager;
    private int number;

    public recive_information_by_manager(Manager manager, int number) {
        initComponents();
        this.manager = manager;
        this.number = number;
        if (number == 3 | number == 4) {
            this.button1.setText("edit");
        }
        if (number == 5) {
            this.button1.setText("Done");
            this.label1.setText("enter the nationalID of employee");
        }
        if (number == 6) {
            this.button1.setText("remove ");
            this.label1.setText("Enter account number");
        }

        if (number == 7) {
            this.label1.setText("enter account number");
            this.button1.setText("remove");
        }

        //search account by
        if (number == 8) {
            this.label1.setText("enter desired account number");
            this.button1.setText("search");
        }
        if (number == 9) {
            this.label1.setText("enter account type (current/saving)");
            this.button1.setText("search");
        }
        if (number == 10) {
            this.label1.setText("enter date for example (2020-07-28)");
            this.button1.setText("search");
        }
        if (number == 11) {
            this.label1.setText("enter date for example (2020-07-28)");
            this.button1.setText("search");
        }
        if (number == 12) {
            this.label1.setText("enter desired money");
            this.button1.setText("search");
        }

        //search transaction
        if (number == 13) {
            this.label1.setText("enter desired source account");
            this.button1.setText("search");
        }
        if (number == 14) {
            this.label1.setText("enter  date for example (2020-07-28)");
            this.button1.setText("search");
        }
        if (number == 15) {
            this.label1.setText("enter  time  (for example 17:40)");
            this.button1.setText("search");
        }
        if (number == 16) {
            this.label1.setText("enter desired money");
            this.button1.setText("search");
        }
        if (number == 17) {
            this.label1.setText("enter type  (removal/ deposit)");
            this.button1.setText("search");
        }
        if (number == 18) {
            this.label1.setText("enter desired destination account");
            this.button1.setText("search");
        }
        if (number == 19) {
            this.label1.setText("enter the account number");
            this.button1.setText("next");
        }
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    private void button1MouseClicked(MouseEvent e) {
        if (number == 1) {
            manager.delete_employee_profile(this.textField1.getText());
            dispose();
        }
        if (number == 2) {
            manager.delete_customer_profile(this.textField1.getText());
            dispose();
        }
        if (number == 3) {
            String data = "";
            Gson gson = new Gson();
            File file = new File("employee profile.json");
            ArrayList<Employee> employees;
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
                boolean found = false;
                int index = 0;
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).nationalID.equals(textField1.getText())) {
                        index = i;
                        found = true;
                    }
                }
                if (found) {
                    Edit_employee_information edit_employee_information = new Edit_employee_information(employees.get(index), manager);
                    edit_employee_information.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    edit_employee_information.setVisible(true);
                    dispose();
                } else {
                    manage_employee manage_employee = new manage_employee(manager);
                    manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_employee.setVisible(true);
                    OK ok = new OK("There is not any employee with this nationalID !", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    dispose();
                }
            } else {
                manage_employee manage_employee = new manage_employee(manager);
                manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                manage_employee.setVisible(true);
                OK ok = new OK("No employee exist!", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
                dispose();
            }
        }
        if (number == 4) {
            String data = "";
            Gson gson = new Gson();
            File file = new File("customer profile.json");
            ArrayList<Customer> customers;
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
                boolean found = false;
                int index = 0;
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).nationalID.equals(textField1.getText())) {
                        index = i;
                        found = true;
                    }
                }
                if (found) {
                    Edit_customers_information_by_manager edit_customers_information = new Edit_customers_information_by_manager(customers.get(index), manager);
                    edit_customers_information.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    edit_customers_information.setVisible(true);
                    dispose();
                } else {
                    manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
                    manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_customer_by_manager.setVisible(true);
                    OK ok = new OK("There is not any customer with this ID !", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    dispose();
                }
            } else {
                manage_employee manage_employee = new manage_employee(manager);
                manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                manage_employee.setVisible(true);
                OK ok = new OK("No employee exist!", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
                dispose();
            }
        }
        if (number == 5) {
            String data = "";
            Gson gson = new Gson();
            File file = new File("employee profile.json");
            ArrayList<Employee> employees;
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
                boolean found = false;
                int index = 0;
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).nationalID.equals(textField1.getText())) {
                        index = i;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    change_salary_pannel change_salary_pannel = new change_salary_pannel(employees.get(index), manager);
                    change_salary_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    change_salary_pannel.setVisible(true);
                    dispose();
                } else {
                    manage_employee manage_employee = new manage_employee(manager);
                    manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_employee.setVisible(true);
                    OK ok = new OK("There is not any employee with this nationalID !", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    dispose();
                }
            } else {
                manage_employee manage_employee = new manage_employee(manager);
                manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                manage_employee.setVisible(true);
                OK ok = new OK("No employee exist! ", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
                dispose();
            }
        }
        if (number == 6) {
            manager.delete_account(this.textField1.getText());
            dispose();
        }
        //search account by
        if (number == 8) {
            manager.search_account(this.textField1.getText(), 1);
            dispose();
        }
        if (number == 9) {
            manager.search_account(this.textField1.getText(), 2);
            dispose();
        }
        if (number == 10) {
            manager.search_account(this.textField1.getText(), 3);
            dispose();
        }
        if (number == 11) {
            manager.search_account(this.textField1.getText(), 4);
            dispose();
        }
        if (number == 12) {
            manager.search_account(this.textField1.getText(), 5);
            dispose();
        }
        //search transaction
        if (number == 13) {
            manager.search_transaction(1, this.textField1.getText());
            dispose();
        }
        if (number == 14) {
            manager.search_transaction(2, this.textField1.getText());
            dispose();
        }
        if (number == 15) {
            manager.search_transaction(3, this.textField1.getText());
            dispose();
        }
        if (number == 16) {
            manager.search_transaction(4, this.textField1.getText());
            dispose();
        }
        if (number == 17) {
            manager.search_transaction(5, this.textField1.getText());
            dispose();
        }
        if (number == 18) {
            manager.search_transaction(6, this.textField1.getText());
            dispose();
        }
        if (number == 19) {
            String data = "";
            Gson gson = new Gson();
            File file = new File("accounts.json");
            ArrayList<Account> accounts = new ArrayList<>();
            boolean exist = false;
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
                accounts = gson.fromJson(data, new TypeToken<ArrayList<Account>>() {
                }.getType());
                String money = "";
                for (Account account : accounts) {
                    if (account.getAccount_number().equals(this.textField1.getText())) {
                        exist = true;
                        money = account.getMoney().toString();
                        break;

                    }
                }
                if (exist) {
                    change_inventory change_inventory = new change_inventory(this.textField1.getText(), money);
                    change_inventory.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    change_inventory.setVisible(true);
                    dispose();
                } else {
                    OK ok = new OK("there no account with this number", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                }
            } else {
                OK ok = new OK("        no account exist", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        }
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseClicked(MouseEvent e) {
        if (number == 1 | number == 2) {
            dispose();
        }
        if (number == 3 | number == 5) {
            manage_employee manage_employee = new manage_employee(manager);
            manage_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            manage_employee.setVisible(true);
            dispose();
        }
        if (number == 4) {
            manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
            manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            manage_customer_by_manager.setVisible(true);
            dispose();
        }
        if (number == 6 | number == 19) {
            dispose();
        }
        if (number > 7 && number < 19) {
            dispose();
        }
    }


    private void label13MouseEntered(MouseEvent e) {
        label13.setForeground(new Color(255, 0, 0));
    }

    private void label13MouseExited(MouseEvent e) {
        label13.setForeground(new Color(255, 89, 143));
    }

    private void label13MouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void label14MouseEntered(MouseEvent e) {
        label14.setForeground(new Color(255, 0, 0));
    }

    private void label14MouseExited(MouseEvent e) {
        label14.setForeground(new Color(255, 89, 143));
    }

    private void label14MouseClicked(MouseEvent e) {
        this.setState(JFrame.ICONIFIED);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label13 = new JLabel();
        label14 = new JLabel();
        label1 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new LineBorder(Color.white, 6));
            panel1.setBorder(new CompoundBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("D\u0069alog", Font.BOLD,
                    12), Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans
                    .PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062order".equals(e.
                            getPropertyName())) throw new RuntimeException();
                }
            });

            //---- textField1 ----
            textField1.setBackground(new Color(75, 60, 110));
            textField1.setForeground(Color.white);

            //---- button1 ----
            button1.setText("delete");
            button1.setBackground(new Color(255, 89, 143));
            button1.setForeground(Color.white);
            button1.setBorderPainted(false);
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button1MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button1MouseExited(e);
                }
            });

            //---- button2 ----
            button2.setText("back");
            button2.setBackground(new Color(255, 89, 143));
            button2.setBorderPainted(false);
            button2.setForeground(Color.white);
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button2MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button2MouseExited(e);
                }
            });

            //---- label13 ----
            label13.setText("X");
            label13.setForeground(new Color(255, 89, 143));
            label13.setFont(label13.getFont().deriveFont(label13.getFont().getStyle() | Font.BOLD, label13.getFont().getSize() + 2f));
            label13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label13MouseClicked(e);
                    label13MouseClicked(e);
                    label13MouseClicked(e);
                    label13MouseClicked(e);
                    label13MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label13MouseEntered(e);
                    label13MouseEntered(e);
                    label13MouseEntered(e);
                    label13MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label13MouseExited(e);
                    label13MouseExited(e);
                    label13MouseExited(e);
                }
            });

            //---- label14 ----
            label14.setText("-");
            label14.setForeground(new Color(255, 89, 143));
            label14.setFont(label14.getFont().deriveFont(label14.getFont().getStyle() | Font.BOLD, label14.getFont().getSize() + 5f));
            label14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label14MouseClicked(e);
                    label14MouseClicked(e);
                    label14MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label14MouseEntered(e);
                    label14MouseEntered(e);
                    label14MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label14MouseExited(e);
                    label14MouseExited(e);
                }
            });

            //---- label1 ----
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            label1.setText("enter the nationalID");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(78, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(43, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                    .addGap(25, 25, 25))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JLabel label13;
    private JLabel label14;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
