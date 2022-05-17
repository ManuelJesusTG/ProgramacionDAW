import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Consultas {

    public static List<String> getProductLines() {

        List<String> ProductLine = null;

        try {
            Connection con = ConexionBD.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT productLine FROM productlines p");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("productLine"));
                String rs1 = rs.getString("productLine");
                ProductLine.add(rs1);
            }
            con.close();
            return ProductLine;


        } catch (SQLException e){
            System.out.println();
        }
        return ProductLine;
    }

    public static void CategoriaMasVendida(){

        try {
            Connection con = ConexionBD.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT ProductLine, COUNT(o.quantityOrdered) from products p inner join orderdetails o  on p.productCode = o.productCode Group by productLine;");

            ResultSet rs = ps.executeQuery();

            String rs1 = rs.getString("ProductLine");

            System.out.println("La categoria mas vendida es la categoria "+ rs1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
