package ex01;

import java.util.*;

public class calAverage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入三個整數，中間用空白間隔: "); // prompt user enter three integers
		int iNum1 = scn.nextInt(); // store 1st value
		int iNum2 = scn.nextInt(); // store 2nd value
		int iNum3 = scn.nextInt(); // store 3rd value
		float fSum = iNum1 + iNum2 + iNum3; // sum
		float fAver = fSum / 3; // calculate average
		
		System.out.printf("%.2f", fAver); // print out the result
		scn.close();
	} // end main

}
