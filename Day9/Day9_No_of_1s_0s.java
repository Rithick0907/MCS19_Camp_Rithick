package mcs_bootcamp;
import java.util.*;
public class Day9_No_of_1s_0s {
    public static void main(String[] args) {
        int count=0,len,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Expression:");
        String eq =sc.nextLine();
        String[] st=eq.split("");
        len=eq.length();
        int[] a=new int[len];
        while(len>0)
        {
            a[i]=Integer.parseInt(st[i]);
            if(a[i]==1)
                count++;
            i++;
            len--;
        }
        System.out.print("No of 1's:"+count+"\nNo of 0's:"+(a.length-count)+"\n");
    }    
}