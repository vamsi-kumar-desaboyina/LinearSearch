package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

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
		scanner.close();
		boolean present=true;
		for(int i=0;i<array.length;i++)
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
	}

}
/*
 * Linear Search Algorithm
 *
 * This is a straightforward method to find an element in an array or list.
 * It works for both sorted and unsorted data, scanning each element one by one
 * until a match is found.
 *
 * Time Complexity:
 *   - Best Case: O(1)  (element found at the beginning)
 *   - Worst Case: O(n) (element found at the end or not found)
 *
 * Use Case:
 *   - Suitable for small or unsorted datasets.
 *
 * Limitation:
 *   - Inefficient for large-scale data.
 *   - More advanced approaches like Binary Search or Hash-based lookups
 *     are better for performance-critical applications.
 */


//https://chatgpt.com/share/68fafb1a-ed7c-8002-a9c4-ec53535381ec