package legacy;

import java.util.Stack;

class Sample
{
	static void push(Stack<Integer> st, int num)
	{
		st.push(num);
		System.out.println("added: "+num);
	}
	
	
	static void pop(Stack<Integer> st)
	{
		Integer num = st.pop();
		System.out.println("display: "+num);
	}
}
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Sample.push(st, 10);
		Sample.push(st, 20);
		Sample.push(st, 30);
		Sample.push(st, 40);
		
		Sample.pop(st);
	}
}