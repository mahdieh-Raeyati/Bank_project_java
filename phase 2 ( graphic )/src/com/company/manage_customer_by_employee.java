/*
 * Created by JFormDesigner on Mon Jul 27 20:15:49 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mahdieh
 */
public class manage_customer_by_employee extends JFrame {
    Employee employee;

    public manage_customer_by_employee(Employee employee) {
        initComponents();
        this.employee = employee;
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

    private void button1MouseClicked(MouseEvent e) {
        register_customer_by_employee register_customer_by_employee =
                new register_customer_by_employee(employee);
        register_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        register_customer_by_employee.setVisible(true);
        dispose();
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_to_search_by_employee =
                new recive_information_by_employee(employee, 9);
        recive_information_to_search_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_search_by_employee.setVisible(true);
        dispose();
    }

    private void button3MouseEntered(MouseEvent e) {
        button3.setBackground(new Color(255, 69, 120));
    }

    private void button3MouseExited(MouseEvent e) {
        button3.setBackground(new Color(255, 89, 143));
    }

    private void button3MouseClicked(MouseEvent e) {
        recive_information_by_employee recive_information_by_employee = new
                recive_information_by_employee(employee, 10);
        recive_information_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_employee.setVisible(true);
        dispose();
    }

    private void button4MouseEntered(MouseEvent e) {
        button4.setBackground(new Color(255, 69, 120));
    }

    private void button4MouseExited(MouseEvent e) {
        button4.setBackground(new Color(255, 89, 143));
    }

    private void button4MouseClicked(MouseEvent e) {
        employee.show_customers_list();
    }

    private void button5MouseEntered(MouseEvent e) {
        button5.setBackground(new Color(255, 69, 120));
    }

    private void button5MouseExited(MouseEvent e) {
        button5.setBackground(new Color(255, 89, 143));
    }

    private void button5MouseClicked(MouseEvent e) {
        search_customer_by_employee search_customer_by_employee = new search_customer_by_employee(employee);
        search_customer_by_employee.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        search_customer_by_employee.setVisible(true);
        dispose();
    }

    private void button6MouseEntered(MouseEvent e) {
        button6.setBackground(new Color(255, 69, 120));
    }

    private void button6MouseExited(MouseEvent e) {
        button6.setBackground(new Color(255, 89, 143));
    }

    private void button6MouseClicked(MouseEvent e) {
        employee_main_menu employee_main_menu = new employee_main_menu(employee);
        employee_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        employee_main_menu.setVisible(true);
        dispose();
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

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
                    0, 0, 0, 0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder
                    .BOTTOM, new Font("D\u0069alog", Font.BOLD, 12), Color.
                    red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.
                                                   beans.PropertyChangeEvent e) {
                    if ("\u0062order".equals(e.getPropertyName())) throw new RuntimeException();
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
            button1.setText("create a customer");
            button1.setBackground(new Color(255, 89, 143));
            button1.setBorderPainted(false);
            button1.setForeground(Color.white);
            button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button2.setText("delete a customer");
            button2.setBackground(new Color(255, 89, 143));
            button2.setBorderPainted(false);
            button2.setForeground(Color.white);
            button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button3.setText("edit a customer");
            button3.setBackground(new Color(255, 89, 143));
            button3.setBorderPainted(false);
            button3.setForeground(Color.white);
            button3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button4.setText("list of customers");
            button4.setBackground(new Color(255, 89, 143));
            button4.setBorderPainted(false);
            button4.setForeground(Color.white);
            button4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button5.setText("search a customer");
            button5.setForeground(Color.white);
            button5.setBackground(new Color(255, 89, 143));
            button5.setBorderPainted(false);
            button5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button6.setText("back");
            button6.setForeground(Color.white);
            button6.setBorderPainted(false);
            button6.setBackground(new Color(255, 89, 143));
            button6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button6MouseEntered(e);
                    button6MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button6MouseExited(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(119, 119, 119)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(165, 165, 165)
                                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(149, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 15, Short.MAX_VALUE))
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
    private JLabel label13;
    private JLabel label14;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
