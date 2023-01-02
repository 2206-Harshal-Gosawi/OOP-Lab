package client;

import java.util.Date;
import java.util.List;

import utilities.CreateFile;
import utilities.DataLoading;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Date> dates = DataLoading.loadData("./inputFile.txt");
		CreateFile.create(dates);

	}

}
