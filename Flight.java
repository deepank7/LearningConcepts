
public class Flight {
	private int passengers, seats, flightNumber;
	private char flightClass;
	private boolean[] isSeatAvailable = new boolean[seats]; 
	Flight(){
		seats = 150;
		passengers = 0;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void addPassenger() {
		if(passengers < seats)
			passengers+=1;
	}
	public boolean hasRoom(Flight f2) {
		int total = this.passengers + f2.passengers;
		return total <= seats;
	}
	
	public static void main(String[] args) {
		Flight f1 = new Flight();
		f1.addPassenger();
		Flight f2 = new Flight();
		f2 = f1;
		System.out.println(f1.passengers);
		System.out.println(f2.passengers);
	}
}
