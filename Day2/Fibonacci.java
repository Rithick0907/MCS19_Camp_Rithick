package mcs_bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f1=1,f2=2,sum=0;
        while(f1<4000000||f2<4000000)
        {
            if(f1<4000000&&f2<4000000)
            {
            if(f1%2==0)
            {
                sum+=f1;
            }
            if(f2%2==0)
            {
                sum+=f2;
            }
            f1=f1+f2;
            f2=f1+f2;
            }
        }
        System.out.println(sum);
    }
}
