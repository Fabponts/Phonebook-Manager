package com.fabpont.phonebook.controller;

import java.util.Scanner;
import com.fabpont.phonebook.entities.Contact;
import com.fabpont.phonebook.dao.ContactDAO;

public class ContactController {
    Scanner scanner = new Scanner(System.in);
    Contact contact = new Contact();
    ContactDAO contactDAO = new ContactDAO();

    public void addContact(){
        System.out.println("Please enter the name of the contact you want to add: ");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Please enter the last name of the contact you want to add: ");
        contact.setLastName(scanner.nextLine());
        System.out.println("Please enter the contact email:");
        contact.setEmail(scanner.nextLine());
        System.out.println("Please enter the phone number of the contact you want to add: ");
        contact.setPhone(scanner.nextLine());

        contactDAO.insertData(contact);
    }
    public void deleteContact(){

    }

    public void showContacts(){

    }
    public void updateContact(){

    }
    public void searchContact(){

    }
    public void resetPhonebook(){

    }
}
