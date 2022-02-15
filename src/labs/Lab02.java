package labs;

import java.util.Scanner;

public class Lab02 {

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
		
		int max = Math.max(input1 , input2);
		int min = Math.min(input1 , input2);
		
		int scope = max - min + 1;
		
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * scope + min);
			System.out.print(num + " ");
			
			
		}
	
		System.out.println();
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = inKey.nextInt();
		System.out.print("Enter the height: ");
		int height = inKey.nextInt();
		
		double radsq = Math.pow(radius, 2);

		double volume = Math.PI * radsq * height;
		
		System.out.println(volume);
		
		
	}

	
	

	public static void problem03() {

Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double X2 = x1 -= x2;
		double Y2 = y1 -= y2;
		
		double X = Math.pow( X2 , 2);
		Double Y = Math.pow( Y2 , 2);
		
		double dist = X += Y;
		
		double finDist = Math.sqrt(dist);
		
		System.out.println(finDist);
		
		
		
		
		
	}


	
	
	public static void problem04() {
		
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		
		double b2 = Math.pow(b, 2);
		double in1 = b2 - (4 * a * c);
		double in1s = Math.sqrt(in1);
		double x1x1 = -b + in1s;
		double x1 = x1x1 / (2 * a);
		
	
		double in2 = b2 - (4 * a * c);
		double in2s = Math.sqrt(in2);
		double x2x2 = -b - in2s;
		double x2 = x2x2 / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
	
	

	
}
