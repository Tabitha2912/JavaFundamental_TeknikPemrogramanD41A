/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan73;

/**
 *
 * @author Sasa
 */
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    //sets up a staff emember using the specified information
    public StaffMember(String eName, String eAddress, String ePhone){
        name= eName;
        address= eAddress;
        phone= ePhone;
    }
    
    //returns a string including the basic employee information
    public String toString(){
        String result = "Name : " +name+"\n";
        
        result += "Address : " +address+"\n";
        result += "Phone : " +phone+"\n";
        
        return result;
    }
    
    //Derived classes must define the pay method for each type of employee
    public abstract double pay();
}
