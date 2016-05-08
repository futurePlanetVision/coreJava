package com.mha;

import java.util.List;

public class Duplicatenumber {

	
	public int findDubplicate(List<Integer> numbers){
		int hieghestNumber=numbers.size()-1;
		int total=getSum(numbers);
		int duplicate=total-(hieghestNumber*(hieghestNumber+1)/2);
		
		
		
	return duplicate;	
	}
	

	public int getSum(List<Integer> numbers){
		int sum=0;
		for(Integer num:numbers){
			sum=sum+num;
		}
	
	
	
	return sum;
	}
}
