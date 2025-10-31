//Find Common Elements Between Two Arrays
package com.linearsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements2Arrays {

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
		scanner.close();
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++)
		{
			if(!arrayList1.contains(array1[i]))
			{
				arrayList1.add(array1[i]);
			}
		}
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		for(int i=0;i<array2.length;i++)
		{
			if(!arrayList2.contains(array2[i]))
			{
				arrayList2.add(array2[i]);
			}
		}
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(Integer ele:arrayList1)
		{
			for(Integer ele1:arrayList2)
			{
				if(ele==ele1)
				{
					result.add(ele);
					break;
				}
			}
		}
		System.out.println(result);
			
	}

}
