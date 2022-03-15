package Monday;

import java.util.ArrayList;

public class LinkedList {
    public Node head;

public void add(Node node){
    if(head==null) {
        head = node;
    }else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
}
    public Node get(int i){
    if(head == null){
        return null;
    }else {
        Node current = head;
        int counter =-1;
        while(counter<i){
            if(current.next==null){
                break;
            }else{
                current = current.next;
            }
            counter++;
        }
        if(counter!= i-1){
            return null;
        }
        return current;
    }
    }
}
