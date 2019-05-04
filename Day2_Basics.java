package mcs_bootcamp;
import java.util.Scanner;
public class Day2_Basics {
    public static void main(String[] args) {
        int i,j;
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<10;j++)
            {
               a[j]=(Character.getNumericValue(s.charAt(i))==j)?a[j]+1:a[j];                 //a[j]++ doesn't work
            }
        }
        for(j=0;j<10;j++)
            System.out.println(j+" "+a[j]);
    }
}