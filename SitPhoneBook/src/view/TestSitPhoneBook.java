/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.PhoneController;
import Model.PhoneBook;
import java.sql.SQLException;

/**
 *
 * @author Kridtakom
 */
public class TestSitPhoneBook {

    public static void main(String[] args) {
        try {
            PhoneController pctrl = new PhoneController("sit", "sit");
            
            pctrl.deleteSitPhoneBook(22);
            
            pctrl.closeConnection();
        }catch(ClassNotFoundException cnfEx){
            System.out.println(cnfEx);
        }catch(SQLException sqlEx){
            System.out.println(sqlEx);
        }
    }

}
