import java.util.Random;
import java.util.Stack;

public class SortingStack {

public static void main(String[] args) {
		Stack<Integer> stack= new Stack();
		System.out.println("Sorted values of stack  are: ");


			stack.push(30);
			stack.push(10);
			stack.push(9);
			stack.push(6);
			stack.push(12);
			stack.push(55);
			stack.push(65);
			Stack sortedStack= new Stack();
			System.out.println( stackSotring(stack));
		
			
}
public static  Stack<Integer> stackSotring(Stack<Integer> st){

	
	// take first element and compares with temp value top value
	Stack<Integer> stemp= new Stack<Integer>();
	while(!st.isEmpty()){
		int temp=(int) st.pop();	
	while(!stemp.isEmpty() && stemp.peek()>temp){
		st.push(stemp.pop());
		
						}
			stemp.push(temp);
		}
	
	return stemp;
}

}
