/*
 * Created by JFormDesigner on Sat Jul 25 22:04:07 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author mahdieh
 */
public class recive_information_to_search_by_manager extends JFrame {
    private Manager manager;
    private int number;
    private int number2;

    public recive_information_to_search_by_manager(Manager manager, int number, int number2) {   //1-name     2>>>search what?
        initComponents();
        this.manager = manager;
        this.number = number;
        this.number2 = number2;
        if (number == 1) {
            this.label1.setText("enter the desired name");
        }
        if (number == 2) {
            this.label1.setText("enter the desired last name");
        }
        if (number == 3) {
            this.label1.setText("enter the desired nationalID");
        }
        if (number == 4) {
            this.label1.setText("enter the desired phoneNumber");
        }
        if (number == 5) {
            this.label1.setText("enter the desired gender");
        }
        if (number == 6) {
            this.label1.setText("enter the desired email");
        }
        if (number == 7) {
            this.label1.setText("enter the desired birthDate");
        }
        if (number == 8) {
            this.label1.setText("enter the desired address");
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

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void button2MouseClicked(MouseEvent e) {
        if (number2 == 2) {
            search_employee_by_manager search_employee_by_manager = new search_employee_by_manager(manager);
            search_employee_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            search_employee_by_manager.setVisible(true);
            dispose();
        }
        if (number2 == 1) {
            dispose();
        }
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    private void button1MouseClicked(MouseEvent e) {
        if (number2 == 1) {
            if (number == 1) {
                manager.search_customer(1, this.textField1.getText(), false);
                dispose();
            }
            if (number == 2) {
                manager.search_customer(2, this.textField1.getText(), false);
                dispose();
            }
            if (number == 3) {
                manager.search_customer(3, this.textField1.getText(), false);
                dispose();
            }
            if (number == 4) {
                manager.search_customer(4, this.textField1.getText(), false);
                dispose();
            }
            if (number == 5) {
                manager.search_customer(5, this.textField1.getText(), false);
                dispose();
            }
            if (number == 6) {
                manager.search_customer(6, this.textField1.getText(), false);
                dispose();
            }
            if (number == 7) {
                manager.search_customer(7, this.textField1.getText(), false);
                dispose();
            }
            if (number == 8) {
                manager.search_customer(8, this.textField1.getText(), false);
                dispose();
            }
        }
        if (number2 == 2) {
            if (number == 1) {
                manager.search_employee(manager, this.textField1.getText(), 1);
                dispose();
            }
            if (number == 2) {
                manager.search_employee(manager, this.textField1.getText(), 2);
                dispose();
            }
            if (number == 3) {
                manager.search_employee(manager, this.textField1.getText(), 3);
                dispose();
            }
            if (number == 4) {
                manager.search_employee(manager, this.textField1.getText(), 4);
                dispose();
            }
            if (number == 5) {
                manager.search_employee(manager, this.textField1.getText(), 5);
                dispose();
            }
            if (number == 6) {
                manager.search_employee(manager, this.textField1.getText(), 6);
                dispose();
            }
            if (number == 7) {
                manager.search_employee(manager, this.textField1.getText(), 7);
                dispose();
            }
            if (number == 8) {
                manager.search_employee(manager, this.textField1.getText(), 8);
                dispose();
            }

        }
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
            panel1.setBorder(new LineBorder(Color.white, 4));
            panel1.setBorder(new CompoundBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Dia\u006cog"
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

            //---- textField1 ----
            textField1.setBackground(new Color(75, 60, 110));
            textField1.setForeground(Color.white);

            //---- button1 ----
            button1.setText("search");
            button1.setBackground(new Color(255, 89, 143));
            button1.setBorderPainted(false);
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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(75, 75, 75)
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(31, 31, 31)
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(35, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(0, 58, Short.MAX_VALUE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 17, Short.MAX_VALUE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(86, 86, 86))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(24, 24, 24))))
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
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JLabel label13;
    private JLabel label14;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
