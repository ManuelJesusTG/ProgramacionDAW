package XML_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static XML_BD.ConexionBD.con;
import static XML_BD.ConexionBD.getConnection;

public class Consultas {

    public static ArrayList<String> getProduct (Double price){

        try {

            Connection con = ConexionBD.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * from products p WHERE buyPrice < ?;");

            ps.setDouble(1,price);

            ArrayList<String> Product = new ArrayList<>();

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Product.add(rs.getString(1));
            }

            return Product;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
