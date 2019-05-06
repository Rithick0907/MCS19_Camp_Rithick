//Transpose the given array by row=column & column=row;
package mcs_bootcamp;
import java.util.*;
public class Array_Transpose {
    public static void main(String[] args) {
     int n,m,i,j;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Row And Column of the Array:");        
     m=sc.nextInt();
     n=sc.nextInt();
     int[][] arr=new int[m][n];
     int[][] arr1=new int[n][m];
        System.out.println("Enter Array Elements:");
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
     for(i=0;i<n;i++)
     {
         for(j=0;j<m;j++)
         {
             arr1[i][j]=arr[j][i];
         }
     }
        System.out.println("Array After Transpose:");
     for(i=0;i<n;i++)
     {
         for(j=0;j<m;j++)
         {
             System.out.print(arr1[i][j]+" ");
         }
         System.out.println();
     }
   }    
}
