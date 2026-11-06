import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class a {

    private static final String URL      = "jdbc:mysql://localhost:3306/tienda";
    private static final String USUARIO  = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
             Statement st = con.createStatement()) {

            int cambios = st.executeUpdate("INSERT INTO cliente (nombre, direccion, ciudad, email) "+ "VALUES ('Ana Ruiz', 'C/ Sol 7', 'Malaga', 'ana.ruiz@mail.com')");
            System.out.println("INSERT: " + cambios + " fila(s)");

            try (ResultSet rs = st.executeQuery("SELECT id_cliente, nombre, ciudad FROM cliente WHERE email = 'ana.ruiz@mail.com'")) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id_cliente") + " - " + rs.getString("nombre")+ " (" + rs.getString("ciudad") + ")");
                }
            }

            cambios = st.executeUpdate("UPDATE cliente SET ciudad = 'Granada' WHERE email = 'ana.ruiz@mail.com'");
            System.out.println("UPDATE: " + cambios + " fila(s)");

            cambios = st.executeUpdate("DELETE FROM cliente WHERE email = 'ana.ruiz@mail.com'");
            System.out.println("DELETE: " + cambios + " fila(s)");

            

        } catch (SQLException e) {
            System.out.println("Error SQL " + e.getErrorCode() + ": " + e.getMessage());
        }
    }
}