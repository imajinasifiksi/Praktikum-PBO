/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
        
public class Connector {
    String url      = "jdbc:mysql://localhost/tugaslogin";
    String username = "root";
    String password = "";
    
    Statement stat;
    Connection conn;
    
    public Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tugaslogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
    }
}
