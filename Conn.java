package hospital.managaement.system;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Conn {
    //for establishing the connection & connecting our database here
        Connection connection;
        Statement statement;

        // while connecting our file with some external database, there are chances of getting errors:
    public Conn(){
        try{
//            inside getConnection, we need to enter the Database URL
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "VENECEDOr_01");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
