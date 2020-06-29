package com.company;
import java.util.Scanner;
class add {
    int temp=0,num,sum=0;
    int digits(int num) {
        temp = num;
        if (num <= 0) {
            return num;
        } else {
            int rem = num % 10;
            sum = sum  + rem;
            return digits(num / 10);
        }
    }
    void displaySum(){
        System.out.println(sum);
    }
    public static void main(String [] args){
        add a1=new add();
        System.out.println("Enter the number to get sum of digits");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
        a1.digits(a);
        a1.displaySum();
    }
}
