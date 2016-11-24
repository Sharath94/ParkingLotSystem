package gojek.parkinglot.helper;

/**
 * 
 * @author sharath
 * This class holds the ticket data stored in the system. 
 */
public final class Ticket extends ArrayIndex{
	private final String regNum;
	private final String colour;
	
	public Ticket(String regNum, String colour, int slotNum) {
		super(slotNum);
		this.regNum = regNum;
		this.colour = colour;
	}

	public String getRegNum() {
		return regNum;
	}

	public String getColour() {
		return colour;
	}

}
