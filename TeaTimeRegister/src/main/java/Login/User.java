/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author RC_Student_lab
 */
public class User {
    private String userName;
    private String password;
    private int phoneNumber;
    
    public User(){}
    //Constructor
    public User(String userName, String password,int phoneNumber)
    {
        this.userName= userName;
        this.phoneNumber = phoneNumber;
    } 
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
