/*
 * Created by JFormDesigner on Tue Jul 14 13:52:31 IRDT 2020
 */

package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author unknown
 */
public class register_pannel extends JFrame {
    public register_pannel() {
        initComponents();
    }

    private void label11MouseEntered(MouseEvent e) {
        label11.setForeground(new Color(255, 89, 143));
    }

    private void label11MouseExited(MouseEvent e) {
        label11.setForeground(new Color(242, 242, 242));
    }

    private void label13MouseEntered(MouseEvent e) {
        label13.setForeground(new Color(255, 0, 0));
    }

    private void label13MouseExited(MouseEvent e) {
        label13.setForeground(new Color(255, 89, 143));
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

    private void label13MouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void label4MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(255, 69, 120));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(new Color(255, 89, 143));
    }

    protected void button1MouseClicked(MouseEvent e) {
        boolean a = true;
        boolean ID_Exist = false;
        String data = "";
        Gson gson = new Gson();
        File file = new File("customer profile.json");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        if (file.exists()) {
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    data += reader.nextLine();
                }
                reader.close();
            } catch (IOException E) {
                E.printStackTrace();
            }
            customers = gson.fromJson(data, new TypeToken<ArrayList<Customer>>() {
            }.getType());
            for (Customer customer : customers) {
                if (customer.nationalID.equals(NationalIDField3.getText())) {
                    a = false;
                    ID_Exist = true;
                }
            }
        }
        if (FirstnField1.getText().equals("")) {
            label1.setText("*necessary");
            a = false;
        } else if ((!FirstnField1.getText().matches("[a-zA-Z]+"))) {
            label1.setText("*Enter name correctly");
            a = false;
        } else {
            label1.setText("");
        }
        boolean lnm = true;
        if (LastnameField.getText().equals("")) {
            label15.setText("*necessary");
            a = false;
            lnm = false;
        } else if ((!LastnameField.getText().matches("[a-zA-Z]+")) && (lnm)) {
            label15.setText("*Enter last name correctly");
            a = false;
        } else {
            label15.setText("");
        }
        if (NationalIDField3.getText().equals("")) {
            label16.setText("*necessary");
            a = false;
        } else if (!((NationalIDField3.getText().length() == 10) && (NationalIDField3.getText().matches("[0-9]+")))) {
            label16.setText("*NationalID  must be 10 numbers");
            a = false;
        } else if (ID_Exist) {
            label16.setText("*there is an employee with this ID");
        } else {
            label16.setText("");
        }
        if (phoneField5.getText().equals("")) {
            label17.setText("*necessary");
            a = false;
        } else if (!((phoneField5.getText().length() == 11) && (phoneField5.getText().matches("[0-9]+")))) {
            label17.setText("*invalid");
            a = false;
        } else {
            label17.setText("");
        }
        if (Email.getText().equals("")) {
            label19.setText("*necessary");
            a = false;

        } else if (!((Email.getText().contains("@") && Email.getText().contains(".")))) {
            label19.setText("*invalid Email");
            a = false;
        } else {
            label19.setText("");
        }

        if (address.getText().equals("")) {
            label21.setText("*necessary");
            a = false;
        } else {
            label21.setText("");
        }
        if (!(FemailButton2.isSelected() | MailButton3.isSelected())) {
            label18.setText("*choose a gender");
            a = false;
        } else {
            label18.setText("");
        }
        String birthdate = comboBox1.getSelectedItem().toString() + "/" + comboBox2.getSelectedItem().toString() +
                "/" + comboBox3.getSelectedItem().toString();
        if (a) {
            String gender = "";
            if (MailButton3.isSelected()) {
                gender = "male";
            }
            if (FemailButton2.isSelected()) {
                gender = "female";
            }
            Customer cUstomer = new Customer(FirstnField1.getText(), LastnameField.getText(), NationalIDField3.getText()
                    , phoneField5.getText(), gender, Email.getText(), birthdate, address.getText(),
                    "password", "animal", "country", "color", "fruit");
            password_pannel_customer password_pannel_customer = new password_pannel_customer(cUstomer, 1);
            password_pannel_customer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            password_pannel_customer.setVisible(true);
            dispose();
        }
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(255, 69, 120));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(new Color(255, 89, 143));
    }

    protected void button2MouseClicked(MouseEvent e) {
        Main.login();
        dispose();
    }

//    private void label25MouseEntered(MouseEvent e) {
//        label25.setForeground(new Color(255, 0, 0));
//    }
//
//    private void label25MouseExited(MouseEvent e) {
//        label25.setForeground(new Color(255, 89, 143));
//    }
//
//    private void label25MouseClicked(MouseEvent e) {
//       System.exit(0);
//    }

//    private void label26MouseEntered(MouseEvent e) {
//        label26.setForeground(new Color(255, 0, 0));
//    }
//
//    private void label26MouseExited(MouseEvent e) {
//        label26.setForeground(new Color(255, 0, 0));
//    }
//
//    private void label26MouseClicked(MouseEvent e) {
//        this.setState(JFrame.ICONIFIED);
//    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mahdieh
        panel5 = new JPanel();
        label2 = new JLabel();
        FirstnField1 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        NationalIDField3 = new JTextField();
        LastnameField = new JTextField();
        address = new JTextField();
        phoneField5 = new JTextField();
        Email = new JTextField();
        button1 = new JButton();
        label11 = new JLabel();
        FemailButton2 = new JRadioButton();
        MailButton3 = new JRadioButton();
        label1 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        button2 = new JButton();
        comboBox1 = new JComboBox<>();
        label12 = new JLabel();
        label22 = new JLabel();
        comboBox2 = new JComboBox<>();
        label23 = new JLabel();
        comboBox3 = new JComboBox<>();
        label21 = new JLabel();
        label17 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();

        //======== this ========
        setUndecorated(true);
        Container contentPane = getContentPane();

        //======== panel5 ========
        {
            panel5.setBackground(new Color(75, 60, 110));
            panel5.setForeground(Color.white);
            panel5.setAutoscrolls(true);
            panel5.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
                    .EmptyBorder(0, 0, 0, 0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax.swing.border.TitledBorder.CENTER, javax
                    .swing.border.TitledBorder.BOTTOM, new java.awt.Font("D\u0069alog", java.awt.Font.BOLD,
                    12), java.awt.Color.red), panel5.getBorder()));
            panel5.addPropertyChangeListener(new java.beans
                    .PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062order".equals(e.
                            getPropertyName())) throw new RuntimeException();
                }
            });

            //---- label2 ----
            label2.setText("First name :");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- FirstnField1 ----
            FirstnField1.setBackground(new Color(75, 60, 110));
            FirstnField1.setForeground(Color.white);

            //---- label3 ----
            label3.setText("Last name :");
            label3.setForeground(Color.white);
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label4 ----
            label4.setText("Phone :");
            label4.setForeground(Color.white);
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
            label4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    label4MouseEntered(e);
                }
            });

            //---- label5 ----
            label5.setText("Address :");
            label5.setForeground(Color.white);
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label6 ----
            label6.setText("Email :");
            label6.setForeground(Color.white);
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label7 ----
            label7.setText("National ID :");
            label7.setForeground(Color.white);
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label8 ----
            label8.setText("Register");
            label8.setForeground(new Color(255, 89, 143));
            label8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));

            //---- label9 ----
            label9.setText("Gender :");
            label9.setForeground(Color.white);
            label9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- label10 ----
            label10.setText("Birthdate :");
            label10.setForeground(Color.white);
            label10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

            //---- NationalIDField3 ----
            NationalIDField3.setBackground(new Color(75, 60, 110));
            NationalIDField3.setForeground(Color.white);

            //---- LastnameField ----
            LastnameField.setBackground(new Color(75, 60, 110));
            LastnameField.setForeground(Color.white);

            //---- address ----
            address.setBackground(new Color(75, 60, 110));
            address.setForeground(Color.white);

            //---- phoneField5 ----
            phoneField5.setBackground(new Color(75, 60, 110));
            phoneField5.setForeground(Color.white);

            //---- Email ----
            Email.setBackground(new Color(75, 60, 110));
            Email.setForeground(Color.white);

            //---- button1 ----
            button1.setText("Next");
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
                    button1MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button1MouseExited(e);
                    button1MouseExited(e);
                }
            });

            //---- label11 ----
            label11.setText("Already have an account ? Login !");
            label11.setForeground(new Color(204, 204, 204));
            label11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
            label11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label11MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    label11MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label11MouseExited(e);
                }
            });

            //---- FemailButton2 ----
            FemailButton2.setText("Femail");
            FemailButton2.setBackground(new Color(75, 60, 110));
            FemailButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            FemailButton2.setForeground(Color.white);

            //---- MailButton3 ----
            MailButton3.setText("Mail");
            MailButton3.setBackground(new Color(75, 60, 110));
            MailButton3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            MailButton3.setForeground(Color.white);

            //---- label1 ----
            label1.setForeground(new Color(255, 89, 143));

            //---- label15 ----
            label15.setForeground(new Color(255, 89, 143));

            //---- label16 ----
            label16.setForeground(new Color(255, 89, 143));

            //---- label18 ----
            label18.setForeground(new Color(255, 89, 143));

            //---- label19 ----
            label19.setForeground(new Color(255, 89, 143));

            //---- label20 ----
            label20.setForeground(new Color(255, 89, 143));

            //---- button2 ----
            button2.setText("Cancel");
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

            //---- comboBox1 ----
            comboBox1.setBackground(new Color(75, 60, 110));
            comboBox1.setForeground(Color.white);
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                    "1300",
                    "1301",
                    "1302",
                    "1303",
                    "1304",
                    "1305",
                    "1306",
                    "1307",
                    "1308",
                    "1309",
                    "1310",
                    "1311",
                    "1312",
                    "1313",
                    "1314",
                    "1315",
                    "1316",
                    "1317",
                    "1318",
                    "1319",
                    "1320",
                    "1321",
                    "1322",
                    "1323",
                    "1324",
                    "1325",
                    "1326",
                    "1327",
                    "1328",
                    "1329",
                    "1330",
                    "1331",
                    "1332",
                    "1333",
                    "1334",
                    "1335",
                    "1336",
                    "1337",
                    "1338",
                    "1339",
                    "1340",
                    "1341",
                    "1342",
                    "1343",
                    "1344",
                    "1345",
                    "1346",
                    "1347",
                    "1348",
                    "1349",
                    "1350",
                    "1351",
                    "1352",
                    "1353",
                    "1354",
                    "1355",
                    "1356",
                    "1357",
                    "1358",
                    "1359",
                    "1360",
                    "1361",
                    "1362",
                    "1363",
                    "1364",
                    "1365",
                    "1366",
                    "1367",
                    "1368",
                    "1369",
                    "1370",
                    "1371",
                    "1372",
                    "1373",
                    "1374",
                    "1375",
                    "1376",
                    "1377",
                    "1378",
                    "1379",
                    "1380",
                    "1381",
                    "1382",
                    "1383",
                    "1384",
                    "1385",
                    "1386",
                    "1387",
                    "1388",
                    "1389",
                    "1390",
                    "1391",
                    "1392",
                    "1393",
                    "1394",
                    "1395",
                    "1396",
                    "1397",
                    "1398",
                    "1399"
            }));
            comboBox1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

            //---- label12 ----
            label12.setText("Year");
            label12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            label12.setForeground(Color.white);

            //---- label22 ----
            label22.setText("Month");
            label22.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            label22.setForeground(Color.white);

            //---- comboBox2 ----
            comboBox2.setBackground(new Color(75, 60, 110));
            comboBox2.setForeground(Color.white);
            comboBox2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[]{
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"
            }));

            //---- label23 ----
            label23.setText("Day");
            label23.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            label23.setForeground(Color.white);

            //---- comboBox3 ----
            comboBox3.setBackground(new Color(75, 60, 110));
            comboBox3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
            comboBox3.setForeground(Color.white);
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[]{
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
            }));

            //---- label21 ----
            label21.setForeground(new Color(255, 89, 143));

            //---- label17 ----
            label17.setForeground(new Color(255, 89, 143));

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

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                    .addGap(17, 17, 17)
                                                    .addComponent(label12)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(84, 84, 84)
                                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(313, 313, 313)
                                                    .addComponent(label20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(panel5Layout.createParallelGroup()
                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                                    .addGroup(panel5Layout.createParallelGroup()
                                                                                            .addComponent(FirstnField1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(LastnameField, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                                                                    .addGap(4, 4, 4)
                                                                                    .addGroup(panel5Layout.createParallelGroup()
                                                                                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
                                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                                    .addComponent(MailButton3)
                                                                                    .addGap(43, 43, 43)
                                                                                    .addComponent(FemailButton2)
                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(label18, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(panel5Layout.createSequentialGroup()
                                                                                            .addComponent(Email, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                                                                                    .addGroup(panel5Layout.createSequentialGroup()
                                                                                            .addComponent(label22, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                                                            .addGap(75, 75, 75)
                                                                                            .addComponent(label23, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                                                            .addGap(12, 12, 12)
                                                                                            .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                                                                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
                                                                                    .addGroup(GroupLayout.Alignment.LEADING, panel5Layout.createSequentialGroup()
                                                                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                                                            .addGap(18, 18, 18)
                                                                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
                                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                                    .addComponent(phoneField5, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(label17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                                    .addComponent(address, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(label21, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                                    .addComponent(NationalIDField3, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(label16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                            .addGroup(panel5Layout.createSequentialGroup()
                                                                    .addGap(61, 61, 61)
                                                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(183, 183, 183)))))
                                    .addContainerGap())
            );
            panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                            .addGroup(panel5Layout.createSequentialGroup()
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(16, 16, 16)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FirstnField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LastnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NationalIDField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MailButton3)
                                            .addComponent(FemailButton2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label18, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label23)
                                                    .addComponent(label22)
                                                    .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label20, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label21, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel5Layout.createParallelGroup()
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(panel5, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(panel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(FemailButton2);
        buttonGroup1.add(MailButton3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    protected void label11MouseClicked(MouseEvent e) {
        loginpage loginpage = new loginpage();
        loginpage.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        loginpage.setVisible(true);
        dispose();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mahdieh
    protected JPanel panel5;
    protected JLabel label2;
    protected JTextField FirstnField1;
    protected JLabel label3;
    protected JLabel label4;
    protected JLabel label5;
    protected JLabel label6;
    protected JLabel label7;
    protected JLabel label8;
    protected JLabel label9;
    protected JLabel label10;
    protected JTextField NationalIDField3;
    protected JTextField LastnameField;
    protected JTextField address;
    protected JTextField phoneField5;
    protected JTextField Email;
    protected JButton button1;
    protected JLabel label11;
    protected JRadioButton FemailButton2;
    protected JLabel label13;
    protected JLabel label14;
    protected JRadioButton MailButton3;
    protected JLabel label1;
    protected JLabel label15;
    protected JLabel label16;
    protected JLabel label18;
    protected JLabel label19;
    protected JLabel label20;
    protected JLabel label21;
    protected JButton button2;
    protected JComboBox<String> comboBox1;
    protected JLabel label12;
    protected JLabel label22;
    protected JComboBox<String> comboBox2;
    protected JLabel label23;
    protected JComboBox<String> comboBox3;
    protected JLabel label24;
    protected JLabel label25;
    protected JLabel label26;
    protected JLabel label17;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
