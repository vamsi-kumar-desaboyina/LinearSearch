//Find all positions of a given element
package com.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

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
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		boolean present=true;
		for(int i=0;i<array.length;i++)
		{
			if(element==array[i])
			{
				arrayList.add(i);
				present=false;
				
			}
		}
		if(present)
		{
			System.out.println(element+" not present in the array :"+Arrays.toString(array));
		}
		else System.out.println(arrayList);
		scanner.close();
	}

}
