package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter launch velocity (m/s): "); //asking for the launch velocity
		int vel = inKey.nextInt();
		System.out.print("Enter launch angle (degrees) : "); //asking for launch angle 
		int ang = inKey.nextInt();
		
		System.out.println("Projectile's path: "); //stating that this is the projectile's path 
		System.out.print("\n");
		
		int time = 0; //declaring the time 
		double xPosition = 1; //declaring the x position
		double yPosition = 1; //declaring the y position
		boolean continueLoop = true; 
		
		while (continueLoop) {
			xPosition = Math.cos(Math.toRadians(ang)) * time * vel; //calculating the x position
			yPosition = Math.sin(Math.toRadians(ang)) * time * vel - 0.5 * 9.8 * (time * time); //calculating the y position
			
			if (time != 0 && yPosition < 0) { // if statement to stop the loop
				yPosition = 0;
				continueLoop = false;
				
			}
			//Printing out the results
			
			System.out.println("Time: " + time);
			System.out.println("x-position: " + xPosition + "m");
			System.out.println("y-position: " + yPosition + "m");
			
			System.out.print("\n");
			
			time++; // upping the time
		}
				
		
		
		
		
	}
	
	
}
