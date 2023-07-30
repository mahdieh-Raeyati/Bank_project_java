package com.company;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author mahdieh
 */
public class Customer_menu extends JFrame {
    private Customer customer;

    public Customer_menu(Customer customer) {
        initComponents();
        this.lastname_label.setText(customer.lastName);
        this.first_name_label.setText(customer.firstName);
        this.customer = customer;
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

    private void Money_transfer_buttonMouseEntered(MouseEvent e) {
        Money_transfer_button.setBackground(new Color(255, 69, 120));
    }

    private void Money_transfer_buttonMouseExited(MouseEvent e) {
        Money_transfer_button.setBackground(new Color(255, 89, 143));
    }

    private void Available_accounts_list_buttonMouseEntered(MouseEvent e) {
        Available_accounts_list_button.setBackground(new Color(255, 69, 120));
    }

    private void Available_accounts_list_buttonMouseExited(MouseEvent e) {
        Available_accounts_list_button.setBackground(new Color(255, 89, 143));
    }

    private void Create_a_newaccount_buttonMouseEntered(MouseEvent e) {
        Create_a_newaccount_button.setBackground(new Color(255, 69, 120));
    }

    private void Create_a_newaccount_buttonMouseExited(MouseEvent e) {
        Create_a_newaccount_button.setBackground(new Color(255, 89, 143));
    }

    private void Delete_an_accountbuttonMouseEntered(MouseEvent e) {
        Delete_an_accountbutton.setBackground(new Color(255, 69, 120));
    }

    private void Delete_an_accountbuttonMouseExited(MouseEvent e) {
        Delete_an_accountbutton.setBackground(new Color(255, 89, 143));
    }

    private void Financial_transactions_listbuttonMouseEntered(MouseEvent e) {
        Financial_transactions_listbutton.setBackground(new Color(255, 69, 120));
    }

    private void Financial_transactions_listbuttonMouseExited(MouseEvent e) {
        Financial_transactions_listbutton.setBackground(new Color(255, 89, 143));
    }

    private void Change_password_buttonMouseEntered(MouseEvent e) {
        Change_password_button.setBackground(new Color(255, 69, 120));
    }

    private void Change_password_buttonMouseExited(MouseEvent e) {
        Change_password_button.setBackground(new Color(255, 89, 143));
    }

    private void Money_transfer_buttonKeyPressed(KeyEvent e) {
        transfermoney_by_customer transfermoney_by_customer = new transfermoney_by_customer(customer);
        transfermoney_by_customer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        transfermoney_by_customer.setVisible(true);
        dispose();
    }

    private void Money_transfer_buttonMouseClicked(MouseEvent e) {

        transfermoney_by_customer transfermoney_by_customer = new transfermoney_by_customer(customer);
        transfermoney_by_customer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        transfermoney_by_customer.setVisible(true);
        dispose();
    }

    private void Available_accounts_list_buttonMouseClicked(MouseEvent e) {
        customer.show_available_account();
    }

    private void Create_a_newaccount_buttonMouseClicked(MouseEvent e) {
        customer.create_account(customer.nationalID, "0", 3, 1);
    }

    private void button6MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void Delete_an_accountbuttonMouseClicked(MouseEvent e) {
        recive_information_from_customer delet_account_panel_customer = new recive_information_from_customer(customer, 1);
        delet_account_panel_customer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        delet_account_panel_customer.setVisible(true);
        dispose();
    }

    private void Financial_transactions_listbuttonMouseClicked(MouseEvent e) {
        recive_information_from_customer recive_information_from_customer = new recive_information_from_customer(customer, 2);
        recive_information_from_customer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_from_customer.setVisible(true);
        dispose();
    }

    private void Change_password_buttonMouseClicked(MouseEvent e) {
        password_pannel_customer password_pannel_customer = new password_pannel_customer(customer, 2);
        password_pannel_customer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        password_pannel_customer.setVisible(true);
        dispose();
    }

//    private void Create_a_newaccount_button2MouseEntered(MouseEvent e) {
//        // TODO add your code here
//    }
//
//    private void Create_a_newaccount_button2MouseExited(MouseEvent e) {
//        // TODO add your code here
//    }
//
//    private void Create_a_new_saving_account_buttonMouseEntered(MouseEvent e) {
//        // TODO add your code here
//    }
//
//    private void Create_a_new_saving_account_buttonMouseExited(MouseEvent e) {
//        // TODO add your code here
//    }
//
//    private void Create_a_new_saving_account_buttonMouseClicked(MouseEvent e) {
//        // TODO add your code here
//    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    private void button1MouseClicked(MouseEvent e) {
        customer.create_account(customer.nationalID, "0", 3, 2);
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseClicked(MouseEvent e) {
        countinuous_deposit doreI = new countinuous_deposit(customer);
        doreI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        doreI.setVisible(true);
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        lastname_label = new JLabel();
        Available_accounts_list_button = new JButton();
        Create_a_newaccount_button = new JButton();
        Change_password_button = new JButton();
        Financial_transactions_listbutton = new JButton();
        Delete_an_accountbutton = new JButton();
        Money_transfer_button = new JButton();
        label13 = new JLabel();
        label14 = new JLabel();
        first_name_label = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
                    .EmptyBorder(0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder.CENTER, javax
                    .swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog", java.awt.Font.BOLD,
                    12), java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans
                    .PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062ord\u0065r".equals(e.
                            getPropertyName())) throw new RuntimeException();
                }
            });

            //---- label1 ----
            label1.setText("First name  :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label2 ----
            label2.setText("Last name  :");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- lastname_label ----
            lastname_label.setForeground(new Color(255, 89, 143));
            lastname_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- Available_accounts_list_button ----
            Available_accounts_list_button.setText("Available accounts list");
            Available_accounts_list_button.setBackground(new Color(255, 89, 143));
            Available_accounts_list_button.setBorderPainted(false);
            Available_accounts_list_button.setForeground(Color.white);
            Available_accounts_list_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Available_accounts_list_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Available_accounts_list_buttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Available_accounts_list_buttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Available_accounts_list_buttonMouseExited(e);
                }
            });

            //---- Create_a_newaccount_button ----
            Create_a_newaccount_button.setText("Create a new current account");
            Create_a_newaccount_button.setBackground(new Color(255, 89, 143));
            Create_a_newaccount_button.setBorderPainted(false);
            Create_a_newaccount_button.setForeground(Color.white);
            Create_a_newaccount_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Create_a_newaccount_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Create_a_newaccount_buttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Create_a_newaccount_buttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Create_a_newaccount_buttonMouseExited(e);
                }
            });

            //---- Change_password_button ----
            Change_password_button.setText("Change password");
            Change_password_button.setBackground(new Color(255, 89, 143));
            Change_password_button.setBorderPainted(false);
            Change_password_button.setForeground(Color.white);
            Change_password_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Change_password_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Change_password_buttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Change_password_buttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Change_password_buttonMouseExited(e);
                }
            });

            //---- Financial_transactions_listbutton ----
            Financial_transactions_listbutton.setText("Financial transactions list");
            Financial_transactions_listbutton.setBackground(new Color(255, 89, 143));
            Financial_transactions_listbutton.setBorderPainted(false);
            Financial_transactions_listbutton.setForeground(Color.white);
            Financial_transactions_listbutton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Financial_transactions_listbutton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Financial_transactions_listbuttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Financial_transactions_listbuttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Financial_transactions_listbuttonMouseExited(e);
                }
            });

            //---- Delete_an_accountbutton ----
            Delete_an_accountbutton.setText("Delete an account");
            Delete_an_accountbutton.setBackground(new Color(255, 89, 143));
            Delete_an_accountbutton.setBorderPainted(false);
            Delete_an_accountbutton.setForeground(Color.white);
            Delete_an_accountbutton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Delete_an_accountbutton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Delete_an_accountbuttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Delete_an_accountbuttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Delete_an_accountbuttonMouseExited(e);
                }
            });

            //---- Money_transfer_button ----
            Money_transfer_button.setText("Money transfer");
            Money_transfer_button.setBackground(new Color(255, 89, 143));
            Money_transfer_button.setBorderPainted(false);
            Money_transfer_button.setForeground(Color.white);
            Money_transfer_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            Money_transfer_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Money_transfer_buttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button6MouseEntered(e);
                    Money_transfer_buttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Money_transfer_buttonMouseExited(e);
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

            //---- first_name_label ----
            first_name_label.setForeground(new Color(255, 89, 143));
            first_name_label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label5 ----
            label5.setForeground(new Color(255, 89, 143));
            label5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
            label5.setText("Customers menu");

            //---- button1 ----
            button1.setText("Create a new saving account");
            button1.setForeground(Color.white);
            button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button1.setBackground(new Color(255, 89, 143));
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
            button2.setText(" set continuos deposit ");
            button2.setForeground(Color.white);
            button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button2.setBackground(new Color(255, 89, 143));
            button2.setBorderPainted(false);
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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(31, 31, 31)
                                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(first_name_label, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lastname_label, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(Create_a_newaccount_button, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(Available_accounts_list_button, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(Money_transfer_button, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(Delete_an_accountbutton, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(Financial_transactions_listbutton, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(Change_password_button, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(first_name_label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastname_label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addComponent(Money_transfer_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Available_accounts_list_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Create_a_newaccount_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Delete_an_accountbutton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Financial_transactions_listbutton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Change_password_button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(39, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
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
    private JLabel label1;
    private JLabel label2;
    private JLabel lastname_label;
    private JButton Available_accounts_list_button;
    private JButton Create_a_newaccount_button;
    private JButton Change_password_button;
    private JButton Financial_transactions_listbutton;
    private JButton Delete_an_accountbutton;
    private JButton Money_transfer_button;
    private JLabel label13;
    private JLabel label14;
    private JLabel first_name_label;
    private JLabel label5;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
