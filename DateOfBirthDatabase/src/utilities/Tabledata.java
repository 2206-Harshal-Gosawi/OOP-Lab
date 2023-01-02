package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tabledata {
	public static void printData(String conn,String table) throws SQLException {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(conn);
			 String sql = "SELECT * FROM "+table;
			 Statement stmtStatement = connection.createStatement();
			 ResultSet resultSet = stmtStatement.executeQuery(sql);
	            while (resultSet.next()) {
	                System.out.println(resultSet.getInt("sr_no") +  "\t" + 
	                		resultSet.getString("date"));
	            }
	
		} catch (Exception e) {
			// TODO: handle exception	
			System.out.println(e);
		}finally {
			if(connection!=null) {
				connection.close();
			}
		}
	}
}
