package mcs_bootcamp;
import java.util.*;
public class QuickSort {
    public static int[] array;
    static int n;
    public void Quick(int low,int high)
    {
     if (low<high) 
        { 
            int i=partition(low,high);
            Quick(low,i-1); 
            Quick(i+1,high); 
        }
    }
    public int partition(int low,int high)
    {
        int temp;
        int pivot=array[high];  
        int i=(low-1);
        for(int j=low;j<high;j++) 
        { 
            if (array[j]<=pivot) 
            { 
                i++;  
                temp=array[i]; 
                array[i]=array[j]; 
                array[j]=temp; 
            }
        } 
        temp=array[i+1]; 
        array[i+1]=array[high]; 
        array[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        QuickSort quick=new QuickSort();
        System.out.print("Enter N:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        quick.Quick(0,n-1);
        System.out.println(Arrays.toString(array));
    }
}
