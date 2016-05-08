package mha.reverseNumber;

public class ReverseNumbers {

	public static void main(String[] args) {
		int number= 987654321;
		System.out.println(reverseNumber(number));

	}
public static int reverseNumber(int number){
	int reverse=0;
	while(number!=0){
		reverse=reverse*10+number%10;
		number=number/10;
		
	}
	return reverse;
}
}
