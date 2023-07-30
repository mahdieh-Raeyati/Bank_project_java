package com.company;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    @SerializedName("NationalID")
    private String nationalID;
    @SerializedName("Password")
    private String password;


    public Admin(String nationalID, String password) {
        this.nationalID = nationalID;
        this.password = password;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getPassword() {
        return password;
    }

    // printing the special menu for admin ( admin's accessibilities )
    public void admin_menu(int num, Admin admin) {
        String str = "";
        if (num == 1) {
            File file = new File("manager profile.json");
            if (file.exists()) {
                try {
                    Scanner reader = new Scanner(file);
                    while (reader.hasNextLine()) {
                        str += reader.nextLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (str.equals("[]") | !file.exists()) {
                register_Manager_by_Admin register_manager_by_admin = new register_Manager_by_Admin(admin);
                register_manager_by_admin.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                register_manager_by_admin.setVisible(true);
            } else {
                Admin_menue admin_menue = new Admin_menue(admin);
                admin_menue.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                admin_menue.setVisible(true);
                OK ok = new OK("                there is already a manager !", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);
            }
        } else {
            File file = new File("manager profile.json");
            if (file.exists()) {
                try {
                    Scanner reader = new Scanner(file);
                    while (reader.hasNextLine()) {
                        str += reader.nextLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!str.equals("[]")) {

                try {
                    FileWriter mWriter = new FileWriter("manager profile.json");
                    synchronized (mWriter) {
                        mWriter.write("[]");
                        mWriter.close();
                        Admin_menue admin_menue = new Admin_menue(admin);
                        admin_menue.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        admin_menue.setVisible(true);
                        OK ok = new OK("             deleted successfully!", 1);
                        ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        ok.setVisible(true);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Admin_menue admin_menue = new Admin_menue(admin);
                admin_menue.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                admin_menue.setVisible(true);
                OK ok = new OK("          there is no manager to remove!", 1);
                ok.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ok.setVisible(true);

            }
        }
    }

}
