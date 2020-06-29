package com.company;

import java.util.Scanner;

class pattern{
    int n1;
    int n2;
    int check(int n, int k){

        if(n-k<=0){
        n2=n-k;
        return n2;
    }
        else{
            n=n-k;
            return check(n,k);

        }
    }
    int print1st(int n,int k){
        if(n<=0 )
        {

            return n;
        }
        else {
            System.out.print(n+",");
            return print1st(n-k,k);
        }
    }
    int print2nd(int n,int k){
        if(n==n1){
            System.out.print(n+",");
            return n;
        }
        else{
            System.out.print(n+",");
            return print2nd(n+k,k);
        }
    }
    public static void main(String[] args){
        pattern s1=new pattern();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        int num=s1.check(n,k);
        s1.n1=n;

        s1.print1st(n,k);
        s1.print2nd(num,k);

    }
}
