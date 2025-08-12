package com.fabpont.phonebook.view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);
    private Integer option;

    public MenuView() {
        System.out.println("------Welcome to your Phonebook-------");
        System.out.println("------Witch action do you want to do?------");

        while (option != 1 || option != 2) {
            System.out.println("Please enter a valid option");
        }

        if (option == 1){

        }
        else if (option == 2){
            System.exit(0);
        }
    }
}
