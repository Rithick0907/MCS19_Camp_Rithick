package mcs_bootcamp;
import java.util.*;
public class Infix_to_Postfix {
    int prec(char a)
    {
        switch(a)
        {
            case '+':return 1;
            case '-':return 1;
            case '*':return 2;
            case '/':return 2;
            case '^':return 3;
            default:return 0;
        }
    }
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        Infix_to_Postfix d=new Infix_to_Postfix();
        String str;
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Expression:");
        str=sc.nextLine();
        char[] a=new char[str.length()];
        try
        {
        for(i=0,j=-1;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')  //Check the Given Character is Operand
            {
                a[++j]=str.charAt(i);
            }
            else if(str.charAt(i)=='(')
                s.push(str.charAt(i));
            else if(str.charAt(i)==')')
            {
                while(!s.empty()&&s.peek()!='(')
                    a[++j]=s.pop();
                if(!s.empty()&&s.peek()!='(')
                {    
                    System.out.println("Invalid Expression");
                    break;
                }
                else
                    s.pop();
            }
            else
            {
                while(!s.empty() && d.prec(str.charAt(i))<=d.prec(s.peek()))
                {
                    a[++j]=s.pop();
                }
                s.push(str.charAt(i));
            }
        }
        while(!s.empty())
            a[++j]=s.pop();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }    
}
