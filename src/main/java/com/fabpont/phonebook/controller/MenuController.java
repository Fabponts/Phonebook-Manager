package com.fabpont.phonebook.controller;

import java.util.Scanner;

import com.fabpont.phonebook.view.MenuView;

public class MenuController {
        private final Scanner scanner = new Scanner(System.in);
        private final MenuView menuView = new MenuView();
        private final ContactController contactController = new ContactController();

        public void menuOperation(){
            int option;

            do {
                menuView.IntroductionView();
                menuView.Menu();
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        contactController.addContact();
                        break;
                    case 2:
                        contactController.showContacts();
                    break;
                    case 3:
                        contactController.deleteContact();
                    break;
                    case 4:
                        contactController.showContacts();
                        contactController.updateContact();
                    break;
                    case 5:

                    break;

                    case 6:
                        contactController.resetPhonebook();
                    break;
                    case 0:
                }
            }while(option != 0 );
        }
}
