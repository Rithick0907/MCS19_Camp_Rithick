package mcs_bootcamp;
import java.util.*;
public class Day6_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char[] ques=new char[n];
        String[] ans=new String[n];
        for(i=0;i<n;i++)
        {
            ques[i]=sc.next().charAt(0);
            if(ques[i]=='E')
            {
                j=sc.nextInt();
                q.add(j);
                ans[i]=Integer.toString(q.size());                        
            }
            else if(ques[i]=='D')
            {
                if(q.size()==0)
                ans[i]="-1"+" "+q.size();
                else
                    ans[i]=q.remove()+" "+q.size();
            }
        }
        System.out.println("OUTPUT:");
        for(i=0;i<n;i++)
            System.out.println(ans[i]);
    }
}