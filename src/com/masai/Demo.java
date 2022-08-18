package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        try {
            // Step 1 --- load the jdbc driver (loading the jdbc driver related main class into the memory.)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
            // Step2 --- prepare the connection URL.
        String url = "jdbc:mysql://localhost:3306/db1";

        try {
            // step 3 --- establish the connection
            Connection con = DriverManager.getConnection(url,"root","root");
            if(con!=null){
                System.out.println("connected....");
            }
            

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
