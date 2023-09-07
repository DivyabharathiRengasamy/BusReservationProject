package busReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BookingDao {

	public int getBookedCount(int busNo, Date date) throws SQLException {
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=?;";
		Connection connection=DbConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		preparedStatement.setInt(1,busNo);
		preparedStatement.setDate(2, sqldate);
		ResultSet resultSet=preparedStatement.executeQuery();
		resultSet.next();
		return resultSet.getInt(1);
	}

	public void addBooking(Booking booking) throws SQLException {
		String query="insert into booking values(?,?,?);";  
		Connection connection=DbConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		preparedStatement.setString(1, booking.passengerName);
		preparedStatement.setInt(2,booking.busNo);
		preparedStatement.setDate(3, sqldate);
		
		int rows=preparedStatement.executeUpdate();
	}

}
