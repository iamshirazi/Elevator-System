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
		
		try {
			
			sendRecieveSocket = new DatagramSocket();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/**
	 * 
	 * @param floor_num
	 * @return
	 */
	public boolean isButtonSelected(int floor_num) {
		
		return false; //temporary
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isUpDirectionLampOn() {
		
		return false; //temporary
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isDownDirectionLampOn() {
		
		return false; //temporary
	}
	
	/**
	 * 
	 * @param direction
	 */
	public void setDirectionLamp(String direction) {
		
		
	}
	
	/**
	 * 
	 * @param direction
	 */
	public void startElevator(String direction) {
		
		
	}
	
	/**
	 * 
	 */
	public void stopElevator() {
		
		
	}
	
	/**
	 * 
	 */
	public void openDoors() {
		
		
	}
	
	/**
	 * 
	 */
	public void closeDoors() {
		
		
	}
	
	/**
	 * 
	 */
	public void sendAndReceive() {
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
