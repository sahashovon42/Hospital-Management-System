package hospital.management.admin.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Shovon
 */
public class AllFunction {
    
    
    public static boolean insertDoctorTODB(Connection1 st)
    {
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="insert into Doctor_Information(Doctor_ID,Name,Contact_Number,Age,Gender,Duration_Time,Dr_Information)values(?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1, st.getDoctor_ID());
            pstmt.setString(2, st.getName());
            pstmt.setString(3, st.getContact_Number());
            pstmt.setString(4, st.getAge());
            pstmt.setString(5, st.getGender());
            pstmt.setString(6, st.getDuration_Time());
            pstmt.setString(7, st.getDr_Information());
            
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    
    
    
    
    
    public static boolean deleteDoctor(String Doctor_ID) {
           
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="delete from doctor_information where Doctor_ID=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1,Doctor_ID);
            
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    
    
    
    
    
    
    
    public static void ShowDoctor() {
        
        try{
            Connection con= Mysql.createC();
           String q="select * from Doctor_Information;";
		Statement stmt=con.createStatement();
                
                ResultSet set=stmt.executeQuery(q);
                
                while(set.next())
                {
                    String Doctor_ID=set.getString(1);
                    String Name=set.getString(2);
                    String Contact_Number=set.getString(3);
                    String Age=set.getString(4);
                    String Gender=set.getString(5);
                    String Duration_Time=set.getString(6);
                    String Dr_Information=set.getString(7);
                    
                    System.out.println("Doctor_ID: " +Doctor_ID);
                    System.out.println("Name: " + Name);
                    System.out.println("Contact_Number: "+Contact_Number);
                    System.out.println("Age: " + Age);
                    System.out.println("Gender: " +Gender);
                    System.out.println("Duration_Time: " +Duration_Time);
                    System.out.println("Dr_Information: " +Dr_Information);
                    System.out.println("_ _ _ _ _ _ _ _ _ _");
                }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    
    
    
    
    
    
    
    public static boolean updateDoctorTOD(Connection1 st)
    {
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="insert into Doctor_Information(Doctor_ID,Name,Contact_Number,Age,Gender,Duration_Time,Dr_Information)values(?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1, st.getDoctor_ID());
            pstmt.setString(2, st.getName());
            pstmt.setString(3, st.getContact_Number());
            pstmt.setString(4, st.getAge());
            pstmt.setString(5, st.getGender());
            pstmt.setString(6, st.getDuration_Time());
            pstmt.setString(7, st.getDr_Information());
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
  
    
    
    
    //+++++++++++//
    //start Patient
    //++++++++++//
    
    
    
    public static boolean insertPatientTODB(Connection2 st)
    {
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="insert into Patient_Information(Patient_ID,Name,Contact_Number,Age,Gender,Blood_Group,Address)values(?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1, st.getPatient_ID());
            pstmt.setString(2, st.getName());
            pstmt.setString(3, st.getContact_Number());
            pstmt.setString(4, st.getAge());
            pstmt.setString(5, st.getGender());
            pstmt.setString(6, st.getBlood_Group());
            pstmt.setString(7, st.getAddress());
            
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    
    
    
    
    
    public static boolean deletePatient(String Patient_ID) {
           
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="delete from Patient_information where Patient_ID=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1,Patient_ID);
            
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    
    
    
    
    
    
    public static void ShowPatient() {
        
        try{
            Connection con= Mysql.createC();
           String q="select * from Patient_Information;";
		Statement stmt=con.createStatement();
                
                ResultSet set=stmt.executeQuery(q);
                
                while(set.next())
                {
                    String Patient_ID=set.getString(1);
                    String Name=set.getString(2);
                    String Contact_Number=set.getString(3);
                    String Age=set.getString(4);
                    String Gender=set.getString(5);
                    String Blood_Group=set.getString(6);
                    String Address=set.getString(7);
                    
                    System.out.println("Patient_ID: " +Patient_ID);
                    System.out.println("Name: " + Name);
                    System.out.println("Contact_Number: "+Contact_Number);
                    System.out.println("Age: " + Age);
                    System.out.println("Gender: " +Gender);
                    System.out.println("Blood_Group: " +Blood_Group);
                    System.out.println("Address: " +Address);
                    System.out.println("_ _ _ _ _ _ _ _ _ _");
                }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    
    
    
    
    
    
    public static boolean updatePatientTOD(Connection2 st)
    {
        boolean f=false;
        
        try{
            Connection con= Mysql.createC();
            String q="insert into Patient_Information(Patient_ID,Name,Contact_Number,Age,Gender,Blood_Group,Address)values(?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1, st.getPatient_ID());
            pstmt.setString(2, st.getName());
            pstmt.setString(3, st.getContact_Number());
            pstmt.setString(4, st.getAge());
            pstmt.setString(5, st.getGender());
            pstmt.setString(6, st.getBlood_Group());
            pstmt.setString(7, st.getAddress());
            
            pstmt.executeUpdate();
            
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
