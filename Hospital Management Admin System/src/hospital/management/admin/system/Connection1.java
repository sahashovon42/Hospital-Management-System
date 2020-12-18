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
public class Connection1 {
    private String Doctor_ID;
    private String Name;
    private String Contact_Number;
    private String Age;
    private String Gender;
    private String Duration_Time;
    private String Dr_Information;

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
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

    public String getDuration_Time() {
        return Duration_Time;
    }

    public void setDuration_Time(String Duration_Time) {
        this.Duration_Time = Duration_Time;
    }

    public String getDr_Information() {
        return Dr_Information;
    }

    public void setDr_Information(String Dr_Information) {
        this.Dr_Information = Dr_Information;
    }
    
    
    
    
    

    public Connection1(String Doctor_ID, String Name, String Contact_Number, String Age, String Gender, String Duration_Time, String Dr_Information) {
        this.Doctor_ID = Doctor_ID;
        this.Name = Name;
        this.Contact_Number = Contact_Number;
        this.Age = Age;
        this.Gender = Gender;
        this.Duration_Time = Duration_Time;
        this.Dr_Information = Dr_Information;
    }

    
    
    
    
    
    public Connection1(String Name, String Contact_Number, String Age, String Gender, String Duration_Time, String Dr_Information) {
        this.Name = Name;
        this.Contact_Number = Contact_Number;
        this.Age = Age;
        this.Gender = Gender;
        this.Duration_Time = Duration_Time;
        this.Dr_Information = Dr_Information;
    }
    
    
    
    
    
    public Connection1(){
        super();
    }

    @Override
    public String toString() {
        return "Connection1{" + "Doctor_ID=" + Doctor_ID + ", Name=" + Name + ", Contact_Number=" + Contact_Number + ", Age=" + Age + ", Gender=" + Gender + ", Duration_Time=" + Duration_Time + ", Dr_Information=" + Dr_Information + '}';
    }
   
    
    
    
}
    
