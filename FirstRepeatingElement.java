//Find first repeating element
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstRepeatingElement {

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
		for (int element : array) {
			int count=0;
			for (int element2 : array) {
				if(element==element2)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(element+"is the first repeating element");
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
