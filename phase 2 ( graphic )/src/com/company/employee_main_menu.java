/*
 * Created by JFormDesigner on Mon Jul 27 18:58:52 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mahdieh
 */
public class employee_main_menu extends JFrame {
    Employee employee;

    public employee_main_menu(Employee employee) {
        initComponents();
        this.employee = employee;
        this.label3.setText(employee.firstName);
        this.label4.setText(employee.lastName);
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
        manage_customer_by_employee manage_customwe_by_employee = new manage_customer_by_employee(employee);
        manage_customwe_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customwe_by_employee.setVisible(true);
        dispose();
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseClicked(MouseEvent e) {
        manage_account_by_employee manage_account_by_employee = new manage_account_by_employee(employee);
        manage_account_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_account_by_employee.setVisible(true);
        dispose();
    }

    private void button3MouseEntered(MouseEvent e) {
        button3.setBackground(new Color(255, 69, 120));
    }

    private void button3MouseExited(MouseEvent e) {
        button3.setBackground(new Color(255, 89, 143));
    }

    private void button3MouseClicked(MouseEvent e) {
        setting_password_for_employee setting_password_for_employee = new setting_password_for_employee(employee);
        setting_password_for_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setting_password_for_employee.setVisible(true);
        dispose();
    }

    private void button4MouseEntered(MouseEvent e) {
        button4.setBackground(new Color(255, 69, 120));
    }

    private void button4MouseExited(MouseEvent e) {
        button4.setBackground(new Color(255, 89, 143));
    }

    private void button4MouseClicked(MouseEvent e) {
        full_search_by_employee full_search_by_employee = new full_search_by_employee(employee);
        full_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        full_search_by_employee.setVisible(true);
        dispose();

    }

    private void button5MouseEntered(MouseEvent e) {
        button5.setBackground(new Color(255, 69, 120));
    }

    private void button5MouseExited(MouseEvent e) {
        button5.setBackground(new Color(255, 89, 143));
    }

    private void button5MouseClicked(MouseEvent e) {
        transfermoney_by_employee transfermoney_by_employee = new transfermoney_by_employee(employee);
        transfermoney_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        transfermoney_by_employee.setVisible(true);
        dispose();
    }

    private void button6MouseEntered(MouseEvent e) {
        button6.setBackground(new Color(255, 69, 120));
    }

    private void button6MouseExited(MouseEvent e) {
        button6.setBackground(new Color(255, 89, 143));
    }

    private void button6MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 31);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    private void button7MouseEntered(MouseEvent e) {
        button7.setBackground(new Color(255, 69, 120));
    }

    private void button7MouseExited(MouseEvent e) {
        button7.setBackground(new Color(255, 89, 143));
    }

    private void button7MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new recive_information_by_employee(employee, 32);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label13 = new JLabel();
        label14 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
                    .swing.border.EmptyBorder(0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing
                    .border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new
                    Font("Dia\u006cog", Font.BOLD, 12), Color.red
            ), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062ord\u0065r".equals(e.getPropertyName(
                    ))) throw new RuntimeException();
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

            //---- button1 ----
            button1.setText("manage customers");
            button1.setBackground(new Color(255, 89, 143));
            button1.setBorderPainted(false);
            button1.setForeground(Color.white);
            button1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
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
            button2.setText("manage account");
            button2.setBackground(new Color(255, 89, 143));
            button2.setBorderPainted(false);
            button2.setForeground(Color.white);
            button2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
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

            //---- button3 ----
            button3.setText("change my password");
            button3.setBackground(new Color(255, 89, 143));
            button3.setBorderPainted(false);
            button3.setForeground(Color.white);
            button3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button3MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button3MouseExited(e);
                }
            });

            //---- button4 ----
            button4.setText("search");
            button4.setForeground(Color.white);
            button4.setBorderPainted(false);
            button4.setBackground(new Color(255, 89, 143));
            button4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button4MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button4MouseExited(e);
                }
            });

            //---- button5 ----
            button5.setText("transfer money");
            button5.setForeground(Color.white);
            button5.setBorderPainted(false);
            button5.setBackground(new Color(255, 89, 143));
            button5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button5MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button5MouseExited(e);
                }
            });

            //---- button6 ----
            button6.setText("get out put of customers status");
            button6.setForeground(Color.white);
            button6.setBorderPainted(false);
            button6.setBackground(new Color(255, 89, 143));
            button6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button6MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button6MouseExited(e);
                }
            });

            //---- button7 ----
            button7.setText("get out put of accounts status");
            button7.setForeground(Color.white);
            button7.setBorderPainted(false);
            button7.setBackground(new Color(255, 89, 143));
            button7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button7MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button7MouseExited(e);
                }
            });

            //---- label1 ----
            label1.setText("first name :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label2 ----
            label2.setText("last name:");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label3 ----
            label3.setForeground(new Color(255, 89, 143));
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label4 ----
            label4.setForeground(new Color(255, 89, 143));
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label5 ----
            label5.setForeground(new Color(255, 89, 143));
            label5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
            label5.setText("Employees menu");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(label1)
                                    .addGap(12, 12, 12)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label4, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(0, 147, Short.MAX_VALUE)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(123, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(33, 33, 33))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)))
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
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
                        .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    private JPanel panel1;
    private JLabel label13;
    private JLabel label14;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
