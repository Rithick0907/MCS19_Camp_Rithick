package mcs_bootcamp;
import java.util.*;
public class Day4_MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Day4_MergeSort d=new Day4_MergeSort();
        d.mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    private static void mergesort(int[] arr, int low, int high) {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            
            merge(arr,low,mid,high);
        }        
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[low+i];
        for(int i=0;i<n2;i++)
            right[i]=arr[mid+1+i];
        int i=0,j=0; 
        int k = low; 
        while (i<n1&&j<n2) 
        { 
            if(left[i]<=right[j]) 
            { 
                arr[k]=left[i]; 
                i++; 
            } 
            else
            { 
                arr[k]=right[j]; 
                j++; 
            } 
            k++; 
        }
        while (i<n1) 
        { 
            arr[k]=left[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k]=right[j]; 
            j++; 
            k++; 
        } 
    }
}
