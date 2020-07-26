package start;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
	   public static String eid="45";

	public static void main( String args[] ) {
		
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://192.168.0.198:5432/JOCATA_GRID",
	            "devuser", "L~z).!6(");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "select cr.user_name,cr.user_id  from  jg_um.jum_role ro inner join \r\n" + 
	         		"jg_um.jum_user_role us on us.role_id =ro.role_id  \r\n" + 
	         		"inner join jg_um.jum_user_credentials  cr\r\n" + 
	         		"on cr.user_id =us.user_id  where us.role_id='"+eid+"';\r\n" + 
	         		"" );
	         while ( rs.next() ) {
	           // int id = rs.getInt("user_id");
	            String  name = rs.getString("user_name");
	            String  val = rs.getString("user_id");

	            /*int age  = rs.getInt("age");
	            String  address = rs.getString("address");
	            float salary = rs.getFloat("salary");
	            System.out.println( "ID = " + id );
	            //System.out.println( "NAME = " + name );
	            System.out.println( "AGE = " + age );
	            System.out.println( "ADDRESS = " + address );
	            System.out.println( "SALARY = " + salary );
	            */System.out.println();
	            System.out.println( "Username = " + name);
	            System.out.println( "userid = " + val);

	            
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	     
	      System.out.println("Operation done successfully");
	   }
}
