package mcs_bootcamp;
import java.util.*;
import static java.util.Arrays.spliterator;
public class Day9_Set {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        int ch,e,i;
        Scanner sc=new Scanner(System.in);      
        do{
        System.out.print("\n\t\tVector\n1.Add Element\n2.Empty\n3.Check the Element in Set.\n4.Elements in Set\n5.Size of Set\n6.Remove Element\n7.Delete Set\n8.Exit\n\nEnter your Choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter Element to add:");
                e=sc.nextInt();
                s.add(e);
                break;
            case 2:
                System.out.print(s.isEmpty());
                break;
            case 3:
                System.out.print("Enter Element to Find:");
                e=sc.nextInt();
                System.out.print(s.contains(e));
                break;
            case 4:
                System.out.print(s.toString());
                break;
            case 5:
                System.out.print(s.size());
                break;
            case 6:
                System.out.print("Enter Element to remove:");
                e=sc.nextInt();
                s.remove(e);
                break;
            case 7:
                s.clear();
                break;
        }
        }while(ch<=7);
    }
}
