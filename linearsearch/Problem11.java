//Find first repeating element
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {

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
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(array[i]+"is the first repeating element");
				found=true;
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("no repeating element in the array :"+Arrays.toString(array));
		}
	}

}
