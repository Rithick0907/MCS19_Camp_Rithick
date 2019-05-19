package mcs_bootcamp;
import java.util.*;
public class Day11_Prime_Number {
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i,j,temp=0,k=0;
        for(i=1;i<N;i++)
        {
            for(j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    temp++;
                }
            }
            if(temp==1)
            {
                k++;
            }
            temp=0;
        }
        System.out.println(k);
    }
}