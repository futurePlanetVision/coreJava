
public class ReverseString {

	String reverse="";
	
	public String reverseStringRecursive(String str){
		
		if(str.length()==1){
			return str;
		}
		else {
			reverse=reverse+str.charAt(str.length()-1)+reverseStringRecursive(str.substring(0, str.length()-1));
		}
	return reverse;
			}
	
	
}
