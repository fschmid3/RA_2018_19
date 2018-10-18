package Daten;

public class Stack {
	private int stack[] = new int[256];
	private int stackpointer = 0;
	
	public void push(int data) {
		stack[stackpointer]=data;
		if(stackpointer < 255) {
			stackpointer++;
		}
		
	}
	
	public int pop() {
		if(stackpointer>0) {
			stackpointer--;
		}
		return stack[stackpointer+1];
	}
	
	
	
	
}
