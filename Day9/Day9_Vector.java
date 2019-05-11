package mcs_bootcamp;
import java.util.*;
public class Day9_Vector {
    static Vector v=new Vector();
    public static void main(String[] args) {
        int ch,e,i;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("\n\t\tVector\n1.Add Element\n2.Add element in Specified Location\n3.Fix Capacity\n4.Find Capacity\n5.Trim Vector\n6.Empty\n7.Vector Contain\n8.Elements in List\n9.Remove from specified index\n10.Delete Vector\n11.Exit\n\nEnter your Choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter Element to add:");
                e=sc.nextInt();
                v.add(e);
                break;
            case 2:
                System.out.print("Enter Element:");
                e=sc.nextInt();
                System.out.print("Enter Index:");
                i=sc.nextInt();
                v.add(i,e);
                break;
            case 3:
                System.out.print("Enter Capacity:");
                e=sc.nextInt();
                v.ensureCapacity(e);
                break;
            case 4:
                System.out.print(v.capacity());
                break;
            case 5:
                v.trimToSize();
                break;
            case 6:
                System.out.print(v.isEmpty());
                break;
            case 7:
                System.out.print("Enter Element to Find:");
                e=sc.nextInt();
                System.out.print(v.contains(e));
                break;
            case 8:
                System.out.print(v.toString());
                break;
            case 9:
                System.out.print("Enter Element position to remove:");
                e=sc.nextInt();
                v.remove(e);
                break;
            case 10:
                v.clear();
                break;
        }
        }while(ch<=10);
    }
}
