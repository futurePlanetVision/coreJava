import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		String myWord="";
		System.out.println("Enter Your Word");
		Scanner in= new Scanner(System.in);
		myWord=in.nextLine();
		dupilicateChar(myWord);

			in.close();
	}
	public static void dupilicateChar(String input){
		char[] word=input.toCharArray();
		Map<Character,Integer> wordmap=new HashMap<Character,Integer>();
		for(Character ch:word){
			if(wordmap.containsKey(ch)){
				wordmap.put(ch, wordmap.get(ch)+1);
			}
			else wordmap.put(ch, 1);
				
		}
		Set<Character> keys= wordmap.keySet();
		for(Character ch:keys)
			if(wordmap.get(ch)>1)
				System.out.println(ch+"---->"+wordmap.get(ch));
		
	}

}
