package mcs_bootcamp;
import java.util.*;
public class Day15_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n,p,q,sum=0;
        System.out.print("Enter rows & column of first matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] first=new int[m][n];
        System.out.println("Enter matrix element");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter rows & column of Second matrix:");
        p=sc.nextInt();
        q=sc.nextInt();
        if(m!=q)
        {
            System.out.println("The Given matrix is wrong they can't be multiplied");
        }
        else
        {
        int[][] second=new int[p][q];
        int[][] answer=new int[m][n];
        System.out.println("Enter matrix element");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    second[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    for(k=0;k<p;k++)
                    {
                        sum=sum+first[i][k]*second[k][j];
                    }
                    answer[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println("RESULT:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(answer[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}