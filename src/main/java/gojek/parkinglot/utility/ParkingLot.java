package gojek.parkinglot.utility;

/**
 * 
 * @author sharath
 * Defines the methods to be implemented/exposed to the client. 
 */
public interface ParkingLot {
	void createParkingLot(int N);
	void vacateSlot(int N);
	String status();
	int park(String registrationNum, String Color);
	int[] registrationNumbersByColor(String color);
	int[] slotNumbersByColor(String color);
	int slotNumberByRegistration(String registrationNum);
}
