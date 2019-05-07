//Question:Reverse the Given String Using Stack
package mcs_bootcamp;
import java.util.*;
public class Day5_ReverseString_UsingStack {
    public static void main(String[] args) {
     Stack<Character> s=new Stack<>();
     Scanner sc=new Scanner(System.in);
     String str;
     System.out.print("Enter String:");
     str=sc.nextLine();
     int i,len=str.length();
     for(i=0;i<len;i++)
         s.push(str.charAt(i));
     str="";
     for(i=0;i<len;i++)
     str+=s.pop();
        System.out.println("Reverse String:"+str);
    }
}
