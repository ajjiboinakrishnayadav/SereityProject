package start;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class deletepannumbers {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "org.postgresql.Driver";  
	   static final String DB_URL = "jdbc:postgresql://192.168.0.198:5432/JOCATA_GRID";

	   //  Database credentials
	   static final String USER = "devuser";
	   static final String PASS = "L~z).!6(";
		 public static String eid="ENNPS8007M";

	  
	   
	   public static String deletepannumber() {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("org.postgresql.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql = "update jg_dl.jdl_customer_principal set tax_id_no='' where tax_id_no='"+eid+"';";
	      //String sql = "delete from jg_dl.jdl_customer_principal where cp_id='"+eid+"'";
	      stmt.executeUpdate(sql);
	      
			System.out.println("Record Deleted..."+eid);


	      // Now you can extract all the records
	      // to see the remaining records
	      /*sql = "SELECT cp_id, first_name, last_name FROM jg_dl.jdl_customer_principal";
	      ResultSet rs = stmt.executeQuery(sql);
*/
	 /*     while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("cp_id");
	         int age = rs.getInt("first_name");
	         String first = rs.getString("last_name");
	         //String last = rs.getString("last");

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", Age: " + age);
	         System.out.print(", First: " + first);
	         //System.out.println(", Last: " + last);
	      }*/
	      
			stmt.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("-----");
	return eid;
	}//end main
}
