package anagram;

import java.util.Arrays;

public class ArrayAnagram {
	public boolean isAnagram(String firstWord, String secondWord) {
		if (isAlpha(firstWord)&&isAlpha(secondWord)&&isByte(firstWord)&&isByte(secondWord)){
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	     }else return false;
	}
		
	     

	public boolean isAlpha(String word) {
	    char[] chars = word.toCharArray();

	    for (char c : chars) {
	        if(!Character.isLetter(c)) {
	            return false;
	        }
	    }

	    return true;
	}
	
	public boolean isByte(String word){
		final String word1= word;
		byte[] stringByte=word1.getBytes();
		if (stringByte.length < Math.pow(10, 6)){
		return true;}
		else {
			System.out.println("The size of one string is more than 100MB");
			return false;
		}}
	}


