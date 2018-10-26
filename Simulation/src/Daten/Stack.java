package Daten;

public class Stack {
	private int stack[] = new int[256];
	private int stackpointer = 0;
	
	//pushs latest data on Stack
	public void push(int data) {
		stack[stackpointer]=data;
		if(stackpointer < 255) {
			stackpointer++;
		}
		
	}
	
	//returns latest data from stack
	public int pop() {
		if(stackpointer>0) {
			stackpointer--;
		}
		return stack[stackpointer+1];
	}
	
	
	
	
}
