import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import com.mysql.cj.protocol.Resultset;
import game.model.*;
public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3606;

    private static final String DB_NAME = "dyc";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "root";

    private static Connection conn;


    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones
        nuevo_dragon("Viseryon");
        List<Arma> hachas = mostrar_hachas("Forja de Tebez");
        for(Arma a : hachas) {
            System.out.println(a.getNombreA());
        }
        List<Dragon> lista = squad_derrota_dragones("Ready to Rumble");
        for(Dragon d : lista) {
            System.out.println(d.getName());
        }

        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevo_dragon(String nombre){
        // @TODO: complete este método para que cree un nuevo dragón en la base de datos
        try {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO dyc.Dragon (NombreD) VALUES (?)");
            statement.setString(1, nombre);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fallo al insertar dragon");
        }

        System.out.println(espada_porta_guerrero("Stanto"));
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

    public static List<Arma> mostrar_hachas(String nombre_forja){
        // @TODO: complete este método para que muestre por pantalla las hachas que pueden forjarse en "nombre_forja"
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada hacha disponible en esa forja, y añadirlos a la lista
        List<Arma> hachas = new ArrayList<>();
        try{
            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM Arma JOIN CatalogaH ON Arma.idArma = CatalogaH.idArma WHERE Arma.NombreR = ? AND CatalogaH.nombreF LIKE ?");
            stmn.setString(2, nombre_forja);
            stmn.setString(1, "Tanque");
            ResultSet rs = stmn.executeQuery();
            while (rs.next()) { 
                Arma current = new Arma(rs.getString("NombreA"), rs.getInt("Peso"), rs.getInt("Daño"), rs.getLong("IdArma"), rs.getString("NombreR"));
                hachas.add(current);
            }
        }
        catch (SQLException exception) {
            System.out.println("La query ha fallado");
        }
        return hachas;
    }


    public static String espada_porta_guerrero(String nombre_guerrero) {
        // @TODO: complete este método para que devuelva el nombre de la espada que porta el guerrero "nombre_guerrero"
        Statement stmt = null;
        ResultSet rs = null;
        String espada = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery( "SELECT NombreA FROM Arma JOIN PortaE ON Arma.IdArma = PortaE.IdArma JOIN PortaE.NombreP = Personaje.NombreP WHERE Guerrero.NombreP LIKE " + nombre_guerrero);
            if (!rs.getString(1).equals("") && rs.getString(1) != null) {
                rs = stmt.getResultSet();
                espada = rs.getString("NombreA");
            }
        } catch (SQLException exception) {
            System.out.println("Fallo en la query Mostrar nombre Espada");

        }
        return espada;
    }
}
 /* "SELECT nombreEspada" +
                            "FROM Espada JOIN PortaE ON Espada.idEspada = PortaE.idEspada JOIN Guerrero ON PortaE.NombreP = Guerrero.NombreP" +
                            "WHERE Guerrero.NombreP LIKE " + nombre_guerrero */

 /* @TODO: que me cargue Guerrero, Hacha y Espada, y hacer clases Personaje, Rol y Arma */