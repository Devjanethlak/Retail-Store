package bill;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String args[]){
    
        String url;
        url = "jdbc:mysql://localhost:3306/phdb";
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url,"root","");
           System.out.println("connected system");
        }catch(Exception a){
            System.out.println(a);
        }
    }
}
