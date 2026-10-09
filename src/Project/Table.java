/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hype
 */
public class Table {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = koneksi.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table Users(name varchar(200),email varchar(200),password varchar(50),sequrityQuestion varchar(200),answer varchar(200),address varchar(200),status varchar(20))");
            st.executeUpdate("create table room(roomnumber Varchar(10),roomtype Varchar(20),price int,status Varchar(20))");
            // st.executeUpdate("create table customer(id int,Name varchar(200),MobileNumber varchar(50),Address varchar(200),Gender varchar(200),Email varchar(50),IDProof varchar(200),CheckIN varchar(200),RoomType varchar(200),RoomNumber varchar(200),Price int(10),NumberOfDaysStay int(10),TotalAmount varchar(200),CheckOut varchar(50))");
            JOptionPane.showMessageDialog(null, "table created sucesfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }
    }
}
