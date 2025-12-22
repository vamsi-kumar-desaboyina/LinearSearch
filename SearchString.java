//Search a string in an array of strings
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scanner.nextInt();
		scanner.nextLine();
		String[] array=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Elements");
			array[i]=scanner.nextLine();
		}
		System.out.println("enter the element to find in the array ");
		String element=scanner.nextLine();
		boolean found=true;
		for(int i=0;i<array.length;i++)
		{
			if(element.equals(array[i]))
			{
				System.out.println("Element find at index : "+i);
				found=false;
				break;
			}
		}
		if(found)
		{
			System.out.println(element+" not present in the array :"+Arrays.toString(array));
		}
		scanner.close();
	}

}
