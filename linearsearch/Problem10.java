//Find the position of a character in a string
package com.linearsearch;


import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the String");
		String string=scanner.nextLine();
		
		System.out.println("enter the character to find in the string ");
		char element=scanner.next().charAt(0);
		scanner.close();
		boolean found=true;
		for(int i=0;i<string.length();i++)
		{
			if(element==string.charAt(i))
			{
				System.out.println("Element find at index : "+i);
				found=false;
				break;
			}
		}
		if(found)
		{
			System.out.println(element+" not present in the string :"+string);
		}
	}

}
