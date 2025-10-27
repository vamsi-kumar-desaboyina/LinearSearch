//Find Common Elements Between Two Arrays
package com.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size1=scanner.nextInt();
		int[] array1=new int[size1];
		for(int i=0;i<size1;i++)
		{
			System.out.println("Enter the Elements");
			array1[i]=scanner.nextInt();
		}
		System.out.println("enter the size of the array");
		int size2=scanner.nextInt();
		int[] array2=new int[size2];
		for(int i=0;i<size2;i++)
		{
			System.out.println("Enter the Elements");
			array2[i]=scanner.nextInt();
		}
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		scanner.close();
		boolean found=false;
		for(int i=0;i<array.length;i++)
		{
			if(element==array[i])
			{
				System.out.println("Element find at index : "+i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println(element+" not present in the array :"+Arrays.toString(array));
		}
	}

}
