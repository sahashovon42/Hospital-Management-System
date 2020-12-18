package hospital.management.admin.system;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shovon
 */
public class Mysql {
    static Connection con;
    public static Connection createC(){
        
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        String user="root";
        String password="";
        String url= "jdbc:mysql://localhost:3306/Hospital_Management_System";
        con = DriverManager.getConnection(url,user,password); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        
    return con;
    }
    
}
