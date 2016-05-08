
public class DecimalToBinary {

	public static void main(String[] args) {
		int number1=3;
		decimalToBinary(number1);

	}
	public static void decimalToBinary(int number){
		int binary[]=new int[25];
		int index=0;
		while(number>0){
			binary[index++]=number%2;
			number=number/2;
			
		}
		for (int i=index-1; i>=0;i--){
			System.out.print(binary[i]);
		}
		
	}

}
