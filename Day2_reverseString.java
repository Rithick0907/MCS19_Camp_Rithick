/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcs_bootcamp;

import java.util.Scanner;

public class Day2_reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++)
            A[i]=sc.nextInt();
        for(int i=N-1;i>=0;i--)
            System.out.print(A[i]+" ");
    }
    
}
