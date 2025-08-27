package com.fabpont.phonebook.view;

public class MenuView {
    // Method MenuView
     public void IntroductionView(){
         System.out.println("Welcome to Phonebook");
    }
    public void Menu(){
        System.out.println("""
        ---Menu---
        0: Exit
        1: Add a new contact
        2: Show contacts;
        3: Delete a contact;
        4: Edit a contact";
        5: Search for a contact
        6: Reset your phonebook
        """);
    }
}
