package mcs_bootcamp;
import static java.lang.Math.*;
import java.util.*;
public class Number_Theory1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        int result;
        for(int i=0;i<4;i++)
            a[i]=sc.nextInt();
        result=(int)pow(a[0],a[1]);
        result=result/a[2];
        System.out.println(result%a[3]);
    }
}
