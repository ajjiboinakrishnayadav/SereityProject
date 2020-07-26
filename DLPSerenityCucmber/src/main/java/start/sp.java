package start;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sp {
	public static String date="16/06/2019";
	
	public static void main(String[] args) throws ParseException {
		
		
		
		Date currentDate = new Date();
		Date dateToBeSelected = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		String day = new SimpleDateFormat("dd").format(dateToBeSelected);
		String month = new SimpleDateFormat("MMM").format(dateToBeSelected);
		String year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
		String monthYear=month+"-"+year;
	
		
		System.out.println(monthYear);
	}
	
}
