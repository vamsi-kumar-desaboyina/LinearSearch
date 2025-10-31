//Search largest element smaller than target
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class LargestelementSmallerThanTarget {

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
		System.out.println("enter the target element ");
		int element=scanner.nextInt();
		scanner.close();
		int small=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(element>array[i] && array[i]>small)
			{
				small=array[i];
			}
		}
		 if (small == Integer.MIN_VALUE) {
	            System.out.println("No element smaller than " + element + " is present in the array: " + Arrays.toString(array));
	        } else {
	            System.out.println("Largest element smaller than " + element + " is: " + small);
	        }
	}

}
