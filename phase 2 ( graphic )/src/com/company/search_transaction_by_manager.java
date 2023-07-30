package com.company;

import java.awt.event.MouseEvent;

public class search_transaction_by_manager extends search_transaction {
    Manager manager;

    public search_transaction_by_manager(Manager manager) {
        super();
        this.manager = manager;
    }

    public void button7MouseClicked(MouseEvent e) {
        manage_accounts_by_manager manage_accounts_by_manager = new manage_accounts_by_manager(manager);
        manage_accounts_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_accounts_by_manager.setVisible(true);
        dispose();
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 13);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 14);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button3MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 15);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button4MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 16);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 17);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        recive_information_by_manager recive_national_id_for_manager = new recive_information_by_manager(manager, 18);
        recive_national_id_for_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_national_id_for_manager.setVisible(true);
    }
}
