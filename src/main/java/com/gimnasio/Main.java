package com.gimnasio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Gym";
        String user = "postgres";
        String password = "Manuel2309lm6"; 

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("select * from public.users");



             while (rset.next()) {
               var id = rset.getInt(1);
               var name = rset.getString(2);
               var email= rset.getString(3);
               var membershipStatus = rset.getBoolean(4);

               System.out.println("ID: "+id+ " Nombre: "+ name+ " Correo: "+ email+ " Estado: " + (membershipStatus ? "Activo" : "Vencido"));
             }

             // cerrar conexiones 
             rset.close();
             stmt.close();
             conn.close();


        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar la base de datos:");
            e.printStackTrace();
        }
    }
}
