/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systém_sécurisée;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author yasmine
 */
public class connection {
    
Connection conn;


public static void main(String[] args) {
try {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("DRIVER OK ! ");
String url = "jdbc:mysql://localhost/patient";
String user = "root";
String passwd = "";
Connection conn = DriverManager.getConnection(url, user, passwd);
System.out.println("Connection effective !");
} catch (Exception e) {
e.printStackTrace();
}
}
    
}
