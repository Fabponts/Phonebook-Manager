package com.fabpont.phonebook;

import com.fabpont.phonebook.controller.MenuController;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();

        menuController.menuOperation();
    }
}