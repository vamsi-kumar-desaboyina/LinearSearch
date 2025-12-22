package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

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
		Arrays.sort(array);
		scanner.close();
		boolean found=false;
		int ele=array[0];
		for(int i=0;i<array.length-1;i++)
		{
			ele=ele+1;
			if(ele!=array[i+1])
			{
				System.out.println(ele);
				i--;
				found=true;
			}
		}
		if(!found)
		{
			System.out.println(" no missing number in the array :"+Arrays.toString(array));
		}
	}

}
