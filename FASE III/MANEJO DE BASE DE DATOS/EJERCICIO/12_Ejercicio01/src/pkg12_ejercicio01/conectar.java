package pkg12_ejercicio01;
import java.sql.Connection;
import java.sql.DriverManager;
public class conectar {
    Connection conectar = null;
    public Connection connexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ejercicio1","root","lusi");
            
        } catch(Exception e){ 
            System.out.println(e);
        }
        return conectar;
    }    
}
