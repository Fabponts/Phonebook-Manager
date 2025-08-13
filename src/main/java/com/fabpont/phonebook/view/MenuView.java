package com.fabpont.phonebook.view;

import java.util.Scanner;
import java.util.logging.Logger;


public class MenuView {

    //Objects instantiation
    private Scanner scanner = new Scanner(System.in);
    private Logger logger = Logger.getLogger(MenuView.class.getName());

    // Class Variable
    private Integer option;

    // Class MenuView
     public void IntroductionView(){
       logger.info("------Welcome to your Phonebook-------");
       logger.info("------Which action do you want to do?");
       logger.info("1: Go to main menu");
       logger.info("2: Exit ");

        option = scanner.nextInt();

        // Verifying wrong options
        while (option != 1 && option != 2) {
            logger.warning("Please enter a valid option");
            option = scanner.nextInt();
        }

        //
        switch(option){
            case 1:
                Menu();
                break;

                case 2:
                    System.exit(0);
        }
    }
    public void Menu(){
        System.out.println("1: Add a new contact");
        System.out.println("2: Show contacts");
        System.out.println("3: Delete a contact");
        System.out.println("4: Edit a contact");
        System.out.println("5: Search for a contact");
        System.out.println("6: Reset your phonebook");

        scanner.close();
    }
}
