/*
 * Created by JFormDesigner on Fri Jul 24 12:13:24 IRDT 2020
 */

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author mahdieh
 */
public class Recovery_passsword_pannel extends JFrame {
    public Recovery_passsword_pannel() {
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

    private void button1MouseClicked(MouseEvent e) {
        boolean a = false;
        if (textField1.getText().equals("")) {
            OK ok = new OK("                  Enter your nationalID!", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else a = true;
        if (a) {
            a = false;
            String animal = "";
            if (DogBox.isSelected()) {
                a = true;
                animal = "dog";
            } else if (CatBox.isSelected()) {
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
                if (FranceBox1.isSelected()) {
                    a = true;
                    country = "france";
                } else if (AustraliaBox2.isSelected()) {
                    a = true;
                    country = "australia";
                } else if (JpanBox.isSelected()) {
                    a = true;
                    country = "japan";
                } else if (BrazilkBox.isSelected()) {
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
                    if (BlueBox.isSelected()) {
                        a = true;
                        color = "blue";
                    } else if (RedBox.isSelected()) {
                        a = true;
                        color = "red";
                    } else if (GreenBox.isSelected()) {
                        a = true;
                        color = "green";
                    } else if (OrangeBox.isSelected()) {
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
                        if (BananaBox.isSelected()) {
                            a = true;
                            fruit = "banana";
                        } else if (AppleBox.isSelected()) {
                            a = true;
                            fruit = "apple";
                        } else if (OrageBox.isSelected()) {
                            a = true;
                            fruit = "orange";
                        } else if (GrapesBox.isSelected()) {
                            a = true;
                            fruit = "grapes";
                        } else {
                            OK ok = new OK("    favorite fruit was not selected", 1);
                            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            ok.setVisible(true);
                        }
                        if (a) {
                            Main.password_recovery(this.textField1.getText(), animal, country, color, fruit);
                            dispose();

                        }
                    }
                }
            }
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        loginpage loginpage = new loginpage();
        loginpage.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        loginpage.setVisible(true);
        dispose();
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel1 = new JPanel();
        label6 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        DogBox = new JCheckBox();
        CatBox = new JCheckBox();
        Parrot_checkBox = new JCheckBox();
        HamestercheckBox_ = new JCheckBox();
        FranceBox1 = new JCheckBox();
        AustraliaBox2 = new JCheckBox();
        JpanBox = new JCheckBox();
        BrazilkBox = new JCheckBox();
        BlueBox = new JCheckBox();
        RedBox = new JCheckBox();
        GreenBox = new JCheckBox();
        OrangeBox = new JCheckBox();
        BananaBox = new JCheckBox();
        AppleBox = new JCheckBox();
        OrageBox = new JCheckBox();
        GrapesBox = new JCheckBox();
        button1 = new JButton();
        textField1 = new JTextField();
        label13 = new JLabel();
        label14 = new JLabel();
        button2 = new JButton();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(75, 60, 110));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
                    .border.EmptyBorder(0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder
                    .CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog", java.
                    awt.Font.BOLD, 12), java.awt.Color.red), panel1.getBorder()))
            ;
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e
                ) {
                    if ("\u0062ord\u0065r".equals(e.getPropertyName())) throw new RuntimeException();
                }
            })
            ;

            //---- label6 ----
            label6.setText("password recovery");
            label6.setForeground(new Color(255, 89, 143));
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
            label6.setBackground(new Color(255, 89, 143));

            //---- label1 ----
            label1.setText("Enter your nationalID :");
            label1.setForeground(Color.white);
            label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label3 ----
            label3.setText("Choose your favorite animal");
            label3.setForeground(Color.white);
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label4 ----
            label4.setText("Choose your favorite country");
            label4.setForeground(Color.white);
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label5 ----
            label5.setText("Choose your favorite color");
            label5.setForeground(Color.white);
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label7 ----
            label7.setText("Choose your favorite fruit");
            label7.setForeground(Color.white);
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- DogBox ----
            DogBox.setText("Dog");
            DogBox.setBackground(new Color(75, 60, 110));
            DogBox.setForeground(Color.white);

            //---- CatBox ----
            CatBox.setText("Cat");
            CatBox.setBackground(new Color(75, 60, 110));
            CatBox.setForeground(Color.white);

            //---- Parrot_checkBox ----
            Parrot_checkBox.setText("Parrot");
            Parrot_checkBox.setBackground(new Color(75, 60, 110));
            Parrot_checkBox.setForeground(Color.white);

            //---- HamestercheckBox_ ----
            HamestercheckBox_.setText("Hamster");
            HamestercheckBox_.setBackground(new Color(75, 60, 110));
            HamestercheckBox_.setForeground(Color.white);

            //---- FranceBox1 ----
            FranceBox1.setText("France");
            FranceBox1.setBackground(new Color(75, 60, 110));
            FranceBox1.setForeground(Color.white);
            FranceBox1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- AustraliaBox2 ----
            AustraliaBox2.setText("Australia");
            AustraliaBox2.setBackground(new Color(75, 60, 110));
            AustraliaBox2.setForeground(Color.white);
            AustraliaBox2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- JpanBox ----
            JpanBox.setText("Japan");
            JpanBox.setBackground(new Color(75, 60, 110));
            JpanBox.setForeground(Color.white);
            JpanBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- BrazilkBox ----
            BrazilkBox.setText("Brazil");
            BrazilkBox.setBackground(new Color(75, 60, 110));
            BrazilkBox.setForeground(Color.white);
            BrazilkBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- BlueBox ----
            BlueBox.setText("Blue");
            BlueBox.setBackground(new Color(75, 60, 110));
            BlueBox.setForeground(Color.white);
            BlueBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- RedBox ----
            RedBox.setText("Red");
            RedBox.setBackground(new Color(75, 60, 110));
            RedBox.setForeground(Color.white);
            RedBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- GreenBox ----
            GreenBox.setText("Green");
            GreenBox.setBackground(new Color(75, 60, 110));
            GreenBox.setForeground(Color.white);
            GreenBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- OrangeBox ----
            OrangeBox.setText("Orange");
            OrangeBox.setBackground(new Color(75, 60, 110));
            OrangeBox.setForeground(Color.white);
            OrangeBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- BananaBox ----
            BananaBox.setText("Banana");
            BananaBox.setBackground(new Color(75, 60, 110));
            BananaBox.setForeground(Color.white);
            BananaBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- AppleBox ----
            AppleBox.setText("Apple");
            AppleBox.setBackground(new Color(75, 60, 110));
            AppleBox.setForeground(Color.white);
            AppleBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- OrageBox ----
            OrageBox.setText("Orange");
            OrageBox.setBackground(new Color(75, 60, 110));
            OrageBox.setForeground(Color.white);
            OrageBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- GrapesBox ----
            GrapesBox.setText("Grapes");
            GrapesBox.setBackground(new Color(75, 60, 110));
            GrapesBox.setForeground(Color.white);
            GrapesBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- button1 ----
            button1.setText("recovery");
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

            //---- textField1 ----
            textField1.setBackground(new Color(75, 60, 110));
            textField1.setForeground(Color.white);
            textField1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

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

            //---- button2 ----
            button2.setText("cancel");
            button2.setForeground(Color.white);
            button2.setBackground(new Color(255, 89, 143));
            button2.setBorderPainted(false);
            button2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
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
                                    .addGap(17, 17, 17)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(DogBox)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(CatBox)
                                                                    .addGap(29, 29, 29)
                                                                    .addComponent(Parrot_checkBox))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(FranceBox1)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(AustraliaBox2)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(JpanBox))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(BlueBox)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(RedBox)
                                                                    .addGap(32, 32, 32)
                                                                    .addComponent(GreenBox)))
                                                    .addGap(21, 21, 21)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(OrangeBox)
                                                            .addComponent(BrazilkBox)
                                                            .addComponent(HamestercheckBox_)))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(38, 38, 38)
                                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(BananaBox)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(AppleBox)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(OrageBox)))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(GrapesBox)))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(label1)
                                    .addGap(25, 25, 25)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(0, 11, Short.MAX_VALUE)
                                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(149, 149, 149)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(17, 17, 17)
                                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(26, 26, 26)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(42, 42, 42)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DogBox)
                                            .addComponent(HamestercheckBox_)
                                            .addComponent(Parrot_checkBox)
                                            .addComponent(CatBox))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FranceBox1)
                                            .addComponent(AustraliaBox2)
                                            .addComponent(JpanBox)
                                            .addComponent(BrazilkBox))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BlueBox)
                                            .addComponent(RedBox)
                                            .addComponent(GreenBox)
                                            .addComponent(OrangeBox))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BananaBox)
                                            .addComponent(AppleBox)
                                            .addComponent(OrageBox)
                                            .addComponent(GrapesBox))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18))
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
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(DogBox);
        buttonGroup1.add(CatBox);
        buttonGroup1.add(Parrot_checkBox);
        buttonGroup1.add(HamestercheckBox_);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(FranceBox1);
        buttonGroup2.add(AustraliaBox2);
        buttonGroup2.add(JpanBox);
        buttonGroup2.add(BrazilkBox);

        //---- buttonGroup3 ----
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(BlueBox);
        buttonGroup3.add(RedBox);
        buttonGroup3.add(GreenBox);
        buttonGroup3.add(OrangeBox);

        //---- buttonGroup4 ----
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(BananaBox);
        buttonGroup4.add(AppleBox);
        buttonGroup4.add(OrageBox);
        buttonGroup4.add(GrapesBox);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    private JPanel panel1;
    private JLabel label6;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JCheckBox DogBox;
    private JCheckBox CatBox;
    private JCheckBox Parrot_checkBox;
    private JCheckBox HamestercheckBox_;
    private JCheckBox FranceBox1;
    private JCheckBox AustraliaBox2;
    private JCheckBox JpanBox;
    private JCheckBox BrazilkBox;
    private JCheckBox BlueBox;
    private JCheckBox RedBox;
    private JCheckBox GreenBox;
    private JCheckBox OrangeBox;
    private JCheckBox BananaBox;
    private JCheckBox AppleBox;
    private JCheckBox OrageBox;
    private JCheckBox GrapesBox;
    private JButton button1;
    private JTextField textField1;
    private JLabel label13;
    private JLabel label14;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
