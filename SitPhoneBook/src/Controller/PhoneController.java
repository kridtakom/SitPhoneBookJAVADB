/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DriverManager.ConnectionManager;
import Model.PhoneBook;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kridtakom
 */
public class PhoneController {
    private Connection con;
    
    public PhoneController(String user ,String  pws) throws ClassNotFoundException, SQLException{
        String url="jdbc:derby://localhost:1527/SitPhoneBook";
        con = ConnectionManager.createConnection(url, user, pws);
        System.out.println("Create Connection Successed Fully");
    }
    public void insertSitPhoneBook(PhoneBook phone) throws SQLException{
        String tel=phone.getPhoneNum();
        String nickname = phone.getNickName();
        int gen = phone.getGen();
        String sql="insert into sitphonebook (telephone,nickname,gen) values('"+tel+"','"+nickname+"',"+gen+")";
        Statement stmt= con.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println("Insert Successfully "+count);
    }
    public void deleteSitPhoneBook(long tel) throws SQLException{
        Statement stmt = con.createStatement();
        String telphone= Long.toString(tel); 
        String sql = "delete from sitphonebook where telephone='"+telphone+"'";
        int recdet= stmt.executeUpdate(sql);
        System.out.println(recdet);
    }
    public void selectSitPhoneBook(String num) throws SQLException{
        ArrayList<PhoneBook> pb=new ArrayList<PhoneBook>();
        Statement stmt = con.createStatement();
        String telphone= num;
        String sql = "select * from sitphonebook where telephone like '"+telphone+"'";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String telephone = rs.getString("telephone");
            String nickname= rs.getString("nickname");
            int gen = rs.getInt("gen");
            PhoneBook phonebook= new PhoneBook(telephone,nickname,gen);
            pb.add(phonebook);
        }
        for(PhoneBook phone:pb){
            System.out.println(phone);
        }
        
    }
    
    
    public void closeConnection() throws SQLException{
        con.close();
    }
}
