/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author hamdi
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi_ujian {
    private static Connection koneksi;
    public static Connection getkoneksi(){
        //membuat koneksi_login ke database
        if(koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/db_ujian";
                user = "root";
                password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
                
            }catch(SQLException a){
                System.out.println("Koneksi gagal !!");
            }
        }
        return koneksi;
    }
}
