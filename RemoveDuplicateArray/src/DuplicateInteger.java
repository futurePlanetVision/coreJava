import java.util.Arrays;

public class DuplicateInteger {

	public static void main(String[] args) {
		Integer[] input={10,11,12,13,14,14,15,15,16,17,40,60,70,70};
		removeDupilicate(input);
		for(int i=0; i<input.length; i++)
			System.out.println(input[i]);;
	}
public static Integer[] removeDupilicate( Integer[] input){
	
	for (int i=0; i<input.length; i++)
		{ for(int  j=i+1; j<input.length;j++){
			if(input[i]==input[j]){
			input[j]=  null;
				while(j<input.length-1){
					input[j]=input[j+1];
					input[j+1]=null;
					j++;
				}
				
			}}
		//return input;
		}
		
		
return input;
}}

