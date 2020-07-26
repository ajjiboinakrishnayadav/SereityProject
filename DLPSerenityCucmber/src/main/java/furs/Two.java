package furs;

import java.util.List;


public class Two {

	
	public static void main(String[] args) {
		
		
		PostgreSQLJDBC po= new PostgreSQLJDBC();
		/*List<String> userList=po.getname();
		
		for(String user:userList)
		{
			System.out.println("users-----" +user);
			//actions
			}*/
		
		
    /*System.out.println("first-----" +userList.get(0));
	System.out.println("first-----" +userList.get(1));

   System.out.println("first-----" +userList.get(2));
*/
		
		/*List<String> userListse=po.getnametwo("1292");
		
		System.out.println("first-----" +userListse.get(0));
		System.out.println("first-----" +userListse.get(1));

	   System.out.println("first-----" +userListse.get(2));
*/
	   
	   PostgrceListvalues postg =new PostgrceListvalues();
	   
		List<String> userListstwoe=postg.getnametwo("1292");
		
		
		System.out.println("first-----" +userListstwoe.get(0));
		System.out.println("first-----" +userListstwoe.get(1));

	   System.out.println("first-----" +userListstwoe.get(2));
	   System.out.println("first-----" +userListstwoe.get(3));

	   System.out.println("first-----" +userListstwoe.get(4));
      
       
	   
		
	}
	
	
	
	
}
