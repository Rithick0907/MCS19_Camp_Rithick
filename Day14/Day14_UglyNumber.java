//To Find Ugly Number
package mcs_bootcamp;
import java.util.*;
public class Day14_UglyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=GetUgly(n);
        System.out.println(n);
    }
    public static int div(int n1,int n2)
    {
    while(n1%n2==0)
        n1=n1/n2;
    return n1;
    }
    private static int isUgly(int num) {
        num=div(num,2);
        num=div(num,3);
        num=div(num,5);
        if(num==1)
            return 1;
        else
            return 0;
    }
    private static int GetUgly(int n) {
        int count =1;
        int i=1;
        while(n>count)
        {
            i++;
            if(isUgly(i)==1)
                count++;
        }
        return i;
    }
}