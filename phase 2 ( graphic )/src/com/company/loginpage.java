/*
 * Created by JFormDesigner on Mon Jul 13 12:40:27 IRDT 2020
 */

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author unknown
 */
public class loginpage extends JFrame {
    public loginpage() {
        initComponents();
    }

    private void textField1FocusGained(FocusEvent e) {
        if (usernameField.getText().trim().toLowerCase().equals("username")) {
            usernameField.setText("");
            usernameField.setForeground(new Color(255, 255, 255));
        }
    }

    private void textField1FocusLost(FocusEvent e) {
        if (usernameField.getText().trim().equals("") || usernameField.getText().trim().toLowerCase().equals("username")) {
            usernameField.setText("  Username");
            usernameField.setForeground(new Color(255, 255, 255));
        }
    }

    private void passwordField1FocusGained(FocusEvent e) {
        String pass = String.valueOf(passwordField1.getPassword());
        if (pass.trim().toLowerCase().equals("password")) {
            passwordField1.setText("");
            passwordField1.setForeground(new Color(255, 255, 255));
        }
    }

    private void passwordField1FocusLost(FocusEvent e) {
        String pass = String.valueOf(passwordField1.getPassword());
        if (pass.trim().equals("") | pass.trim().toLowerCase().equals("Password")) {
            passwordField1.setText("Password");
            passwordField1.setForeground(new Color(255, 255, 255));
        }
    }

    private void label2MouseEntered(MouseEvent e) {
        label2.setForeground(new Color(255, 89, 143));
    }

    private void label2MouseExited(MouseEvent e) {
        label2.setForeground(new Color(242, 242, 242));
    }

    private void signin_buttonMouseEntered(MouseEvent e) {
        signin_button.setBackground(new Color(255, 69, 120));
    }

    private void signin_buttonMouseExited(MouseEvent e) {
        signin_button.setBackground(new Color(255, 89, 143));
    }

    private void button4MouseEntered(MouseEvent e) {
        button4.setBackground(new Color(255, 69, 120));
    }

    private void button4MouseExited(MouseEvent e) {
        button4.setBackground(new Color(255, 89, 143));
    }

//    private void panel2MouseClicked(MouseEvent e) {
//        this.setState(JFrame.ICONIFIED);
//    }
//
//    private void panel3MouseClicked(MouseEvent e) {
//
//        System.exit(0);
//    }

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

    private void signin_buttonMouseClicked(MouseEvent e) {

        Main.sign_in(this.usernameField.getText(), this.passwordField1.getText());
        dispose();
    }

    private void label2MouseClicked(MouseEvent e) {
        Recovery_passsword_pannel forgot_passsword_pannel = new Recovery_passsword_pannel();
        forgot_passsword_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        forgot_passsword_pannel.setVisible(true);
        dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        register_pannel register_pannel = new register_pannel();
        register_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        register_pannel.setVisible(true);
        dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label1 = new JLabel();
        usernameField = new JTextField();
        passwordField1 = new JPasswordField();
        signin_button = new JButton();
        button4 = new JButton();
        label2 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();

        //======== this ========
        setBackground(new Color(0, 144, 158));
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
                    swing.border.EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax.swing.border
                    .TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new Font("Dia\u006cog"
                    , Font.BOLD, 12), Color.red), panel1.getBorder
                    ()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java
                                                   .beans.PropertyChangeEvent e) {
                    if ("bord\u0065r".equals(e.getPropertyName())) throw new RuntimeException
                            ();
                }
            });

            //---- label1 ----
            label1.setText("_____________or_____________     ");
            label1.setForeground(Color.white);

            //---- usernameField ----
            usernameField.setForeground(Color.white);
            usernameField.setText("   Username");
            usernameField.setBackground(new Color(75, 60, 110));
            usernameField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField1FocusGained(e);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    textField1FocusLost(e);
                }
            });

            //---- passwordField1 ----
            passwordField1.setText("Password");
            passwordField1.setForeground(Color.lightGray);
            passwordField1.setBackground(new Color(75, 60, 110));
            passwordField1.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    passwordField1FocusGained(e);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    passwordField1FocusLost(e);
                }
            });

            //---- signin_button ----
            signin_button.setForeground(Color.white);
            signin_button.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
            signin_button.setBorder(null);
            signin_button.setMargin(new Insets(1, 1, 1, 1));
            signin_button.setBorderPainted(false);
            signin_button.setText("Sign in");
            signin_button.setRequestFocusEnabled(false);
            signin_button.setBackground(new Color(255, 89, 143));
            signin_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    signin_buttonMouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    signin_buttonMouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    signin_buttonMouseExited(e);
                }
            });

            //---- button4 ----
            button4.setBackground(new Color(255, 89, 143));
            button4.setForeground(Color.white);
            button4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
            button4.setBorder(null);
            button4.setMargin(new Insets(1, 1, 1, 1));
            button4.setBorderPainted(false);
            button4.setText("Sign up as a new user");
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

            //---- label2 ----
            label2.setText("Forgot your password?");
            label2.setForeground(new Color(204, 204, 204));
            label2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label2MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label2MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label2MouseExited(e);
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
                                    .addGap(189, 189, 189)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 202, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(140, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(signin_button, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(129, 129, 129))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap())
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label1)
                                                    .addGap(150, 150, 150))))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(signin_button, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30))
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
    private JLabel label1;
    private JTextField usernameField;
    private JPasswordField passwordField1;
    private JButton signin_button;
    private JButton button4;
    private JLabel label2;
    private JLabel label13;
    private JLabel label14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
