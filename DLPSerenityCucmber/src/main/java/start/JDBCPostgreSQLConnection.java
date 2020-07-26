package start;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCPostgreSQLConnection {
	private final String url = "jdbc:postgresql://192.168.0.198/JOCATA_GRID";
    private final String user = "devuser";
    private final String password = "L~z).!6(";

    /**
     * 
     *Username: devuser

Password: L~z).!6(

Host: 192.168.0.198

Port: 5432
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBCPostgreSQLConnection app = new JDBCPostgreSQLConnection();
        app.connect();
    }
}
