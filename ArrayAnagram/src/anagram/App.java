package anagram;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAnagram anagram= new ArrayAnagram();
		String firstWord,secondWord;
		System.out.println("Enter your first word");
		Scanner scanner =new Scanner(System.in);
		firstWord=scanner.nextLine();
		System.out.println("Enter your second word");
		secondWord=scanner.nextLine();
		
		boolean result=anagram.isAnagram(firstWord, secondWord);
		if (result==true){
			System.out.println("That is anagram");
		}else{
			System.out.println("Not anagram");
			
		}
		anagram.isAlpha(firstWord);
		scanner.close();
	}

}
