/*
 * Created by JFormDesigner on Mon Jul 27 13:33:57 IRDT 2020
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
public class recive_nationalID_for_account extends JFrame {
    int number1;
    int number2;

    public recive_nationalID_for_account(int number1, int number2) {
        initComponents();
        this.number2 = number2;
        this.number1 = number1;
        //  number1          1    >>>   maanger       //2 >>>>employee
        //number2            1>>> current              2>>>saving
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
        if (this.textField1.getText().equals("") | this.textField2.getText().equals("")) {
            OK ok = new OK("one or mor field are empty !", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else {
            if (!this.textField2.getText().matches("[0-9]+") | !this.textField1.getText().matches("[0-9]+")) {
                OK ok = new OK("invalid input", 1);
                ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            } else {
                this.dispose();
                Member member = new Member(null, null, null, null, null, null
                        , null, null, null);
                member.create_account(this.textField1.getText(), this.textField2.getText(), number1, number2);
                dispose();
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
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(Color.white);
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new LineBorder(Color.white, 4));
            panel1.setBorder(new CompoundBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Dia\u006cog", Font.BOLD,
                    12), Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans
                    .PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("bord\u0065r".equals(e.
                            getPropertyName())) throw new RuntimeException();
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
            label1.setText("Enter the nationalID of  desired customer :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label2 ----
            label2.setText("Specify the inventory :");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- textField1 ----
            textField1.setForeground(Color.white);
            textField1.setBackground(new Color(75, 60, 110));
            textField1.setBorder(new LineBorder(Color.white));

            //---- textField2 ----
            textField2.setForeground(Color.white);
            textField2.setBackground(new Color(75, 60, 110));
            textField2.setBorder(new LineBorder(Color.white));

            //---- button1 ----
            button1.setText("create account ");
            button1.setForeground(Color.white);
            button1.setBackground(new Color(255, 89, 143));
            button1.setBorderPainted(false);
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
            button2.setText("back");
            button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            button2.setForeground(Color.white);
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
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap(61, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(67, 67, 67))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                                                    .addGap(89, 89, 89))))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(0, 330, Short.MAX_VALUE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addContainerGap(123, Short.MAX_VALUE)
                                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(92, 92, 92)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap(128, Short.MAX_VALUE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(41, 41, 41))))
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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    private JPanel panel1;
    private JLabel label13;
    private JLabel label14;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
