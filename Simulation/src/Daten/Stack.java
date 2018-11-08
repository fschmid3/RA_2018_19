package Daten;

public class Stack {
	private int stack[] = new int[8];
	private int stackpointer;
	private int numOfElements;
	
	public Stack() {
		this.stackpointer = 0;
		this.numOfElements = 0;
	}
	
	//pushs latest data on Stack
	public void push(int data) {
		
		if(stackpointer < 8) {
			stack[stackpointer]=data;
			stackpointer++;
			if (numOfElements < 8) {
				numOfElements++;
			}
			
		}
		else {
			stackpointer = 0;
			stack[stackpointer]=data;
			stackpointer++;
		}
		
	}
	
	//returns latest data from stack
	public int pop() {
		int data = 0;
		if(stackpointer > 0) {
			
			if (numOfElements > 0) {
				numOfElements--;
			}
			stackpointer--;
			data = stack[stackpointer];
			
			return data;
		}
		else {
			if (numOfElements >0) {
				stackpointer = 7;
				data = stack[stackpointer];
			}
			return 0;
		}
	}
	
	public int getNumOfElements() {
		return numOfElements;
	}
	
	
	public int[] getStack() {
		return stack;
	}
	
	
}
