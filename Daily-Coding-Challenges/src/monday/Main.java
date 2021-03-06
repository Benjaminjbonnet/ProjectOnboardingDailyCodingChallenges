package monday;

import monday.exception.TheStackIsFullException;

public class Main {

	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
 
        // creating first linked list
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
 
        System.out.println("The node of intersection is " + list.getNode());
        
        
        
        Stack stack = new Stack(3);
        
        try {
			stack.push(5);
		} catch (TheStackIsFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			stack.push(2);
		} catch (TheStackIsFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			stack.push(1);
		} catch (TheStackIsFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      stack.print();
      stack.pop();
      stack.print();
        
      
    
    }
    
    
}
