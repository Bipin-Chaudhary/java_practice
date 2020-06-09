package algorithms;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack<Integer> st = new Stack<>();
		
		st.push(44);
		st.push(30);
		st.push(32);
		st.push(20);
		
		st.pop();
		
		st.peek();
		
		
		System.out.println(st);
		
		
		

	}

}
