package UserInterface;

import java.util.Arrays;

import Daten.Stack;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack1 = new Stack();
		
		stack1.push(1);
		stack1.push(1);
		stack1.push(1);
		stack1.push(1);
		stack1.push(1);
		stack1.push(1);
		stack1.push(1);
		stack1.push(1); //8 mal
		stack1.push(2);
		
		int i;
		i = stack1.pop();
		i = stack1.pop();
		i = stack1.pop();
		
		stack1.push(3);
		System.out.println(Arrays.toString(stack1.getStack()));

	}

}
