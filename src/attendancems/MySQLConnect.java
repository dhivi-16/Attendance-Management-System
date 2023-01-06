/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendancems;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author dhivy
 */
//This class is responsible for MySQL Connection
public class MySQLConnect {
    

    Connection conn;
 
    public Connection getConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","");
            JOptionPane.showMessageDialog(null,"Database Connection Successful MySQLConnect getconn method ");
            return conn;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in MySQLConnect getconn method "+e);
        }           
        return conn;            
    }} 
    