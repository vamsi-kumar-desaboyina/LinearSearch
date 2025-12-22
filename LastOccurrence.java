//Find last occurrence of an element
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrence {

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
		System.out.println("enter the element to find in the array ");
		int element=scanner.nextInt();
		boolean present=true;
		for(int i=array.length-1;i>=0;i--)
		{
			if(element==array[i])
			{
				System.out.println("Element find at index : "+i);
				present=false;
				break;
			}
		}
		if(present)
		{
			System.out.println(element+" not present in the array :"+Arrays.toString(array));
		}
		scanner.close();
	}

}
