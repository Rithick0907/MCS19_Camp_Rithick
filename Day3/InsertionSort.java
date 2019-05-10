package mcs_bootcamp;
import java.util.*;
public class InsertionSort {
    public static int[] array;
    static int n;
    public void Insertion()
    {
     for( int i=0;i<n;i++) 
     {
      int temp = array[i];    
      int j=i;

       while(j>0&&array[j-1]>temp) 
       {
                array[j] = array[j-1];   
                j=j-1;
       }
           array[j] = temp;    
     } 
    }
    public static void main(String[] args) {
        InsertionSort insert=new InsertionSort();
        System.out.print("Enter N:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        insert.Insertion();
        System.out.println(Arrays.toString(array));
    }
}
