package mcs_bootcamp;
import java.util.*;
public class BinarySearch {
    static int n,i;
    static int[] a;
    private static int binsrch(int low, int high, int key) {
       int mid;
        while(low<=high)
       {
           mid=(low+high)/2;
           if(a[mid]<key)
               low=mid+1;
           else if(a[mid]>key)
               high=mid-1;
           else
               return mid;
       }
        return -1;
    }
    public static void main(String[] args) 
    {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("Enter Array Elements:");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);                             //To Sort An Array
        System.out.print("Enter Number of Queries:");
        m=sc.nextInt();
        int[] q=new int[m];
        int[] ans=new int[m];
        System.out.println("Enter Queries");
        for(i=0;i<m;i++)
        {
            q[i]=sc.nextInt();
            ans[i]=binsrch(0,(n-1),q[i]);
        }
        System.out.println("RESULT RANK:");
        for(i=0;i<m;i++)
        {
            if(ans[i]!=-1)
            System.out.println(q[i]+":"+(ans[i]+1));
            else
            System.out.println(q[i]+":"+ans[i]);
        }
    }
}
