//Find whether an element exists in an unsorted list

package com.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ElementExistinUnsortedlist {

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
		ArrayList<Integer> a=new ArrayList<>();
		for(int ele:array)
		{
			a.add(ele);
		}
		boolean found=true;
		for(int i=0;i<array.length;i++)
		{
			if(element==a.get(i))
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
