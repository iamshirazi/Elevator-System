/**
 * Makes and starts all threads in the system.
 */

/**
 * @author Matthew
 *
 */
public class Controller {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scheduler scFloor1 = new Scheduler();
		Scheduler scFloor2 = new Scheduler();
		Scheduler scElevator1 = new Scheduler();
		
		Thread floor1 = new Thread (new Floor(scFloor1, 1));
		Thread floor2 = new Thread (new Floor(scFloor2, 2));
		Thread elevator1 = new Thread (new Elevator(scElevator1));
		
		floor1.start();
		floor2.start();
		elevator1.start();
		
		// TEST CASES BELOW //

	}

}
