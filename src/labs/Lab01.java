package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		
		
		double result = Math.pow(input1 , input2 );
		System.out.println(input1 +"^" +input2 + " = " + result + "\n");
		
	}
	
	
	
	
	public static void problem02() {
		
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		double input = inKey.nextDouble();
		
		double result = Math.sqrt(input);
		System.out.println("the square root of " + input + " is " + result + "\n");
		
		
		
		
		
		
	}

	
	

	public static void problem03() {
		
	Scanner inKey = new Scanner(System.in);
		
		System.out.print("Length on side A: ");
		double input1 = inKey.nextDouble();
		System.out.print("Length on side B: ");
		double input2 = inKey.nextDouble();
		
		double sideA = Math.pow(input1, 2);
		double sideB = Math.pow(input2, 2);
		
		double answer = Math.sqrt(sideA + sideB);
		
		System.out.println("Hypotenuse = " + answer);

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		
		int input = -1;
		int max = -70;
		int min = 70;
	
		while (input != 0) {
			
			
			
			System.out.print("Enter an integer: ");
			int input1 = inKey.nextInt();
			
			max = Math.max(max, input1);
			min = Math.min(min, input1);
			
			input = input1;
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
