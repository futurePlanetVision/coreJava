package com.mha.java.interview;

import java.util.Scanner;
class FirstRepeatingChar {

	void firstRepeatingChar(String string){
		 int   found =0;
		char repeatingchar=0;
		int repeatinglength=0;
		
		
		for (int i=0; i<string.length();i++){
			if(found!=1){
			for (int j=i+1;j<string.length(); j++){
				if (string.charAt(i)==string.charAt(j)){
					  repeatingchar= string.charAt(i);
					  repeatinglength = j+1;
					found=1;
					break;
					
					
				}
				
				}}
			
			}
		if (found!=0){
			System.out.println("The repeating char is "+repeatingchar+"---at "+repeatinglength);
		}
		else{
			System.out.println("there is no repeating repeating character");
		}
	}}
 class FirstRepeatingCharInString {
	
	


	public static  void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner scanner =new Scanner(System.in);
      System.out.println("Enter you String for test");
      String string = scanner.next();
      
      FirstRepeatingChar firstRepeatingCharob= new FirstRepeatingChar();
      firstRepeatingCharob.firstRepeatingChar(string);

	}

 }
