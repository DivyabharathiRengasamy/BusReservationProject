package busReservation;

import java.sql.*;
import java.sql.SQLException;

public class BusDao {

	public void displayBusInfo() throws SQLException {

		String query = "select* from bus;";
		Connection connection = DbConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			System.out.println("Bus number " + resultSet.getInt(1));

			if (resultSet.getInt(2) == 0)
				System.out.println("AC:No");
			else
				System.out.println("AC: Yes");

			System.out.println("Capacity of the bus " + resultSet.getInt(3) + " ");

		}
	}

	public int getCapacity(int id) throws SQLException {
		String query = "select capacity from bus where id=" + id;
		Connection connection = DbConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		resultSet.next();
		return resultSet.getInt(1);
	}
}
