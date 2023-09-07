package busReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	private static final String url="jdbc:mysql://localhost:3306/busreservation";
	private static final String uname="root";
	private static final String password="Apal@420";
	
	public static Connection getConnection() throws SQLException {
	
		return DriverManager.getConnection(url, uname, password);
	}
}
