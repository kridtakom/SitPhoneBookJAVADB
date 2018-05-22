/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kridtakom
 */
public class PhoneBook {
    private String phoneNum;
    private String nickName;
    private int gen;

    public PhoneBook(String phoneNum, String nickName, int gen) {
        this.phoneNum = phoneNum;
        this.nickName = nickName;
        this.gen = gen;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "phoneNum=" + phoneNum + ", nickName=" + nickName + ", gen=" + gen + '}';
    }
    
    
}
