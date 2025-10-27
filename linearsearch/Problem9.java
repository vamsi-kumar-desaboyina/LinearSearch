//Search a target in a range [L, R] in array
package com.linearsearch;


import java.util.Scanner;

public class Problem9 {

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
		System.out.println("enter the starting index ");
		int start=scanner.nextInt(); //index
		System.out.println("enter the ending index ");
		int end=scanner.nextInt();
		scanner.close();
		boolean isexcedded=false;
		if (start < 0 || end >= array.length || start > end) {
		    System.out.println("Check start and ending index of the array");
		    isexcedded = true;
		}
		boolean found=true;
		if(!isexcedded)
		{
			for(int i=start;i<=end;i++)
			{
				if(element==array[i])
				{
					System.out.println("Element find at index : "+i);
					found=false;
					break;
				}
			}
		}
		
		if(found)
		{
			System.out.println(element+" not  in the range of the array :"+start+" "+end);
		}
	}

}
