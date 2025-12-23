//Search largest element smaller than target
package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class LargestelementSmallerThanTarget {

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
		int small=Integer.MIN_VALUE;
		for (int element2 : array) {
			if(element>element2 && element2>small)
			{
				small=element2;
			}
		}
		 if (small == Integer.MIN_VALUE) {
	            System.out.println("No element smaller than " + element + " is present in the array: " + Arrays.toString(array));
	        } else {
	            System.out.println("Largest element smaller than " + element + " is: " + small);
	        }
		 
//		 int target=55;
//	        Arrays.sort(arr);
//	        System.out.println(Arrays.toString(arr));
//	        boolean b=false;
//	        int largest=Integer.MAX_VALUE;
//	        for(int i=0;i<arr.length-1;i++)
//	        {
//	            if(arr[i]<=target)
//	            {
//	                System.out.println(arr[i]);
//	                largest=arr[i];
//	                b=true;
//	               
//	            }
//	        }
//	        if(!b) System.out.println("not");
//	        else System.out.println(largest);
	}

}
