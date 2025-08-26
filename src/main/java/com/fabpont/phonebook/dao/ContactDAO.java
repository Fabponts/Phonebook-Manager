package com.fabpont.phonebook.dao;

import com.fabpont.phonebook.config.BgdConnection;
import com.fabpont.phonebook.entities.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDAO {
    public void insertData(Contact contact){
        String sql = "INSERT INTO contacts (name, lastname, email, phone) VALUES ( ?, ?, ?, ?)";

        try(Connection conn = BgdConnection.getConnection();
            PreparedStatement stms = conn.prepareStatement(sql)){

            stms.setString(1,contact.getFirstName());
            stms.setString(2,contact.getLastName());
            stms.setString(3,contact.getEmail());
            stms.setString(4,contact.getPhone());

            stms.executeUpdate();
            System.out.println("Contact Inserted Successfully");

        }catch (SQLException e){
            System.out.println("Error in inserting contact" + e.getMessage());
        }
    }
}
