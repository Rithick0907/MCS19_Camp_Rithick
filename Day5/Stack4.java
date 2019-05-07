//Question in bottom
package mcs_bootcamp;
import java.util.*;
public class Stack4 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int n,i,j,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Task:");
        n=sc.nextInt();
        int[] q=new int[n];
        int[] p=new int[n];
        for(i=0;i<n;i++)
        {
            q[i]=sc.nextInt();
            if(q[i]==1)
            {
                j=sc.nextInt();
                s.push(j);
            }
            else if(q[i]==2)
            {
                p[k]=s.pop();
                k++;
            }
        }
        System.out.println("OUTPUT:");
        if(k==0)
        {
            System.out.println("-1");
        }
        else
        {
            for(i=0;i<k;i++)
                System.out.print(p[i]+" ");
        }
    }
}
/*
Input Format:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types:
(i) 1 x   (a query of this type means  pushing 'x' into the stack)
(ii) 2     (a query of this type means to pop element from stack and print the poped element)
The second line of each test case contains Q queries seperated by space.

Output Format:
The output for each test case will  be space separated integers having -1 if the stack is empty else the element poped out from the stack .

Your Task:
You are required to complete two methods push which take one argument an integer 'x' to be pushed into the stack  and pop which returns a integer poped out from the stack.

Constraints:
1 <= T <= 100
1 <= Q <= 100
1 <= x <= 100

Example:
Input:
1
5
1 2 1 3 2 1 4 2  

Output:
3 4

Explanation:
In the first test case for query 
1 2    the stack will be {2}
1 3    the stack will be {2 3}
2       poped element will be 3 the stack will be {2}
1 4    the stack will be {2 4}
2       poped element will be 4
*/
