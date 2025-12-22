//Search in a 2D array using linear search
//column wise checking
package com.linearsearch;

import java.util.Scanner;

public class Searchin2darray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the row size of the array");
		int row=scanner.nextInt();
		System.out.println("enter the column size of the array");
		int column=scanner.nextInt();
		int[][] array=new int[row][column];
		System.out.println("Enter the Elements in the row ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println("enter the element to find in the array ");
		int element=scanner.nextInt();
		boolean found=false;
		outerLoop:
		for (int col = 0; col < column; col++) {       // outer loop: columns
			for (int r = 0; r < row; r++) {           // inner loop: rows
			        if (array[r][col] == element) {      // check element at row r, column col
			            System.out.println("Element found at row " + r + ", column " + col);
			            found = true;
			            break outerLoop;
			        }
			}
		}

		if(!found)
		{
			System.out.println(element+" not present in the array");
		}
		scanner.close();
	}
}
