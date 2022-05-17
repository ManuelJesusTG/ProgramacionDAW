import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void insertarPerdido(){

        try {
            Connection con = ConexionBD.getConnection();

            PreparedStatement ps = con.prepareStatement("Insert Into orders values (?,?,?,?,?,?,?)");

            ps.setInt(1,777);
            ps.setDate(2,new Date(2008,8,10));
            ps.setDate(3,new Date(2008,8,11));
            ps.setDate(4,new Date(2008,8,12));
            ps.setString(5,"Todo Bien");
            ps.setString(6,"Entrega Exitosa");
            ps.setInt(7,181);

            ps.executeUpdate();

            PreparedStatement ps1 = con.prepareStatement("Insert Into values (?,?,?,?,?)");

            ps1.setInt(1,777);
            ps1.setString(2,"S10_777");
            ps1.setInt(3,99999);
            ps1.setDouble(4,5.00);
            ps1.setInt(5,5);

            ps1.executeUpdate();

        } catch (SQLException e) {
            try {
                ConexionBD.con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);

        }

    }

}
