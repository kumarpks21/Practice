package exception.handling;

import java.util.Scanner;

public class HandlingTheException {

	public static void main(String[] args)    {
	
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		
		int result= divisor/divident;
		System.out.println("FInal result is : " +result);
		
	
		
		
//		try {
//		int result= divisor/divident;
//		System.out.println("FInal result is : " +result);
//		}catch(ArithmeticException e) {
//			System.out.println("divident must be greater than 0");
//		}
		
//		try {
//		int result= divisor/divident;
//		System.out.println("FInal result is : " +result);
//		}catch(ArithmeticException e) {
//			throw new ArithmeticException("divident must be greater than 0");
//		}
		
//		if(divident>0) {
//			int result= divisor/divident;
//			System.out.println("FInal result is : " +result);
//		}else {
//			System.out.println("divident must be greater than 0");
//		}

	}

}
