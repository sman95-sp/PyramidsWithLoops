/*
 *Assignment 04
 * Sahil Patel
 * Pyramids with loops
 * 9/26/19
 * Course: App Dev W/ Java
 * patel3s7@mail.uc.edu
 * 
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		int LineN;
		
		//outer loop to do number of rows
		for (int i=0; i<n; i++)
		{	
		//inner loop to do spaces
		for (int j=n-i; j>1; j--)
		{
			System.out.print(" ");
		}
		
		//inner loop to do number of columns
		LineN= i+1;
		System.out.print(LineN);
		for (int j=1; j<=i; j++)
		{
		//printing numbers
		System.out.print(LineN + "" + LineN);
	}
		//ending lines after the rows
		System.out.println();
	}
}
}

	
