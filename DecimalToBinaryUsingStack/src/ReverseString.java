import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner in= new Scanner(System.in);
		int number=in.nextInt();
		System.out.println(DecimalToBinary(number));
		in.close();
	}

	
	public static String DecimalToBinary(int number){
		
		 StringBuilder sb= new StringBuilder();
		 Stack<Object>  st= new Stack<Object>();
		 while(number>0){
			 st.push(number%2);
			 number=number/2;
			 
		 }
		 while(!st.isEmpty())
		 sb.append(st.pop());
		 
		
	return sb.toString();
	}
}
