//Search in a Linked List (using linear traversal)
package com.linearsearch;

import java.util.LinkedList;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(121);
		linkedList.add(122);
		linkedList.add(132);
		linkedList.add(113);
		int element=12233;
		boolean found=false;
		for(Integer ele:linkedList)
		{
			if(element==ele)
			{
				System.out.println("element found in the list");
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("element not found in the list");
		}
	}

}
