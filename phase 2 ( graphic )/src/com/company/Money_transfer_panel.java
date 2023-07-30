package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author mahdieh
 */
public class Money_transfer_panel extends JFrame {
    public Money_transfer_panel() {
        initComponents();
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
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

    protected void button1MouseClicked(MouseEvent e) {
    }

    protected void button2MouseClicked(MouseEvent e) {
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label13 = new JLabel();
        label14 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0
                    , 0, 0, 0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM
                    , new Font("D\u0069al\u006fg", Font.BOLD, 12), Color.red),
                    panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e
                ) {
                    if ("\u0062or\u0064er".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });

            //---- label1 ----
            label1.setText("Source account number :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- textField1 ----
            textField1.setBackground(new Color(75, 60, 110));
            textField1.setForeground(Color.white);

            //---- label3 ----
            label3.setText("Destination account number :");
            label3.setForeground(Color.white);
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- textField2 ----
            textField2.setBackground(new Color(75, 60, 110));
            textField2.setForeground(Color.white);

            //---- button1 ----
            button1.setText("transfer");
            button1.setBackground(new Color(255, 89, 143));
            button1.setForeground(Color.white);
            button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
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
            button2.setText("back");
            button2.setBackground(new Color(255, 89, 143));
            button2.setForeground(Color.white);
            button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
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

            //---- label4 ----
            label4.setText("Amount of money :");
            label4.setForeground(Color.white);
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- textField3 ----
            textField3.setBackground(new Color(75, 60, 110));
            textField3.setForeground(Color.white);

            //---- label5 ----
            label5.setText("Rial");
            label5.setForeground(Color.white);
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(35, 35, 35)
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(179, 179, 179))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(label5))
                                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(20, 20, 20))))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                    .addContainerGap(85, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(22, 22, 22))))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
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
    protected JLabel label1;
    protected JTextField textField1;
    protected JLabel label3;
    protected JTextField textField2;
    protected JButton button1;
    private JButton button2;
    protected JLabel label13;
    protected JLabel label14;
    protected JLabel label4;
    protected JTextField textField3;
    protected JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
