package mcs_bootcamp;
import java.util.*;
public class Binary_Sort {
    public static void main(String[] args) {
     int n,i,j,temp;
     System.out.print("Enter n:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
    System.out.print("Enter "+n+" Elememts:");
     int[] a=new int[n];
     for(i=0;i<n;i++)
     {
      a[i]=sc.nextInt();
     }
     for(i=0;i<n;i++)
     {
         for(j=i+1;j<n;j++)
         {
             if(a[i]>a[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
        System.out.print("Sorted Elements");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }    
}
