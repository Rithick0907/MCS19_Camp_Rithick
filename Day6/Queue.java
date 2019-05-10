//Question in Bottom
package mcs_bootcamp;
import java.util.*;
public class Queue {
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
/*
Question:
Micro just purchased a queue and wants to perform N operations on the queue. The operations are of following type:

E x : Enqueue x in the queue and print the new size of the queue.
D : Dequeue from the queue and print the element that is deleted and the new size of the queue separated by space. If there is no element in the queue then print 1 in place of deleted element.

Since Micro is new with queue data structure, he need your help.

Input:
First line consists of a single integer denoting N
Each of the following N lines contain one of the operation as described above.

Output:
For each enqueue operation print the new size of the queue. And for each dequeue operation print two integers, deleted element (1, if queue is empty) and the new size of the queue.

Constraints:
1≤N≤100
1≤x≤100

SAMPLE INPUT 
5
E 2
D
D
E 3
D
SAMPLE OUTPUT 
1
2 0
-1 0
1
3 0
*/
