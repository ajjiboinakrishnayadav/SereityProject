package start;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class secondtest {
	
	public static String a="June 1979";
	public static String charRemoveAt(String str, int p) {  
	       return str.substring(0, p) + str.substring(p + 1);  
	    }  

	
	public static String addChar(String str, char ch, int position) {
	    return str.substring(0, position) + ch + str.substring(position);
	}
	
	
	
	public static String latest() {
		
		String c=charRemoveAt(a, 3);
		//System.out.println(c); 


		String pp=addChar(c,'-',3);
		//System.out.println(pp.replace(" ", ""));

		String latest=pp.replace(" ", "");
		//System.out.println(latest);
		
		return latest;
		
	}
	public static void main(String[] args) {
		
	String latestp=	secondtest.latest();
	System.out.println(latestp);	
	
/*String a="June 1979";
String c=charRemoveAt(a, 3);
System.out.println(c); 


String pp=addChar(c,'-',3);
System.out.println(pp.replace(" ", ""));

String latest=pp.replace(" ", "");
System.out.println(latest);*/
	
	
	
	}
    
	
	
	
	

}
