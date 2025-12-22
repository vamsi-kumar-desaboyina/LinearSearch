//Linear search for closest match (e.g., nearest number to X).
package com.linearsearch;

import java.util.Scanner;

public class NearestNumbertoTarget {

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
		System.out.println("enter the target element ");
		int element=scanner.nextInt();
		scanner.close();
		int small=Integer.MAX_VALUE;
		for (int element2 : array) {
			if(element2>element && element2<small)
			{
				small=element2;
			}
		}
		int greatest=Integer.MIN_VALUE;
		for (int element2 : array) {
			if(element>element2 && element2>greatest)
			{
				greatest=element2;
			}
		}
		int res1=Math.abs(element-small);
		int res2=Math.abs(element-greatest);
		if(res1==res2)
		{
			System.out.println(greatest);
		}
		else if(res1<res2)
		{
			System.out.println(small);
		}
		else
		{
			System.out.println(greatest);
		}
	}

}
