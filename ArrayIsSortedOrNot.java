//Check if Array is Sorted.
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scanner.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Elements");
			array[i]=scanner.nextInt();
		}
		scanner.close();
		boolean isasc=true;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				isasc=false;
				break;
			}
		}
		boolean isdes=true;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				isdes=false;
				break;
			}
		}
		if(isasc || isdes)
		{
			System.out.println("sorted array :"+Arrays.toString(array));
		}
		else System.out.println("not sorted array :"+Arrays.toString(array));
	}

}
