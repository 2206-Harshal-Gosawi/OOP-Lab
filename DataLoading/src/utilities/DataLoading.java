package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DataLoading {
	public static List<Date> loadData(String file){
	    SimpleDateFormat stringToDate = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Date> outputList = new ArrayList<Date>();
		Scanner scanner;
		File f;
		try {
			f=new File(file);
			scanner=new Scanner(f);
			while(scanner.hasNextLine()){
				outputList.add(stringToDate.parse(scanner.next()));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return outputList;
	}
}
