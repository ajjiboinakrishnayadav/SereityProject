package furs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostgreSQLJDBC {
	
	   public static String eid="45";

	public  List getname() {
		List<String> nameList =new ArrayList<String>();
		
		String  name =null;
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://192.168.0.198:5432/JOCATA_GRID",
	            "devuser", "L~z).!6(");
	         c.setAutoCommit(false);
	        // System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "select cr.user_name,cr.user_id  from  jg_um.jum_role ro inner join \r\n" + 
	         		"jg_um.jum_user_role us on us.role_id =ro.role_id  \r\n" + 
	         		"inner join jg_um.jum_user_credentials  cr\r\n" + 
	         		"on cr.user_id =us.user_id  where us.role_id='"+eid+"';\r\n" + 
	         		"" );
	         
	         
	         while ( rs.next() ) {
	              name = rs.getString("user_name");
	              nameList.add(name);;
	            //System.out.println( "Username = " + name);
	            }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	     
	     // System.out.println("Operation done successfully");
		return nameList;
	   }
	
	
	public  List getnametwo(String applicationid) {
		List<String> nameList =new ArrayList<String>();
		
		String  name =null;
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://192.168.0.198:5432/JOCATA_GRID",
	            "devuser", "L~z).!6(");
	         c.setAutoCommit(false);
	        // System.out.println("Opened database successfully");

	         stmt = c.createStatement();
				ResultSet rs = stmt.executeQuery( "select * from jg_wfm.jwf_app_user_task where app_id="+applicationid+"" );

	         
	         
	         while ( rs.next() ) {
	              name = rs.getString("assignee");
	              nameList.add(name);;
	            //System.out.println( "Username = " + name);
	            }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	     
	     // System.out.println("Operation done successfully");
		return nameList;
	   }
}




