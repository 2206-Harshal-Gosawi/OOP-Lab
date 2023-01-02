package utilities;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CreateFile {
	public static void create(List<Date> dates) {
		FileWriter fileWriter;
	    SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		try {
			if(dates.size()>0) {
				fileWriter=new FileWriter("./output.txt");
				for(Date date:dates) {
					fileWriter.write(formatter.format(date)+"\n");
				}
				fileWriter.close();
				System.out.println("File Created Successfully");	
			}
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
	}
}
