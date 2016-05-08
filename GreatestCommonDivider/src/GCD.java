import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int first, second;
		
		System.out.print
		("Enter you frist number\n");
		Scanner scanner= new Scanner(System.in);
		first =scanner.nextInt();
		System.out.print("Enter your second number\n");
        second=scanner.nextInt();
        scanner.close();
        	System.out.println(gcd(first,second));	
        		
	}

	public static String gcd(int first, int second){
		
		//This method takes two positive integers and finds their gcd using
		 int nominator=first;
		 int denominator=second;// accept two integers 
		 		 
		 if (nominator<denominator){// check if nominator is greater than denominator.
			 System.out.println("The first number must be greater than the second number\n");
			System.exit(0);
		 }
		 int remainder=nominator%denominator;
		if (remainder==0){
			
			return "GCD is: "+denominator;
		}else {
			 gcd(denominator,remainder);// use recursive function.
		 }
		return "there is no GCD for the two numbers";
	}
	
}
