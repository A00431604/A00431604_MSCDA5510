package com.dpenny.mcda5510.connect;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLJDBCConnection implements DBConnection{

	public Connection setupConnection()  {

		Connection connection = null;
		try {
			// This will load the MySQL driver, each DB has its own driver
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Setup the connection with the DB

			connection = DriverManager.getConnection("jdbc:mysql://localhost/tutorial1?user=root&password=Saibaba!27&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&sql_mode='ALLOW_INVALID_DATES'"); // timezone

		} catch (Exception e) {
			System.out.println("Error setting up connectino");
			e.printStackTrace();
		} finally {

		}
		return connection;
	}		
	
	
}
