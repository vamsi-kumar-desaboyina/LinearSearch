//Find Missing Number (Sequential Array ascending order)
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

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
		boolean found=false;
		for(int i=0;i<array.length-1;i++)
		{
			if((array[i]+1)!=array[i+1])
			{
				System.out.println(array[i]+1);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println(" no missing number in the array :"+Arrays.toString(array));
		}
	}

}
