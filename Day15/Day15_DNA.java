package mcs_bootcamp;
import java.util.*;
public class Day15_DNA {
    public static void main(String[] args) {
        String[] DNA={"ATTAATTA", "TAGCTAGC", "CGCGATAT","TAATATGC", "ATCGTACG", "CGTAGCAT"};
        Day15_DNA a=new Day15_DNA();
        int n;
        System.out.print("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a.DNASequence(DNA,n);
    }

    private static void DNASequence(String[] DNA,int n) {
        for(int i=0;i<n;i++)
        {
            int x=i%6;
            if (x % 2 == 0) 
            printUpper(DNA[x]); 
        else
            printLower(DNA[x]); 
    }
}

    private static void printLower(String down) { 
    char first, second; 
    int position = 0; 
    for (int i = 1; i <= 4; i++) { 
        first = down.charAt(position); 
        second = down.charAt(position+1); 
        position += 2;            
        for (int j = 1; j < i; j++) 
            System.out.print(" "); 
        System.out.print(first); 
        for (int j = 4 - i; j >= 1; j--) 
            System.out.print("--"); 
        System.out.println(second); 
    } 
    }
    private static void printUpper(String up) { 
    char first, second; 
    int position = 0; 
    for (int i = 1; i <= 4; i++) {
        first = up.charAt(position); 
        second = up.charAt(position+1); 
        position += 2; 
        for (int j = 4 - i; j >= 1; j--) 
            System.out.print(" "); 
        System.out.print(first); 
        for (int j = 1; j < i; j++) 
            System.out.print("--"); 
        System.out.println(second); 
    } 
    }
    }
