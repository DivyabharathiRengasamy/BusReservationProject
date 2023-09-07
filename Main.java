package busReservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException, SQLException {
		BusDao busDao=new BusDao();
		try {
			busDao.displayBusInfo();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		int userOption = 1;
		Scanner obj = new Scanner(System.in);
		while (userOption == 1) {
			System.out.println("Enter 1 for Booking and 2 for Exit");
			userOption = obj.nextInt();
			if (userOption == 1) {
				Booking booking = new Booking();
				
				if (booking.isAvailabe()){
					BookingDao bookingDao=new BookingDao();
					bookingDao.addBooking(booking);
					System.out.println("Great your booking is confirmed");
				}
					else
					System.out.println("sorry bus is full");
			} 
			else
				System.out.println("Thank you for having a service");
		}
	}

}

