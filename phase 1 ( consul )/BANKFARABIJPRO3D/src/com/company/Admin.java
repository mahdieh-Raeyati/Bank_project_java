package com.company;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
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

    // getters
    public String getNationalID() {
        return nationalID;
    }

    public String getPassword() {
        return password;
    }

    // admin's menu
    public void admin_menu(){
        Main.manager = true;
        Main.made_of_customer = false;
        Main.customer = false;
        Main.employee = false;

        System.out.println("Choose an item:\n1.Create a manager\n2.Delete a manager\n3.Exit");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num==1) {
            String str = "";
            Gson gson = new Gson();
            File file = new File("manager profile.json");
            ArrayList<Manager> managers = new ArrayList<Manager>();
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
                managers = gson.fromJson(str, new TypeToken<ArrayList<Manager>>() {
                }.getType());
            }
            if (managers.size() == 0) {
                Main.sign_up();
            } else {
                System.out.println("First delete a manager!");
            }
            admin_menu();
        }else if (num==2){
            Delete_Manager();
            admin_menu();
        }else {
            System.exit(0);
        }
    }

    // deleting manager
    public void Delete_Manager(){
        File file = new File("manager profile.json");
        if (file.exists()) {
            try {
                FileWriter mWriter = new FileWriter("manager profile.json");
                synchronized (mWriter) {
                    mWriter.write("[]");
                    mWriter.close();
                    System.out.println("manager removed successfully!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            admin_menu();
        }else {
            System.out.println("File not exist!");
        }
    }
}
