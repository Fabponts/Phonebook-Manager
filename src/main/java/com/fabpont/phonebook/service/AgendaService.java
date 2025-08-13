package com.fabpont.phonebook.service;

import com.fabpont.phonebook.entities.Contact;
import java.util.HashMap;

public class AgendaService {

    private HashMap<String, Contact> contacts= new HashMap<>();

    private String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public void addContact(Contact contact){
       String key = formatName(contact.getFirstName(), contact.getLastName());
       contacts.put(key, contact);
    }


}

