package busReservation;

public class Bus {
	int busNo;
	boolean ac;
	int capacity;
	Bus(int busNo,boolean ac,int capacity) {
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		
		return "Bus Number : "+busNo+", AC : "+ac+", Capacity of the bus : "+capacity;
	}
}
