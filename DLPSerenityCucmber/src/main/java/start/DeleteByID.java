package start;
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DeleteByID {
	public static void main(String[] args) {
	try{
			Class.forName("org.postgresql.Driver").newInstance();

			//serverhost = localhost, port=3306, username=root, password=123
			Connection cn=DriverManager.getConnection("jdbc:postgresql://192.168.0.198:5432/JOCATA_GRID",
		            "devuser", "L~z).!6(");
	        

			Statement smt=cn.createStatement();

			DataInputStream KB=new DataInputStream(System.in);

			//input a particular employee id of which we want to delete record
			System.out.print("Enter Employee ID:");
			String eid="AECPL1012M";

			//query to take data of a particular record from table employee
			String q="Select * from jg_dl.jdl_customer_principal where tax_id_no='"+eid+"'";

			//to execute query
			ResultSet rs=smt.executeQuery(q);

			if(rs.next())
			{
				//to show the data
				System.out.println("Employee id:"+rs.getString(1));
				System.out.println("Employee Name:"+rs.getString(2));
				System.out.println("Employee DOB:"+rs.getString(3));
				System.out.println("Employee City:"+rs.getString(4));
				System.out.println("Employee Salary:"+rs.getString(5));
				System.out.println("Sure To Delete Above Record Yes/No?");
				String ch="AECPL1012M";
				if(ch.equals(eid))
				{
					//query to delete data of a particular record from table employee
					q="delete from jg_dl.jdl_customer_principal where tax_id_no='"+eid+"'";
					//to execute query
					smt.executeUpdate(q);
					System.out.println("Record Deleted...");
				}
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}