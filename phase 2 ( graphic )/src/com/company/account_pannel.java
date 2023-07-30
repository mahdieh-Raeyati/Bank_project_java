/*
 * Created by JFormDesigner on Mon Jul 27 12:11:58 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mahdieh
 */
public class account_pannel extends JFrame {
    public account_pannel() {
        initComponents();
    }

    private void button5MouseEntered(MouseEvent e) {
        button5.setBackground(new Color(255, 69, 120));
    }

    private void button5MouseExited(MouseEvent e) {
        button5.setBackground(new Color(255, 89, 143));
    }

    protected void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
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

    protected void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    protected void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseEntered(MouseEvent e) {
        button3.setBackground(new Color(255, 69, 120));
    }

    private void button3MouseExited(MouseEvent e) {
        button3.setBackground(new Color(255, 89, 143));
    }

    protected void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button6MouseEntered(MouseEvent e) {
        button6.setBackground(new Color(255, 69, 120));
    }

    private void button6MouseExited(MouseEvent e) {
        button6.setBackground(new Color(255, 89, 143));
    }

    protected void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button7MouseEntered(MouseEvent e) {
        button7.setBackground(new Color(255, 69, 120));
    }

    private void button7MouseExited(MouseEvent e) {
        button7.setBackground(new Color(255, 89, 143));
    }

    protected void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button8MouseEntered(MouseEvent e) {
        button8.setBackground(new Color(255, 69, 120));
    }

    private void button8MouseExited(MouseEvent e) {
        button8.setBackground(new Color(255, 89, 143));
    }

    protected void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button9MouseEntered(MouseEvent e) {
        button9.setBackground(new Color(255, 69, 120));
    }

    private void button9MouseExited(MouseEvent e) {
        button9.setBackground(new Color(255, 89, 143));
    }

    protected void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

//    private void button4MouseEntered(MouseEvent e) {
//        button4.setBackground(new Color(255, 69, 120));
//    }
//
//    private void button4MouseExited(MouseEvent e) {
//        button4.setBackground(new Color(255, 89, 143));
//    }
//
//    protected void button4MouseClicked(MouseEvent e) {
//        // TODO add your code here
//    }

    private void button10MouseEntered(MouseEvent e) {
        button10.setBackground(new Color(255, 69, 120));
    }

    private void button10MouseExited(MouseEvent e) {
        button10.setBackground(new Color(255, 89, 143));
    }

    protected void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        label13 = new JLabel();
        label14 = new JLabel();
        button10 = new JButton();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
                    EmptyBorder(0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder.CENTER, javax.swing
                    .border.TitledBorder.BOTTOM, new Font("Dia\u006cog", Font.BOLD, 12),
                    Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062ord\u0065r".equals(e.getPropertyName()))
                        throw new RuntimeException();
                }
            });

            //---- button1 ----
            button1.setText("create a current account");
            button1.setBorderPainted(false);
            button1.setBackground(new Color(255, 89, 143));
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
            button2.setText("edit an account");
            button2.setBorderPainted(false);
            button2.setBackground(new Color(255, 89, 143));
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
            button3.setText("delete an account");
            button3.setBorderPainted(false);
            button3.setBackground(new Color(255, 89, 143));
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

            //---- button5 ----
            button5.setText("list of accounts");
            button5.setBorderPainted(false);
            button5.setBackground(new Color(255, 89, 143));
            button5.setForeground(Color.white);
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
            button6.setText("search accounts");
            button6.setBorderPainted(false);
            button6.setBackground(new Color(255, 89, 143));
            button6.setForeground(Color.white);
            button6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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
            button7.setText("list of financial transactions");
            button7.setBorderPainted(false);
            button7.setBackground(new Color(255, 89, 143));
            button7.setForeground(Color.white);
            button7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
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

            //---- button8 ----
            button8.setText("search financial transactions");
            button8.setBorderPainted(false);
            button8.setBackground(new Color(255, 89, 143));
            button8.setForeground(Color.white);
            button8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button8MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button8MouseExited(e);
                }
            });

            //---- button9 ----
            button9.setText("back");
            button9.setBorderPainted(false);
            button9.setBackground(new Color(255, 89, 143));
            button9.setForeground(Color.white);
            button9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button9MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button9MouseExited(e);
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

            //---- button10 ----
            button10.setText("create a saving account");
            button10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button10.setForeground(Color.white);
            button10.setBorderPainted(false);
            button10.setBackground(new Color(255, 89, 143));
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button10MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button10MouseExited(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(0, 378, Short.MAX_VALUE)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                            .addComponent(button8, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                    .addContainerGap(124, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(172, Short.MAX_VALUE)
                                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                    .addGap(169, 169, 169))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(12, Short.MAX_VALUE))
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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel label13;
    private JLabel label14;
    private JButton button10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
