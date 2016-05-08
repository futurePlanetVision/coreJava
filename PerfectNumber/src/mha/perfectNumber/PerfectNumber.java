package mha.perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner in=new Scanner(System.in);
		int number= in.nextInt();
		isPerfectNumber(number);
	}
public static void isPerfectNumber(int number){
	
	int temp=0;
	for (int i=1; i<=number/2; i++){
		if(number%i==0){
			temp+=i;
		}
			
	}
	if (temp==number)
		System.out.println("The number is perfect");
	else
		System.out.println("The number is NOT Perfect");
	
}
}
