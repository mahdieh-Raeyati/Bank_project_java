package com.company;

import java.awt.event.MouseEvent;

public class search_account_by_manager extends search_account {
    Manager manager;

    public search_account_by_manager(Manager manager) {
        super();
        this.manager = manager;
    }

    @Override
    //back
    public void button6MouseClicked(MouseEvent e) {
        manage_accounts_by_manager manage_accounts_by_manager = new manage_accounts_by_manager(manager);
        manage_accounts_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_accounts_by_manager.setVisible(true);
        dispose();
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 8);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 9);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 10);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    public void button4MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 11);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    public void button5MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 12);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

}
