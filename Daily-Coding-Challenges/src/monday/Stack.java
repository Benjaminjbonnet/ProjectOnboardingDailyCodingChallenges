package monday;

import monday.exception.TheStackIsFullException;

public class Stack {
	private int array[];
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	public void push(int item)throws TheStackIsFullException {
		if(top == capacity) {
			throw new TheStackIsFullException("The Stack is Full");
		}else {
			array[++top] = item;
		}
		
		
	}
	public int pop() {
		
		return array[top--];
	}
	public int peek() {
		
		
		return array[top];
	}

	
	public String isEmpty(){
		String isEmpty =null;
		if(top == -1) {
			isEmpty = "The stack is Emplty";
		}else {
			isEmpty = "There is still room left in the stack";
		} return isEmpty;
	}
	public   void print(){
	    for(int i = top;i>-1;i--){
	        System.out.println(" "+ array[i]);
	      }
	    }
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
