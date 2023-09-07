package busReservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date;

	Booking() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name");
		passengerName = scanner.nextLine();

		System.out.println("Enter BusNumber");
		busNo = scanner.nextInt();

		System.out.println("Enter dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		date = dateFormat.parse(dateInput);

	}

	
	public boolean isAvailabe() throws SQLException {
		BusDao busDao=new BusDao();
		BookingDao bookingDao=new BookingDao();		
		int capacity=busDao.getCapacity(busNo);
		int booked=bookingDao.getBookedCount(busNo,date);
		return booked < capacity ? true : false;
	}
}