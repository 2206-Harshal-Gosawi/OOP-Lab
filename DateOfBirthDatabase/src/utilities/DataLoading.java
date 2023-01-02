package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoading {
	public static List<String> loadData(String file){
		List<String> outputList = new ArrayList<String>();
		Scanner scanner;
		File f;
		try {
			f=new File(file);
			scanner=new Scanner(f);
			while(scanner.hasNextLine()){
				outputList.add(scanner.next());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return outputList;
	}
}
