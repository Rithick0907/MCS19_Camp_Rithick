package mcs_bootcamp;
import java.util.Arrays;
import java.util.Scanner;
public class Day14_FibSeries {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;    
    System.out.print("Enter N:");
    n=sc.nextInt();
    int[] fib=new int[n+2];       //If n=0 we need two space for initialisation therefore n+2.
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<n;i++)
        fib[i]=fib[i-1]+fib[i-2];
        System.out.println(Arrays.toString(fib));
    }
}
