/*
 * Created by JFormDesigner on Tue Jul 14 18:55:30 IRDT 2020
 */

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class password_pannel_customer extends JFrame {
    private Customer customer;
    private int number;    //1  >>>first time      //2  >>>change password

    public password_pannel_customer(Customer customer, int number) {
        initComponents();
        this.customer = customer;
        this.number = number;
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
        boolean a = false;
        if (!(passwordField3.getDisabledTextColor().equals(""))) {
            if ((!(passwordField2.getText().equals("")))) {
                a = true;
                if (a) {
                    a = false;
                    String animal = "";
                    if (dog_checkBox.isSelected()) {
                        a = true;
                        animal = "dog";
                    } else if (cat_checkBox.isSelected()) {
                        a = true;
                        animal = "cat";
                    } else if (Parrot_checkBox.isSelected()) {
                        a = true;
                        animal = "parrot";
                    } else if (HamestercheckBox_.isSelected()) {
                        a = true;
                        animal = "hamster";
                    } else {
                        OK ok = new OK("    favorite animal was not selected", 1);
                        ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                    }
                    if (a) {
                        a = false;
                        a = false;
                        String country = "";
                        if (checkBox1.isSelected()) {
                            a = true;
                            country = "france";
                        } else if (checkBox2.isSelected()) {
                            a = true;
                            country = "australia";
                        } else if (checkBox4.isSelected()) {
                            a = true;
                            country = "japan";
                        } else if (checkBox5.isSelected()) {
                            a = true;
                            country = "brazil";
                        } else {
                            OK ok = new OK("    favorite country was not selected", 1);
                            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            ok.setVisible(true);
                        }
                        if (a) {
                            a = false;
                            String color = "";
                            if (checkBox3.isSelected()) {
                                a = true;
                                color = "blue";
                            } else if (checkBox8.isSelected()) {
                                a = true;
                                color = "red";
                            } else if (checkBox6.isSelected()) {
                                a = true;
                                color = "green";
                            } else if (checkBox7.isSelected()) {
                                a = true;
                                color = "orange";
                            } else {
                                OK ok = new OK("    favorite color was not selected", 1);
                                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                ok.setVisible(true);
                            }
                            if (a) {
                                a = false;
                                String fruit = "";
                                if (checkBox9.isSelected()) {
                                    a = true;
                                    fruit = "banana";
                                } else if (checkBox10.isSelected()) {
                                    a = true;
                                    fruit = "apple";
                                } else if (checkBox11.isSelected()) {
                                    a = true;
                                    fruit = "orange";
                                } else if (checkBox12.isSelected()) {
                                    a = true;
                                    fruit = "grapes";
                                } else {
                                    OK ok = new OK("    favorite fruit was not selected", 1);
                                    ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                    ok.setVisible(true);
                                }
                                if (a) {
                                    if (passwordField3.getText().equals(passwordField2.getText())) {
                                        if (passwordField3.getText().length() >= 7) {
                                            boolean have_number = false;
                                            for (int i = 0; i < passwordField3.getText().length(); i++) {
                                                if (passwordField3.getText().charAt(i) >= 48 && passwordField3.getText().charAt(i) <= 57) {
                                                    have_number = true;
                                                }
                                            }
                                            if (have_number) {
                                                if (!passwordField3.getText().toLowerCase().equals(passwordField3.getText())) {
                                                    if (number == 2) {
                                                        //change password
                                                        Customer_menu customer_pannel = new Customer_menu(customer);
                                                        customer_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                                        customer_pannel.setVisible(true);
                                                        dispose();
                                                        customer.change_password(customer, passwordField3.getText(),
                                                                animal, color, country, fruit, 1);

                                                    }
                                                    if (number == 1) {
                                                        Customer_menu customer_pannel = new Customer_menu(customer);
                                                        customer_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                                        customer_pannel.setVisible(true);
                                                        dispose();
                                                        customer.setpassword(passwordField3.getText());
                                                        customer.setFavorite_color(color);
                                                        customer.setFavorite_country(country);
                                                        customer.setFavorite_fruit(fruit);
                                                        customer.setFavorite_animal(animal);
                                                        customer.make_customer_profile_file(customer);

                                                    }

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
                        }
                    }
                }

            } else {
                OK ok = new OK("    confirm your password", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            OK ok = new OK("    Enter your password", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        dog_checkBox = new JCheckBox();
        cat_checkBox = new JCheckBox();
        Parrot_checkBox = new JCheckBox();
        HamestercheckBox_ = new JCheckBox();
        label4 = new JLabel();
        checkBox1 = new JCheckBox();
        label5 = new JLabel();
        checkBox2 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();
        label6 = new JLabel();
        checkBox3 = new JCheckBox();
        checkBox6 = new JCheckBox();
        checkBox7 = new JCheckBox();
        checkBox8 = new JCheckBox();
        label7 = new JLabel();
        checkBox9 = new JCheckBox();
        checkBox10 = new JCheckBox();
        checkBox11 = new JCheckBox();
        checkBox12 = new JCheckBox();
        label8 = new JLabel();
        passwordField2 = new JPasswordField();
        passwordField3 = new JPasswordField();
        button1 = new JButton();
        label13 = new JLabel();
        label14 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
                    (0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder.CENTER, javax.swing.border
                    .TitledBorder.BOTTOM, new Font("Dia\u006cog", Font.BOLD, 12), Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void
                propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062ord\u0065r".equals(e.getPropertyName())) throw new RuntimeException()
                            ;
                }
            });

            //---- label1 ----
            label1.setText("Set up a password      :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label2 ----
            label2.setText("note that your password should be at least 8 characters and contain number(s) and capital letter(s)");
            label2.setForeground(new Color(255, 89, 143));
            label2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));

            //---- label3 ----
            label3.setText("Choose your favorite animal");
            label3.setForeground(Color.white);
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- dog_checkBox ----
            dog_checkBox.setText("Dog");
            dog_checkBox.setBackground(new Color(75, 60, 110));
            dog_checkBox.setForeground(Color.white);

            //---- cat_checkBox ----
            cat_checkBox.setText("Cat");
            cat_checkBox.setBackground(new Color(75, 60, 110));
            cat_checkBox.setForeground(Color.white);

            //---- Parrot_checkBox ----
            Parrot_checkBox.setText("Parrot");
            Parrot_checkBox.setBackground(new Color(75, 60, 110));
            Parrot_checkBox.setForeground(Color.white);

            //---- HamestercheckBox_ ----
            HamestercheckBox_.setText("Hamster");
            HamestercheckBox_.setBackground(new Color(75, 60, 110));
            HamestercheckBox_.setForeground(Color.white);

            //---- label4 ----
            label4.setText("Choose your favorite country");
            label4.setForeground(Color.white);
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- checkBox1 ----
            checkBox1.setText("France");
            checkBox1.setBackground(new Color(75, 60, 110));
            checkBox1.setForeground(Color.white);
            checkBox1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label5 ----
            label5.setText("Choose your favorite color");
            label5.setForeground(Color.white);
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- checkBox2 ----
            checkBox2.setText("Australia");
            checkBox2.setBackground(new Color(75, 60, 110));
            checkBox2.setForeground(Color.white);
            checkBox2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox4 ----
            checkBox4.setText("Japan");
            checkBox4.setBackground(new Color(75, 60, 110));
            checkBox4.setForeground(Color.white);
            checkBox4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox5 ----
            checkBox5.setText("Brazil");
            checkBox5.setBackground(new Color(75, 60, 110));
            checkBox5.setForeground(Color.white);
            checkBox5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label6 ----
            label6.setText("Security");
            label6.setForeground(new Color(255, 89, 143));
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
            label6.setBackground(new Color(255, 89, 143));

            //---- checkBox3 ----
            checkBox3.setText("Blue");
            checkBox3.setBackground(new Color(75, 60, 110));
            checkBox3.setForeground(Color.white);
            checkBox3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox6 ----
            checkBox6.setText("Green");
            checkBox6.setBackground(new Color(75, 60, 110));
            checkBox6.setForeground(Color.white);
            checkBox6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox7 ----
            checkBox7.setText("Orange");
            checkBox7.setBackground(new Color(75, 60, 110));
            checkBox7.setForeground(Color.white);
            checkBox7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox8 ----
            checkBox8.setText("Red");
            checkBox8.setBackground(new Color(75, 60, 110));
            checkBox8.setForeground(Color.white);
            checkBox8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label7 ----
            label7.setText("Choose your favorite fruit");
            label7.setForeground(Color.white);
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- checkBox9 ----
            checkBox9.setText("Banana");
            checkBox9.setBackground(new Color(75, 60, 110));
            checkBox9.setForeground(Color.white);
            checkBox9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox10 ----
            checkBox10.setText("Apple");
            checkBox10.setBackground(new Color(75, 60, 110));
            checkBox10.setForeground(Color.white);
            checkBox10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox11 ----
            checkBox11.setText("Orange");
            checkBox11.setBackground(new Color(75, 60, 110));
            checkBox11.setForeground(Color.white);
            checkBox11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- checkBox12 ----
            checkBox12.setText("Grapes");
            checkBox12.setBackground(new Color(75, 60, 110));
            checkBox12.setForeground(Color.white);
            checkBox12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label8 ----
            label8.setText("Confirm your password :");
            label8.setForeground(Color.white);
            label8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- passwordField2 ----
            passwordField2.setBackground(new Color(75, 60, 110));
            passwordField2.setForeground(Color.white);

            //---- passwordField3 ----
            passwordField3.setBackground(new Color(75, 60, 110));
            passwordField3.setForeground(Color.white);

            //---- button1 ----
            button1.setText("Done");
            button1.setForeground(Color.white);
            button1.setBackground(new Color(255, 89, 143));
            button1.setBorderPainted(false);
            button1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
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

            //---- label13 ----
            label13.setText("X");
            label13.setForeground(new Color(255, 89, 143));
            label13.setFont(label13.getFont().deriveFont(label13.getFont().getStyle() | Font.BOLD, label13.getFont().getSize() + 2f));
            label13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label13MouseClicked(e);

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label13MouseEntered(e);

                }

                @Override
                public void mouseExited(MouseEvent e) {
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

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label14MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label14MouseExited(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                            .addComponent(dog_checkBox)
                                                                            .addComponent(checkBox1)
                                                                            .addComponent(checkBox3))
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                            .addComponent(cat_checkBox)
                                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                                            .addComponent(checkBox2)
                                                                                            .addComponent(checkBox8)
                                                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                                                    .addGap(4, 4, 4)
                                                                                                    .addComponent(checkBox10)))
                                                                                    .addGap(18, 18, 18)
                                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                                                    .addComponent(Parrot_checkBox)
                                                                                                    .addGap(28, 28, 28))
                                                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                                                            .addComponent(checkBox11)
                                                                                                            .addComponent(checkBox6)
                                                                                                            .addComponent(checkBox4))
                                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(checkBox9)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(checkBox12)
                                                            .addComponent(checkBox5)
                                                            .addComponent(HamestercheckBox_)
                                                            .addComponent(checkBox7))
                                                    .addGap(69, 69, 69))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(12, 12, 12)
                                                                    .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label1)
                                                                    .addGap(35, 35, 35)
                                                                    .addComponent(passwordField3, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
                                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(128, 128, 128)
                                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                    .addContainerGap())
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(169, 169, 169))
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
                                                                    .addContainerGap())))))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(dog_checkBox)
                                            .addComponent(cat_checkBox)
                                            .addComponent(Parrot_checkBox)
                                            .addComponent(HamestercheckBox_)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkBox1)
                                            .addComponent(checkBox2)
                                            .addComponent(checkBox5)
                                            .addComponent(checkBox4))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkBox3)
                                            .addComponent(checkBox7)
                                            .addComponent(checkBox6)
                                            .addComponent(checkBox8))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkBox9)
                                            .addComponent(checkBox12)
                                            .addComponent(checkBox11)
                                            .addComponent(checkBox10))
                                    .addGap(26, 26, 26)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(dog_checkBox);
        buttonGroup1.add(cat_checkBox);
        buttonGroup1.add(Parrot_checkBox);
        buttonGroup1.add(HamestercheckBox_);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(checkBox1);
        buttonGroup2.add(checkBox2);
        buttonGroup2.add(checkBox4);
        buttonGroup2.add(checkBox5);

        //---- buttonGroup3 ----
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(checkBox3);
        buttonGroup3.add(checkBox6);
        buttonGroup3.add(checkBox7);
        buttonGroup3.add(checkBox8);

        //---- buttonGroup4 ----
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(checkBox9);
        buttonGroup4.add(checkBox10);
        buttonGroup4.add(checkBox11);
        buttonGroup4.add(checkBox12);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JCheckBox dog_checkBox;
    private JCheckBox cat_checkBox;
    private JCheckBox Parrot_checkBox;
    private JCheckBox HamestercheckBox_;
    private JLabel label4;
    private JCheckBox checkBox1;
    private JLabel label5;
    private JCheckBox checkBox2;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JLabel label6;
    private JCheckBox checkBox3;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JLabel label7;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JCheckBox checkBox12;
    private JLabel label8;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JButton button1;
    private JLabel label13;
    private JLabel label14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
