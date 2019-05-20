package mcs_bootcamp;
import java.util.*;
public class Day8_Loop_List {
    static Node head;
    public static void insert(int data)
    {
        Node n=new Node();
        n.data=data;
        n.next=null;
        if(head==null)
        {
            head=n;
        } 
        else
        {
            Node n1=new Node();
            n1=head;
            while(n1.next!=null)
            {
                n1=n1.next;
            }
            n1.next=n;
        }
    }
    public static void main(String[] args) {
        Day8_Loop_List llist=new Day8_Loop_List();  
        llist.insert(20); 
        llist.insert(4); 
        llist.insert(15); 
        llist.insert(10);
        llist.head.next.next.next.next = llist.head; 
        if(llist.detectLoop() )
            System.out.println("Loop Found");
        else
            System.out.println("No Loop Found");
}

    private boolean detectLoop() {
        HashSet<Node> h=new HashSet<>();
        Node n=new Node();
        n=head;
        while(n.next!=null)
        {
            if(h.contains(n))
                return true;
            h.add(n);
            n=n.next;
        }
        return false;
    }
}
