package start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CPAuser {
	public static String  name;

	public static String getthecpauser(String applicationid) {
		
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
			ResultSet rs = stmt.executeQuery( "select * from jg_wfm.jwf_app_user_task where app_id="+applicationid+"" );
	         while ( rs.next() ) {
	           // int id = rs.getInt("user_id");
	            name = rs.getString("assignee");
	            //String  val = rs.getString("user_id");

	           // System.out.println("assigning the value is---"+name);
	      }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	     
	      System.out.println("Operation done successfully");
		return name;
	   }


}
