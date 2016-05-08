package com.mha;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> numbers= new ArrayList<Integer>();
		for (int i=1; i<50;i++){// initialize array with list of numbers
			numbers.add(i);
		}
			//add duplicate number for checking
		numbers.add(9);
		Duplicatenumber dpn=new Duplicatenumber();
		System.out.println("Duplicate Number is :"+dpn.findDubplicate(numbers));
		
	}

}
