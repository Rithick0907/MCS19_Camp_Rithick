//Find the final Index of given Number in Array
package mcs_bootcamp;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int n,j,m,i=-1;
        System.out.print("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Enter element to find:");
        m=sc.nextInt();
        int[] a=new int [n];
        System.out.println("Enter Array Elements:");
        for(j=0;j<n;j++)
            a[j]=sc.nextInt();
        for(j=0;j<n;j++)
        {
            if(a[j]==m)
                i=j;
        }
        System.out.print("Index of "+m+" is "+i);
    }   
}
