package monday;

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
    }
}
