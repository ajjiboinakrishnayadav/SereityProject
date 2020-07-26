package furs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostgrceListvalues {
	
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
				ResultSet rs = stmt.executeQuery( "select distinct custom_task_name  from jg_wfm.jwf_app_user_task where  custom_task_name like '%Assigning to %'");

	         
	         
	         while ( rs.next() ) {
	              name = rs.getString("custom_task_name");
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
