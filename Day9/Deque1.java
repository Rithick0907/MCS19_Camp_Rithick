package mcs_bootcamp;
import java.util.*;
public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        Iterator<Integer> it=d.iterator();
        int ch,e,i;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("\n\t\tDeque\n1.Add element in begining\n2.Add element in End\n3.First Element\n4.Last Element\n5.Find Element\n6.Elements in Deque\n7.Size of Deque\n8.Remove First Element\n9.Remove Last Element\n10.Delete Queue\n11.Exit\nEnter Your Choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Element to add first:");
                    e=sc.nextInt();
                    d.addFirst(e);
                    break;
                case 2:
                    System.out.print("Enter Element to add last:");
                    e=sc.nextInt();
                    d.addLast(e);
                    break;
                case 3:
                    System.out.print(d.peekFirst());
                    break;
                case 4:
                    System.out.print(d.peekLast());
                    break;
                case 5:
                    System.out.print("Enter Element to find");
                    i=sc.nextInt();
                    System.out.print(d.contains(i));
                    break;
                case 6:
                    while(it.hasNext())
                        System.out.print(it.next());
                    break;
                case 7:
                    System.out.print(d.size());
                    break;
                case 8:
                    System.out.print(d.pollLast()+" is Remove for Deque");
                    break;
                case 9:
                    System.out.print(d.pollFirst()+" is Remove for Deque");
                    break;
                case 10:
                    d.clear();
                    break;           
            }
        }while(ch<=10);
    }
}