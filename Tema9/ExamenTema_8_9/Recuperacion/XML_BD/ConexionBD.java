package XML_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection con=null;

    public static Connection getConnection() {

        try{
            if (con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost:3337/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                System.out.println("Conexion realizada");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return (con);
    }
    public static void cerrar(){
        try {
            if (con != null) con.close();
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

}