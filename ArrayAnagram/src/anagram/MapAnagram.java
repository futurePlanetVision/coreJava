package anagram;

import java.util.HashMap;
import java.util.Map;

public class MapAnagram {
	public boolean isAnagram(String firstWord, String secondWord) {
		  if (firstWord == null || secondWord == null) {
		    return false;
		  } else if (firstWord.length() != secondWord.length()) {
		    return false;
		  }

		  Map<Character, Integer> occurrencesMap = new HashMap<Character,Integer>();

		  for(int i = 0; i < firstWord.length(); i++){
		    char charFromLeft = firstWord.charAt(i);
		    int nrOfCharsInLeft = occurrencesMap.containsKey(charFromLeft) ? occurrencesMap.get(charFromLeft) : 0;
		    occurrencesMap.put(charFromLeft, ++nrOfCharsInLeft);
		    char charFromRight = secondWord.charAt(i);
		    int nrOfCharsInRight = occurrencesMap.containsKey(charFromRight) ? occurrencesMap.get(charFromRight) : 0;
		    occurrencesMap.put(charFromRight, --nrOfCharsInRight);
		  }

		  for(int occurrencesNr : occurrencesMap.values()){
		    if(occurrencesNr != 0){
		      return false;
		    }
		  }

		  return true;
		}
}
