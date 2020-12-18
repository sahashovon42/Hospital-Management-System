package hospital.management.admin.system;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Shovon
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        System.out.println("❤❤❤ WELCOME TO HOSPITAL MANAGEMENT SYSTEM ❤❤❤");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Press 1 for Doctor Information");
            System.out.println("Press 2 for Patient Information");
            System.out.println("Press 3 for Exit");
            int c=Integer.parseInt(br.readLine());
            if(c==1)
            {
                System.out.println("Press 1 for Insert Doctor Information");
                System.out.println("Press 2 for Show All Doctor Information");
                System.out.println("Press 3 for Update Doctor Information");
                System.out.println("Press 4 for Delete Doctor Information");
                System.out.println("Press 5 for Exit");
                int a=Integer.parseInt(br.readLine());
                
                
                if(a==1)
                {
                    //Insert Doctor Information
                    System.out.println("Please Enter Your ID:");
                    String Doctor_ID=br.readLine();
                    
                    System.out.println("Please Enter Your Name:");
                    String Name=br.readLine();
                    
                    System.out.println("Please Enter Contact Number:");
                    String Contact_Number=br.readLine();
                    
                    System.out.println("Please Enter Your Age:");
                    String Age=br.readLine();
                    
                    System.out.println("Please Enter Your Gender:");
                    String Gender=br.readLine();
                    
                    System.out.println("Please Enter Your Duration_Time:");
                    String Duration_Time=br.readLine();
                    
                    System.out.println("Please Enter Your Speciality:");
                    String Dr_Information=br.readLine();
                    
                    
                    Connection1 st= new Connection1(Doctor_ID,Name,Contact_Number,Age,Gender,Duration_Time,Dr_Information);
                    boolean answer = AllFunction.insertDoctorTODB(st);
                    if(answer){
                      System.out.println("Doctor Information is Added Successfully..");  
                    }
                    else{
                        System.out.println("Something Wrong. Insert Again...");
                    }
                    //System.out.println(st);
                }
                
                
                
                else if(a==2)
                {
                    //Show All Doctor Information
                    
                    AllFunction.ShowDoctor();
                    
                }
                
                
                
                else if(a==3)
                {
                    //Update Doctor Information
                    System.out.println("Please Enter ID Which You Want to Update:");
                    String Doctor_ID=br.readLine();
                    
                    boolean f= AllFunction.deleteDoctor(Doctor_ID);
                    
                    System.out.println("Please Enter Your ID:");
                    String NewDoctor_ID=br.readLine();
                    
                    System.out.println("Please Enter Your Name:");
                    String Name=br.readLine();
                    
                    System.out.println("Please Enter Contact Number:");
                    String Contact_Number=br.readLine();
                    
                    System.out.println("Please Enter Your Age:");
                    String Age=br.readLine();
                    
                    System.out.println("Please Enter Your Gender:");
                    String Gender=br.readLine();
                    
                    System.out.println("Please Enter Your Duration_Time:");
                    String Duration_Time=br.readLine();
                    
                    System.out.println("Please Enter Your Speciality:");
                    String Dr_Information=br.readLine();
                    
                    
                    Connection1 st= new Connection1(Doctor_ID,Name,Contact_Number,Age,Gender,Duration_Time,Dr_Information);
                    boolean answer = AllFunction.updateDoctorTOD(st);
                    if(answer){
                      System.out.println("Doctor Information Update Successfully...");  
                    }
                    else{
                        System.out.println("Something Wrong. Insert Again...");
                    }
                    //System.out.println(st);
                }
                
                
                
                
                
                
                
                
                else if(a==4)
                {
                    //Delete Doctor Information
                    System.out.println("Please Enter Your ID Which you want to Delete:");
                    String Doctor_ID=br.readLine();
                    
                   boolean f= AllFunction.deleteDoctor(Doctor_ID);
                   
                   
                   if(f){
                      System.out.println("Doctor Information Delete Successfully..");  
                    }
                    else{
                        System.out.println("Something Wrong. Try Again...");
                    }
                   
                } 
                   
                   
                   
                    
                
                else if(a==5)
                {
                    //Exit
                    System.out.println("Exited.Thank you...");
                    break;
                }
                else
                {
                    
                }
                //System.out.println("Exited.Thank you...");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            else if(c==2)
            {
              System.out.println("Press 1 for Insert Patient Information");
                System.out.println("Press 2 for Show All Patient Information");
                System.out.println("Press 3 for Update Patient Information");
                System.out.println("Press 4 for Delete Patient Information");
                System.out.println("Press 5 for Exit");
                int a=Integer.parseInt(br.readLine());
                if(a==1)
                {
                    //Insert Patient Information
                    System.out.println("Please Enter Your ID:");
                    String Patient_ID=br.readLine();
                    
                    System.out.println("Please Enter Your Name:");
                    String Name=br.readLine();
                    
                    System.out.println("Please Enter Contact Number:");
                    String Contact_Number=br.readLine();
                    
                    System.out.println("Please Enter Your Age:");
                    String Age=br.readLine();
                    
                    System.out.println("Please Enter Your Gender:");
                    String Gender=br.readLine();
                    
                    System.out.println("Please Enter Your Blood_Group");
                    String Duration_Time=br.readLine();
                    
                    System.out.println("Please Enter Your Address:");
                    String Address=br.readLine();
                    
                    
                    Connection2 st= new Connection2(Patient_ID,Name,Contact_Number,Age,Gender,Duration_Time,Address);
                    boolean answer = AllFunction.insertPatientTODB(st);
                    if(answer){
                      System.out.println("Patient Information is Added Successfully..");  
                    }
                    else{
                        System.out.println("Something Wrong. Insert Again...");
                    }
                    //System.out.println(st);
                }
                
                
                else if(a==2)
                {
                    //Show specific Patient Information
                    
                    AllFunction.ShowPatient();
                    
                }
                
                
                else if(a==3)
                {
                    //Update Patient Information
                    System.out.println("Please Enter ID Which You Want to Update:");
                    String Patient_ID=br.readLine();
                    
                    boolean f= AllFunction.deletePatient(Patient_ID);
                    
                    System.out.println("Please Enter Your ID:");
                    String NewPatient_ID=br.readLine();
                    
                    System.out.println("Please Enter Your Name:");
                    String Name=br.readLine();
                    
                    System.out.println("Please Enter Contact Number:");
                    String Contact_Number=br.readLine();
                    
                    System.out.println("Please Enter Your Age:");
                    String Age=br.readLine();
                    
                    System.out.println("Please Enter Your Gender:");
                    String Gender=br.readLine();
                    
                    System.out.println("Please Enter Your Blood_Group");
                    String Duration_Time=br.readLine();
                    
                    System.out.println("Please Enter Your Address:");
                    String Address=br.readLine();
                    
                    
                    Connection2 st= new Connection2(Patient_ID,Name,Contact_Number,Age,Gender,Duration_Time,Address);
                    boolean answer = AllFunction.updatePatientTOD(st);
                    if(answer){
                      System.out.println("Patient Information Update Successfully..");  
                    }
                    else{
                        System.out.println("Something Wrong. Insert Again...");
                    }
                    //System.out.println(st);
                }
                
                
                
                
                
                
                
                
                else if(a==4)
                {
                    //Delete Patient Information
                    System.out.println("Please Enter Your ID Which you want to Delete:");
                    String Patient_ID=br.readLine();
                    
                   boolean f= AllFunction.deletePatient(Patient_ID);
                   
                   
                   if(f){
                      System.out.println("Patient Information Delete Successfully..");  
                    }
                    else{
                        System.out.println("Something Wrong. Try Again...");
                    }
                   
                } 
                   
                   
                   
                    
                
                else if(a==5)
                {
                    //Exit
                    System.out.println("Exited.Thank you...");
                    break;
                }
                else
                {
                    
                }
                //System.out.println("Exited.Thank you...");
            }
            else if(c==3)
                {
                    //Exit
                    System.out.println("Exited.Thank you...");
                    break;
                }
        }
    }
    
}
