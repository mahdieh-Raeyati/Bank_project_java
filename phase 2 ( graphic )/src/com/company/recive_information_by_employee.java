/*
 * Created by JFormDesigner on Mon Jul 27 20:33:00 IRDT 2020
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
public class recive_information_by_employee extends JFrame {
    Employee employee;
    int number;

    public recive_information_by_employee(Employee employee, int number) {
        initComponents();
        this.employee = employee;
        this.number = number;

        //  +fullsearch
        if (number == 1 | number == 23) {
            this.label1.setText("enter the desired name");
        }
        if (number == 2 | number == 24) {
            this.label1.setText("enter the desired last name");
        }
        if (number == 3 | number == 25) {
            this.label1.setText("enter the desired nationalID");
        }
        if (number == 4 | number == 26) {
            this.label1.setText("enter the desired phoneNumber");
        }
        if (number == 5 | number == 27) {
            this.label1.setText("enter  gender (male/female)");
        }
        if (number == 6 | number == 28) {
            this.label1.setText("enter the desired email");
        }
        if (number == 7 | number == 29) {
            this.label1.setText("enter birthDate(for example 1379/7/15)");
        }
        if (number == 8 | number == 30) {
            this.label1.setText("enter the desired address");
        }
        if (number == 9) {
            this.label1.setText("enter the desired nationalID");
            this.button1.setText("remove");
        }
        if (number == 10) {
            this.label1.setText("enter the desired nationalID");
            this.button1.setText("edit");
        }
        if (number == 11) {
            this.label1.setText("enter account number");
            this.button1.setText("remove");
        }
        if (number == 12) {
            this.label1.setText("enter desired account number");
        }
        if (number == 13) {
            this.label1.setText("enter account type(current/saving)");
        }
        if (number == 14) {
            this.label1.setText("enter date (for example 2020-07-28)");
        }
        if (number == 15) {
            this.label1.setText("enter date (for example 2020-07-28)");
        }
        if (number == 16) {
            this.label1.setText("enter desired money");
        }
        if (number == 17) {
            this.label1.setText("enter desired source account");
        }
        if (number == 18) {
            this.label1.setText("enter date for example (2020-07-28)");
        }
        if (number == 19) {
            this.label1.setText("enter time (for example 17:40)");
        }
        if (number == 20) {
            this.label1.setText("enter desired money");
        }
        if (number == 21) {
            this.label1.setText("enter type ( deposit/removal)");
        }
        if (number == 22) {
            this.label1.setText("enter desired destination account");
        }
        // exit file
        if (number == 31) {
            this.label1.setText("enter nationalID of customer");
            this.button1.setText("next");
        }
        //exit file & //edit inventory
        if (number == 32 | number == 33) {
            this.label1.setText("enter account number");
            this.button1.setText("next");
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

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    private void button1MouseClicked(MouseEvent e) {
        if (number == 1) {
            employee.search_customer(1, this.textField1.getText(), false);
            dispose();
        }
        if (number == 2) {
            employee.search_customer(2, this.textField1.getText(), false);
            dispose();
        }
        if (number == 3) {
            employee.search_customer(3, this.textField1.getText(), false);
            dispose();
        }
        if (number == 4) {
            employee.search_customer(4, this.textField1.getText(), false);
            dispose();
        }
        if (number == 5) {
            employee.search_customer(5, this.textField1.getText(), false);
            dispose();
        }
        if (number == 6) {
            employee.search_customer(6, this.textField1.getText(), false);
            dispose();
        }
        if (number == 7) {
            employee.search_customer(7, this.textField1.getText(), false);
            dispose();
        }
        if (number == 8) {
            employee.search_customer(8, this.textField1.getText(), false);
            dispose();
        }
        if (number == 9) {

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
                    manage_customer_by_employee manage_customer_by_employee = new manage_customer_by_employee(employee);
                    manage_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_customer_by_employee.setVisible(true);
                    employee.delete_customer_profile(customers.get(index).nationalID);
                    dispose();
                } else {
                    manage_customer_by_employee manage_customer_by_employee = new manage_customer_by_employee(employee);
                    manage_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_customer_by_employee.setVisible(true);
                    OK ok = new OK("There is not any customer with this ID !", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    dispose();
                }
            }
        }
        if (number == 10) {
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
                    Edit_customers_information_by_employee edit_customers_information_by_employee = new
                            Edit_customers_information_by_employee(employee, customers.get(index));
                    edit_customers_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    edit_customers_information_by_employee.setVisible(true);
                    dispose();
                } else {
                    manage_customer_by_employee manage_customer_by_employee = new manage_customer_by_employee(employee);
                    manage_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    manage_customer_by_employee.setVisible(true);
                    OK ok = new OK("There is not any customer with this ID !", 1);
                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    ok.setVisible(true);
                    dispose();
                }
            }

        }
        if (number == 11) {
            employee.delete_account(this.textField1.getText());
            dispose();
        }
        if (number == 12) {
            employee.search_account(this.textField1.getText(), 1);
            dispose();
        }
        if (number == 13) {
            employee.search_account(this.textField1.getText(), 2);
            dispose();
        }
        if (number == 14) {
            employee.search_account(this.textField1.getText(), 3);
            dispose();
        }
        if (number == 15) {
            employee.search_account(this.textField1.getText(), 4);
            dispose();
        }
        if (number == 16) {
            employee.search_account(this.textField1.getText(), 5);
            dispose();
        }
        if (number == 17) {
            employee.search_transaction(1, this.textField1.getText());
            System.out.println("1234");
            dispose();
        }
        if (number == 18) {
            employee.search_transaction(2, this.textField1.getText());
            dispose();
        }
        if (number == 19) {
            employee.search_transaction(3, this.textField1.getText());
            dispose();
        }
        if (number == 20) {
            employee.search_transaction(4, this.textField1.getText());
            dispose();
        }
        if (number == 21) {
            employee.search_transaction(5, this.textField1.getText());
            dispose();
        }
        if (number == 22) {
            employee.search_transaction(6, this.textField1.getText());
            dispose();
        }
        if (number == 23) {
            employee.search_customer(1, this.textField1.getText(), true);
            dispose();
        }
        if (number == 24) {
            employee.search_customer(2, this.textField1.getText(), true);
            dispose();
        }
        if (number == 25) {
            employee.search_customer(3, this.textField1.getText(), true);
            dispose();
        }
        if (number == 26) {
            employee.search_customer(4, this.textField1.getText(), true);
            dispose();
        }
        if (number == 27) {
            employee.search_customer(5, this.textField1.getText(), true);
            dispose();
        }
        if (number == 28) {
            employee.search_customer(6, this.textField1.getText(), true);
            dispose();
        }
        if (number == 29) {
            employee.search_customer(7, this.textField1.getText(), true);
            dispose();
        }
        if (number == 30) {
            employee.search_customer(8, this.textField1.getText(), true);
            dispose();
        }
        //exit customer
        if (number == 31) {
            employee.exit_customer(this.textField1.getText());
            dispose();
        }
        //exit account
        if (number == 32) {
            employee.exit_account(this.textField1.getText());
            dispose();
        }
        if (number == 33) {
            String data = "";
            Gson gson = new Gson();
            File file = new File("accounts.json");
            ArrayList<Account> accounts;
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
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label13 = new JLabel();
        label14 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new LineBorder(Color.white, 4));
            panel1.setBorder(new CompoundBorder(new TitledBorder(new
                    EmptyBorder(0, 0, 0, 0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("D\u0069alog", Font.BOLD, 12),
                    Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062order".equals(e.getPropertyName()))
                        throw new RuntimeException();
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

            //---- button1 ----
            button1.setText("search");
            button1.setBorderPainted(false);
            button1.setBackground(new Color(255, 89, 143));
            button1.setForeground(Color.white);
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
            button2.setBorderPainted(false);
            button2.setBackground(new Color(255, 89, 143));
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

            //---- textField1 ----
            textField1.setForeground(Color.white);
            textField1.setBackground(new Color(75, 60, 110));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(0, 66, Short.MAX_VALUE)
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(40, 40, 40)
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(23, 23, 23))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGap(0, 50, Short.MAX_VALUE)
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(38, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39))
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
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    protected JPanel panel1;
    protected JLabel label13;
    protected JLabel label14;
    protected JLabel label1;
    protected JButton button1;
    protected JButton button2;
    protected JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
