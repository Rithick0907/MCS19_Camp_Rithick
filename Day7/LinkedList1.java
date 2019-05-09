//Linked List Operation
package mcs_bootcamp;
import java.util.*;
public class LinkedList1 {
    public static LinkedList<Integer> list=new LinkedList<>();
    public void insertnode(int e)
    {
        list.add(e);
    }
    public void delnode()
    {
        list.remove();
    }
    public void delnode_pos(int pos)
    {
        list.remove(pos);
    }
    public void deletelist()
    {
        list.clear();
    }
    public int length()
    {
        return list.size();
    }
    public boolean search(int e)
    {
        if(list.indexOf(e)!=-1)
            return true;
        else
            return false;
    }
    public int getNth(int e)
    {
        return list.get(e);
    }
    public static void main(String[] args) {
        LinkedList1 d=new LinkedList1();
        Scanner sc=new Scanner(System.in);
        int e,ch;
        do
        {
            System.out.print("\n1.Insert a Node\n2.Delete a Node\n3.Delete Node from specified Position\n4.Delete List\n5.Length of the List\n6.Search element\n7.nth node of the List\n8.List Elements\n9.Exit");
            System.out.print("\nEnter your Choice:");
            ch=sc.nextInt();
        switch(ch)
                {
                case 1:
                    System.out.print("Enter the Element to insert:");
                    e=sc.nextInt();
                    d.insertnode(e);
                    break;
                case 2:
                    d.delnode();
                    break;
                case 3:
                    System.out.print("Enter the position of element to delete:");
                    e=sc.nextInt();
                    d.delnode_pos(e);
                    break;
                case 4:
                    d.deletelist();
                    break;
                case 5:
                    System.out.println(d.length());
                    break;
                case 6:
                    System.out.print("Enter the Element to Search:");
                    e=sc.nextInt();
                    System.out.print(d.search(e));
                    break;
                case 7:
                    System.out.print("Enter the index to get Element:");
                    e=sc.nextInt();
                    System.out.print(d.getNth(e));
                    break;
                case 8:
                    System.out.print(list);
                }
        }while(ch>=1&&ch<9);
    }
}
