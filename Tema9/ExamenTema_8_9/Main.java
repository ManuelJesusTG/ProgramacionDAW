import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Consultas.getProductLines();

       Consultas.CategoriaMasVendida();

       Transacciones.insertarPerdido();

    }
}
