package client;

import java.sql.SQLException;
import java.util.List;

import utilities.DataLoading;
import utilities.DataStorage;
import utilities.Tabledata;

public class ClientApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<String> dates = DataLoading.loadData("./inputFile.txt");
		DataStorage.insertData("jdbc:sqlite:C:/Users/Harshal Gosawi/eclipse-workspace/DateOfBirthDatabase/laptopsdb.sqlite", dates);
		System.out.println("Data Retrived from Database");
		Tabledata.printData("jdbc:sqlite:C:/Users/Harshal Gosawi/eclipse-workspace/DateOfBirthDatabase/laptopsdb.sqlite","date_of_birth");
	}

}
