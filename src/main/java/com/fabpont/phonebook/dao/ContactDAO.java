package com.fabpont.phonebook.dao;

import com.fabpont.phonebook.config.BdgConnection;
import com.fabpont.phonebook.entities.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDAO {
    public void insertData(Contact contact) {
        String sql = "INSERT INTO contacts (name, lastname, email, phone) VALUES ( ?, ?, ?, ?)";

        try (Connection conn = BdgConnection.getConnection();
             PreparedStatement stms = conn.prepareStatement(sql)) {

            stms.setString(1, contact.getFirstName());
            stms.setString(2, contact.getLastName());
            stms.setString(3, contact.getEmail());
            stms.setString(4, contact.getPhone());

            stms.executeUpdate();
            System.out.println("Contact Inserted Successfully");

        } catch (SQLException e) {
            System.out.println("Error in inserting contact" + e.getMessage());
        }
    }

    public void resetData() {
        String sql = "TRUNCATE TABLE contacts";

        try (Connection conn = BdgConnection.getConnection();
             PreparedStatement smt = conn.prepareStatement(sql)) {

            smt.execute();
            System.out.println("Contact Data Reset Successfully");
        } catch (SQLException e) {
            System.out.println("Error in reset contacts" + e.getMessage());
        }
    }

    public void deleteContact(Contact contact) {
        String sql = "DELETE FROM contacts WHERE email = ? ";

        try (Connection conn = BdgConnection.getConnection();
             PreparedStatement smt = conn.prepareStatement(sql)) {
            smt.setString(1, contact.getEmail());

            smt.execute();
            System.out.println("Contact Deleted Successfully");
        } catch (SQLException e) {
            System.out.println("Error in deleting contact" + e.getMessage());
        }
    }

    public void showContact() {
        String sql = "SELECT * FROM contacts";

        try(Connection conn = BdgConnection.getConnection();
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery()) {

            System.out.println("\n---Contact List---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lastName = rs.getString("lastname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                System.out.printf("ID: %d | Name: %s | email: %s | Phone: %s", id, name,lastName,email,phone);
            }
        }catch (SQLException e){
            System.out.println("Error in show contact" + e.getMessage());
        }



    }
}
