package com.company;

import java.awt.event.MouseEvent;

public class search_customer_by_manager extends search_human {
    Manager manager;

    public search_customer_by_manager(Manager manager) {
        super();
        this.manager = manager;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 1, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button9MouseClicked(MouseEvent e) {
        manage_customer_by_manager manage_customer_by_manager = new manage_customer_by_manager(manager);
        manage_customer_by_manager.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        manage_customer_by_manager.setVisible(true);
        dispose();
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 2, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button3MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 3, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button4MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 4, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button5MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 5, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button6MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 6, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button7MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 7, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

    @Override
    public void button8MouseClicked(MouseEvent e) {
        recive_information_to_search_by_manager recive_information_to_save = new recive_information_to_search_by_manager(manager, 8, 1);
        recive_information_to_save.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        recive_information_to_save.setVisible(true);
    }

}
