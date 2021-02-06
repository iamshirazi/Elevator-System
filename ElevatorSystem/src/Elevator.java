/**
 * Creates an Elevator thread which sends and receives packets.
 */

import java.io.*;
import java.net.*;

/**
 * @author Matthew
 *
 */
public class Elevator implements Runnable {

	private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket sendRecieveSocket;
	private boolean[] carButtonSelected;
	private boolean upDirectionalLampIsOn;
	private boolean downDirectionalLampIsOn;
	private boolean motorOn;
	private boolean doorsOpen;
	
	public Elevator(Scheduler scheduler) {
		
		carButtonSelected = new boolean[1];
		upDirectionalLampIsOn = false;
		downDirectionalLampIsOn = false;
		motorOn = false;
		doorsOpen = false;
		
		try {
			
			sendRecieveSocket = new DatagramSocket(5002);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		// End of constructor
	}
	
	/**
	 * Finds the button pressed and sets it to true.
	 * @param floor_num
	 * @return
	 */
	public boolean isButtonSelected(int floor_num) {
		
		return carButtonSelected[floor_num - 1] = true; // Floor - 1 because floor 1 is at position 0 in array.
	}
	
	/**
	 * Returns if the up button was pressed.
	 * @return
	 */
	public boolean isUpDirectionLampOn() {
		
		return upDirectionalLampIsOn;
	}
	
	/**
	 * Returns if the down button was pressed.
	 * @return
	 */
	public boolean isDownDirectionLampOn() {
		
		return downDirectionalLampIsOn; 
	}
	
	/**
	 * Sets the corresponding button lamp to true, depending on which button is pressed.
	 * @param direction
	 */
	public void setDirectionLamp(String direction) {
		
		if (direction.equals("up")) {
			downDirectionalLampIsOn = false;
			upDirectionalLampIsOn = true;
		} else {
			upDirectionalLampIsOn = false;
			downDirectionalLampIsOn = true;
		}
	}
	
	/**
	 * Turns elevator on in a specified direction.
	 * @param direction
	 */
	public void startElevator(String direction) {
		
		motorOn = true;
		closeDoors();
		
		// Not sure how to send the elevator up/down :(
	}
	
	/**
	 * Stops the elevator.
	 */
	public void stopElevator() {
		
		motorOn = false;
		openDoors();
		
		// Anything else that needs to be added?
	}
	
	/**
	 * Opens the elevator doors.
	 */
	public void openDoors() {
		
		doorsOpen = true;
	}
	
	/**
	 * Closes the elevator doors.
	 */
	public void closeDoors() {
		
		doorsOpen = false;
	}
	
	/**
	 * 
	 */
	public void receivePacket() {
		
		
	}
	
	/**
	 * 
	 */
	public void sendPacket() {
		
		
	}
	
	@Override
	public void run() {
		
		receivePacket();
		
	}
}
