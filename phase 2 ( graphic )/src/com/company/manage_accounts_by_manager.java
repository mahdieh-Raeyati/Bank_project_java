package com.company;

import java.awt.event.MouseEvent;

public class manage_accounts_by_manager extends account_pannel {
    Manager manager;

    public manage_accounts_by_manager(Manager manager) {
        super();
        this.manager = manager;
    }

    @Override
    //current account
    public void button1MouseClicked(MouseEvent e) {
        recive_nationalID_for_account recive_national_to_create_account = new recive_nationalID_for_account(1, 1);
        recive_national_to_create_account.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_to_create_account.setVisible(true);
    }

    @Override
    //back
    public void button9MouseClicked(MouseEvent e) {
        manager_main_menu manager_main_menu = new manager_main_menu(manager);
        manager_main_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manager_main_menu.setVisible(true);
        dispose();
    }

    @Override
    //saving account
    public void button10MouseClicked(MouseEvent e) {
        recive_nationalID_for_account recive_national_to_create_account = new recive_nationalID_for_account(1, 2);
        recive_national_to_create_account.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_to_create_account.setVisible(true);
    }

    @Override
    //delet account
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 6);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);

    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        manager.show_accounts_list();
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        search_account_by_manager search_account_by_manager = new search_account_by_manager(manager);
        search_account_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        search_account_by_manager.setVisible(true);
        dispose();
    }

    @Override
    public void button7MouseClicked(MouseEvent e) {
        manager.show_transactions_list();
    }

    @Override
    public void button8MouseClicked(MouseEvent e) {
        search_transaction_by_manager search_transaction_by_manager = new search_transaction_by_manager(manager);
        search_transaction_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        search_transaction_by_manager.setVisible(true);
        dispose();
    }

    //edit account
    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_information_by_manager = new recive_information_by_manager(manager, 19);
        recive_information_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_by_manager.setVisible(true);
    }


}
