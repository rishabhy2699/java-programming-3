package com.company;
import java.util.Scanner;
class sequence{
int n1;
    int print1st(int n){
        if(n==0 )
        {
            System.out.print(n+" ");
            return n;
        }
        else {
            System.out.print(n+" ");
            return print1st(n-1);
        }
    }
    int print2nd(int n){
        if(n==n1){
            System.out.print(n+" ");
            return n;
        }
        else{
            System.out.print(n+" ");
            return print2nd(n+1);
        }
    }
 public static void main(String[] args){
        sequence s1=new sequence();
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the no. to get the sequence");
     int n=sc.nextInt();
     s1.n1=n;
        s1.print1st(n);
        s1.print2nd(1);
 }
}
