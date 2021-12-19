import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import com.mysql.cj.protocol.Resultset;
import game.model.Dragon;
import game.model.Espada;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "xxxx";

    private static final int DB_PORT = 3606;

    private static final String DB_NAME = "dyc";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "root";

    private static Connection conn;


    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USEroot, DB_PASS);

        // @TODO pruebe sus funciones



        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevo_dragon(String nombre){
        // @TODO: complete este método para que cree un nuevo dragón en la base de datos

    }

    public static List<Dragon> squad_derrota_dragones(String squadName){
        // @TODO: complete este método para que devuelva una lista de los dragones derrotados por el squad
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto dragon para cada uno de los dragones, y añadirlos a la lista
        ResultSet rs = null;
        List<Dragon> defeated = new ArrayList<Dragon>();
        try {
            PreparedStatement stmn = conn.prepareStatement(
                    "SELECT * " +
                            "FROM dyc.mata" +
                            "WHERE NombreE = ?");
            stmn.setString(1, squadName);
            rs = stmn.executeQuery();
            while (rs.next()) {
                Dragon current = new Dragon(rs.getString("NombreD"), rs.getInt("VidaD"));
                defeated.add(current);
            }
        } catch (SQLException exception) {
            System.out.println("La query ha fallado");
        }
        return defeated;
    }

    public static List<Hacha> mostrar_hachas(String nombre_forja){
        // @TODO: complete este método para que muestre por pantalla las hachas que pueden forjarse en "nombre_forja"
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada hacha disponible en esa forja, y añadirlos a la lista

        return new ArrayList<Hacha>();
    }

    public static Resultset espada_porta_guerrero(String nombre_guerrero) {
        // @TODO: complete este método para que devuelva el nombre de la espada que porta el guerrero "nombre_guerrero"
        Statement stmt = null;
        Resultset rs = null;
        try {
            stmt = conn.createSatement();
            if (stmt.executeQuery(
                    "SELECT nombreEspada" +
                            "FROM Espada JOIN PortaE ON Espada.idEspada = PortaE.idEspada JOIN Guerrero ON PortaE.NombreP = Guerrero.NombreP" +
                            "WHERE Guerrero.NombreP LIKE" + nombre_guerrero)
            ) {
                rs = stmt.getResultSet();
            }

        } catch (SQLException exception) {
            System.out.println("Fallo en la query Mostrar nombre Espada");

        }
        return rs;
    }