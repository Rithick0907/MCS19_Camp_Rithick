package mcs_bootcamp;
import java.util.*;
public class Day11_Totient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        int result=n;
        List<Integer> prime=new ArrayList<>();
        while (n%2==0) 
        { 
            prime.add(2);
            n /= 2; 
        } 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                prime.add(i);
                n /= i; 
            } 
        } 
        if (n > 2) 
            prime.add(n);
        for(int i=1;i<prime.size();i++)
        {
            if(prime.get(i)==prime.get(i-1))
                prime.remove(i);
        }       
        for(int i=0;i<prime.size();i++)
        {
            result=(result*(prime.get(i)-1))/prime.get(i);
        }          
        System.out.println(result); 
    }
}