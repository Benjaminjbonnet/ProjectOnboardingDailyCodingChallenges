package monday;

public class Stack {
	private int array[];
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	public void push(int item) {
		
		
		array[++top] = item;
	}
	public int pop() {
		
		return array[top--];
	}
	public int peek() {
		
		
		return array[top];
	}
	public String isFull() {
		String isFull = null;
		if(top == capacity) {
			isFull = "The stack is full";
		}else {
			isFull = "The stack is not full";
		}return isFull;
	}
	
	public String isEmpty(){
		String isEmpty =null;
		if(top == -1) {
			isEmpty = "The stack is Emplty";
		}else {
			isEmpty = "There is still room left in the stack";
		} return isEmpty;
	}
}
