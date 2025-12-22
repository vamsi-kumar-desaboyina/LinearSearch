//Find smallest/largest element using linear search
//Find the maximum and minimum element
package com.linearsearch;


import java.util.Scanner;

public class MinAndMax {

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

		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int element : array) {
			if(element>max)
			{
				max=element;
			}
			if(element<min)
			{
				min=element;
			}
		}
		System.out.println("max element is: "+max);
		System.out.println("min element is: "+min);
		scanner.close();
	}

}
