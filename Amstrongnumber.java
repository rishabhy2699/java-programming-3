package com.example;

import java.util.Scanner;

class ArmStongNum{
    public static void main(String[] args)  {
        int c = 0,a,temp,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println(temp + " is a armstrong number");
        else
            System.out.println(temp + " is Not a armstrong number");
    }
}
