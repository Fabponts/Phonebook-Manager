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
        System.out.println("Please enter the email of the contact you want to delete: ");
        contact.setEmail(scanner.nextLine());

        contactDAO.deleteContact(contact);
    }

    public void showContacts(){
        contactDAO.showContact();
    }
    public void updateContact(){
        System.out.println("Please enter the id of the contact you want to update: ");
        contact.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Please enter the name of the contact you want to update: ");
        contact.setFirstName(scanner.nextLine());

        System.out.println("Please enter the last name of the contact you want to update: ");
        contact.setLastName(scanner.nextLine());

        System.out.println("Please enter the contact email:");
        contact.setEmail(scanner.nextLine());

        System.out.println("Please enter the phone number of the contact you want to update: ");
        contact.setPhone(scanner.nextLine());

        contactDAO.updateContact(contact);
    }
    public void searchContact(){
        System.out.println("Please enter the name of the contact you want to search:");
        contact.setFirstName(scanner.nextLine());

        contactDAO.searchContact(contact);
    }
    public void resetPhonebook(){
        contactDAO.resetData();
    }
}
