/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.admin.system;

/**
 *
 * @author Shovon
 */
public class Connection2 {
    private String Patient_ID;
    private String Name;
    private String Contact_Number;
    private String Age;
    private String Gender;
    private String Blood_Group;
    private String Address;

    public String getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String Contact_Number) {
        this.Contact_Number = Contact_Number;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String Blood_Group) {
        this.Blood_Group = Blood_Group;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    
    
    

    public Connection2(String Patient_ID, String Name, String Contact_Number, String Age, String Gender, String Blood_Group, String Address) {
        this.Patient_ID = Patient_ID;
        this.Name = Name;
        this.Contact_Number = Contact_Number;
        this.Age = Age;
        this.Gender = Gender;
        this.Blood_Group = Blood_Group;
        this.Address = Address;
    }

    
    
    
    
    
    public Connection2(String Name, String Contact_Number, String Age, String Gender, String Blood_Group, String Address) {
        this.Name = Name;
        this.Contact_Number = Contact_Number;
        this.Age = Age;
        this.Gender = Gender;
        this.Blood_Group = Blood_Group;
        this.Address = Address;
    }
    
    
    
    
    
    public Connection2(){
        super();
    }

    @Override
    public String toString() {
        return "Connection1{" + "Patient_ID=" + Patient_ID + ", Name=" + Name + ", Contact_Number=" + Contact_Number + ", Age=" + Age + ", Gender=" + Gender + ", Blood_Group=" + Blood_Group + ", Address=" + Address + '}';
    }
   
    
    
    
}
    
