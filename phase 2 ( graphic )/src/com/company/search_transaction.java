/*
 * Created by JFormDesigner on Tue Jul 28 14:41:37 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mahdieh
 */
public class search_transaction extends JFrame {
    public search_transaction() {
        initComponents();
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

    private void button4MouseEntered(MouseEvent e) {
        button4.setBackground(new Color(255, 69, 120));
    }

    private void button4MouseExited(MouseEvent e) {
        button4.setBackground(new Color(255, 89, 143));
    }

    protected void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        label1 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
                    new javax.swing.border.EmptyBorder(0, 0, 0, 0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e"
                    , javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM
                    , new java.awt.Font("D\u0069al\u006fg", java.awt.Font.BOLD, 12)
                    , java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(
                    new java.beans.PropertyChangeListener() {
                        @Override
                        public void propertyChange(java.beans.PropertyChangeEvent e
                        ) {
                            if ("\u0062or\u0064er".equals(e.getPropertyName())) throw new RuntimeException()
                                    ;
                        }
                    });

            //---- button1 ----
            button1.setText("source account");
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
            button2.setText("date");
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
            button3.setText("time");
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
            button4.setText("money exchanged");
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
            button5.setText("type");
            button5.setBackground(new Color(255, 89, 143));
            button5.setBorderPainted(false);
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
            button6.setText("destination account");
            button6.setBackground(new Color(255, 89, 143));
            button6.setBorderPainted(false);
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
            button7.setText("back");
            button7.setBackground(new Color(255, 89, 143));
            button7.setBorderPainted(false);
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

            //---- label1 ----
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            label1.setText("search based on :");

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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(108, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(0, 134, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(126, 126, 126))))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(146, Short.MAX_VALUE)
                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
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
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
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
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel label1;
    private JLabel label13;
    private JLabel label14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
