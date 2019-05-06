package mcs_bootcamp;
import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        String S;
        System.out.print("Enter Integer Value: ");
        N=sc.nextInt();
        sc.nextLine();                          //Since After reading int it accept sc.nextLine as new line;
        System.out.print("Enter String:");
        S=sc.nextLine();
        System.out.println("Integer:"+2*N+" "+"String:"+S);
    }
    
}
