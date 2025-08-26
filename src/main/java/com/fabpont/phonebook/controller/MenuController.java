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

                    break;
                    case 3:

                    break;
                    case 4:

                    break;
                    case 5:

                    break;

                    case 6:

                    break;
                    case 0:
                }
            }while(option != 0 );
        }
}
