//Find the frequency (count) of an element
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class CountElement {

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
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(element==array[i])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(element+" not present in the array :"+Arrays.toString(array));
		}
		else System.out.println(count+" times the element is present in the array of "+Arrays.toString(array));
		scanner.close();
	}

}
