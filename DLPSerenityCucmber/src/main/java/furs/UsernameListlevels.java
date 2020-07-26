package furs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsernameListlevels {

	public String  name =null;
    public String tasknmae=null;
	
	public  HashMap<String, String> getname(String applicationid) {
	      HashMap<String, String> hmap = new HashMap<String, String>();


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
	              tasknmae = rs.getString("custom_task_name");
	             
	              hmap.put(name,tasknmae);;
	              //tasknameList.add(tasknmae);
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
		return hmap;
	   }
	
	public static void main(String[] args) {
		
		UsernameListlevels user= new UsernameListlevels();
		HashMap<String, String> users=user.getname("1235");
		
			
	}
}
