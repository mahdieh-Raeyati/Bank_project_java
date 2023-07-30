package com.company;

import java.awt.event.MouseEvent;

public class transfermoney_by_customer extends Money_transfer_panel {
    Customer customer;

    public transfermoney_by_customer(Customer customer) {
        super();
        this.customer = customer;
    }

    @Override
    public void button1MouseClicked(MouseEvent e) {
        if ((!this.textField1.getText().matches("[0-9]+")) | (!this.textField2.getText().matches("[0-9]+")) |
                (!this.textField3.getText().matches("[0-9]+")) |
                (this.textField1.getText().equals(this.textField2.getText())) | (this.textField3.getText().equals("0"))) {
            OK ok = new OK("invalid input!", 1);
            ok.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ok.setVisible(true);
        } else {
            dispose();
            Customer_menu customer_menu = new Customer_menu(customer);
            customer_menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            customer_menu.setVisible(true);
            customer.transfer_money(this.textField1.getText(), this.textField2.getText(), this.textField3.getText(), 2);
            this.setVisible(false);

        }
    }

    @Override
    public void button2MouseClicked(MouseEvent e) {
        Customer_menu customer_pannel = new Customer_menu(customer);
        customer_pannel.setVisible(true);
        customer_pannel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }
}
