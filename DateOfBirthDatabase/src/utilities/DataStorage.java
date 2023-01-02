package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataStorage {

	public static void insertData(String conn, List<String> dates) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(conn);
			String createTable = "CREATE TABLE IF NOT EXISTS date_of_birth (sr_no INTEGER,date VARCHAR(12),PRIMARY KEY(\"sr_no\" AUTOINCREMENT));";
			Statement statement = connection.createStatement();
			statement.execute(createTable);
			String insertQuery = "insert into date_of_birth (date) values ";
			for (int i = 0; i < dates.size(); i++) {
				if (i == dates.size() - 1) {
					insertQuery += "('" + dates.get(i) + "');";
				} else {
					insertQuery += "('" + dates.get(i) + "'),";
				}
			}
			statement.execute(insertQuery);
			System.out.println("Data Inserted Successfully\n");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}
}
