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
		ArrayList<Integer> arrayList1=new ArrayList<>();
		for (int element : array1) {
			if(!arrayList1.contains(element))
			{
				arrayList1.add(element);
			}
		}
		ArrayList<Integer> arrayList2=new ArrayList<>();
		for (int element : array2) {
			if(!arrayList2.contains(element))
			{
				arrayList2.add(element);
			}
		}
		ArrayList<Integer> result=new ArrayList<>();
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
