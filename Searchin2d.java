//Search in a 2D array using linear search
//row wise checking
package com.linearsearch;


import java.util.Arrays;
import java.util.Scanner;

public class Searchin2d {

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
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(element==array[i][j])
				{
					System.out.println("Element find at row and column : "+i+" "+j);
					found=true;
					break outerLoop;
				}
			}
		}
		if(!found)
		{
			System.out.println(element+" not present in the array");
		}
		System.out.println(Arrays.deepToString(array));
		scanner.close();
	}
}
