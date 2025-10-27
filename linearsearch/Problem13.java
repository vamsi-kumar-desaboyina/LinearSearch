//  Linear search with multiple constraints (e.g., even numbers only).
//	Search only among even or odd numbers.
//	Search only among positive numbers.
//	Search only among numbers greater than a given value.
//	Search for a value only in elements divisible by 5.
//	Search for a specific name only among students whose marks > 80.

package com.linearsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13 {

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
		System.out.println("enter the value: ");
		int value=scanner.nextInt();
		System.out.println("enter the marks: ");
		int marks=scanner.nextInt();
		ArrayList<Integer> even =new ArrayList<Integer>();
		ArrayList<Integer> odd =new ArrayList<Integer>();
		ArrayList<Integer> positiveNumbers =new ArrayList<Integer>();
		ArrayList<Integer> greaterthanValue =new ArrayList<Integer>();
		ArrayList<Integer> divisibleByFive =new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				even.add(array[i]);
			}
			else
			{
				odd.add(array[i]);
			}
			if(array[i]>0)
			{
				positiveNumbers.add(array[i]);
			}
			if(array[i]>value)
			{
				greaterthanValue.add(array[i]);
			}
			if(array[i]%5==0)
			{
				divisibleByFive.add(array[i]);
			}
		}
		List<Student> allStudents=new ArrayList<Student>();
		Student student1=new Student(1,"vamsi",44.0);
		Student student2=new Student(2,"kumar",94.0);
		Student student3=new Student(3,"desaboyina",98.0);
		Student student4=new Student(4,"lalith",91.5);
		allStudents.add(student1);
		allStudents.add(student2);
		allStudents.add(student3);
		allStudents.add(student4);
		
		System.out.println(even);
		System.out.println(odd);
		System.out.println(positiveNumbers);
		System.out.println(greaterthanValue);
		System.out.println(divisibleByFive);
		for(Student student:allStudents)
		{
			if(student.getMarks()>=marks)
			{
				System.out.println(student);
			}
		}
		scanner.close();
	}

}
