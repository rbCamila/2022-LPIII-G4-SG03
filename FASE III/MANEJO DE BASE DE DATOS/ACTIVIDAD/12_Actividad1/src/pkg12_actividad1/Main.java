package pkg12_actividad1;
import java.sql.*;
class Main{
    public static void main(String[] args) throws Exception{

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306","root","lusi");

    CallableStatement stmt=con.prepareCall("{call Actividad(?,?,?,?)}");
    stmt.setInt(1,1011);
    stmt.setString(2,"Lucho");
    stmt.setString(3,"Admin");
    stmt.setInt(4,6);
    stmt.execute();

    System.out.println("accesible");
    }
}

/*
import java.sql.*;
class Main{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Actividad","root","lusi");

            PreparedStatement stmt=con.prepareStatement("insert into ucsm values(?,?,?,?)");
            stmt.setInt(1,0);
            stmt.setString(2,"Juan");
            stmt.setString(3,"Doc.Red");
            stmt.setInt(4,5);

            int i=stmt.executeUpdate();
            System.out.println(i+" insertado");

            con.close();

        }catch(Exception e){ 
            System.out.println(e);
        }
    }
} */
/*
import java.sql.*;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider; 
public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/Actividad");
        rowSet.setUsername("root");
        rowSet.setPassword("lusi");

        rowSet.setCommand("select * from ucsm");
        rowSet.execute();
        while (rowSet.next()) {
        // Generating cursor Moved event
        System.out.println("Codigo: " + rowSet.getString(1));
        System.out.println("Nombre: " + rowSet.getString(2));
        System.out.println("Carrera: " + rowSet.getString(3));
        }
    } 
}
*/

/*
public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Actividad","root","lusi");
            //here sonoo is database name, root is username and password
            PreparedStatement pst = con.prepareStatement("DELETE FROM ucsm WHERE nombre='Camila'"); 
            pst.executeUpdate();           
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }  
    }
}
//ingresar a la base de datos
PreparedStatement pst = con.prepareStatement("INSERT INTO ucsm(codigo,nombre,carrera,anio) VALUES('2021563245','Camila','Ing.Ambiental','4')"); 
            pst.executeUpdate();
//recuperar de la base de datos
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("SELECT * FROM ucsm");
while(rs.next())
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//modificar
PreparedStatement pst = con.prepareStatement("UPDATE ucsm SET nombre= 'Elmer' WHERE carrera= 'Doc.Sistematico'"); 
            pst.executeUpdate();
//Eliminar
PreparedStatement pst = con.prepareStatement("DELETE FROM ucsm WHERE nombre='Camila'"); 
            pst.executeUpdate(); 
*/
/*
create table ucsm(
codigo integer(10) primary key,
nombre varchar(40),
carrera varchar(50),
anio integer(3)
);
INSERT INTO ucsm
(codigo,nombre,carrera,anio)
VALUES
('2021243361','Elmer','Ing.Sistemas','2'),
('2021351624','Josue','Ing.Civil','3'),
('2021152433','Mario','Ing.Mecanica','1');

SELECT * FROM ucsm
DELETE FROM ucsm
*/