package mcs_bootcamp;
import java.util.*;
public class Day9_List {
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int ch,e,i;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("\n\t\tList\n1.Add Element\n2.Add element in Specified Location\n3.Get Element in specified position\n4.Find Size of the List\n5.Find Index of the Element\n6.Empty\n7.List Contain\n8.Elements in List\n9.Remove from specified index\n10.Delete List\n11.Exit\n\nEnter your Choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter Element to add:");
                e=sc.nextInt();
                list.add(e);
                break;
            case 2:
                System.out.print("Enter Element:");
                e=sc.nextInt();
                System.out.print("Enter Index:");
                i=sc.nextInt();
                list.add(i,e);
                break;
            case 3:
                System.out.print("Enter Index:");
                i=sc.nextInt();
                System.out.print(list.get(i));
                break;
            case 4:
                System.out.print(list.size());
                break;
            case 5:
                System.out.print("Enter Element to find Index:");
                i=sc.nextInt();
                System.out.println(list.indexOf(i));
                break;
            case 6:
                System.out.print(list.isEmpty());
                break;
            case 7:
                System.out.print("Enter Element to Find:");
                e=sc.nextInt();
                System.out.print(list.contains(e));
                break;
            case 8:
                System.out.print(list.toString());
                break;
            case 9:
                System.out.print("Enter Element position to remove:");
                e=sc.nextInt();
                list.remove(e);
                break;
            case 10:
                list.clear();
                break;
        }
        }while(ch<=10);
    }
}