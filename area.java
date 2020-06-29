  
package com.example;
import java.util.*;

public class Area {

      int len ,  breath;

      public void setDim(int l , int b){

          len = l ;
          breath = b;

      }

      public int getArea(){

          return len * breath;
      }

}

class Ans{

    public static void main(String[] args) {
        int length , breadth;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        breadth = sc.nextInt();
        Area ar = new Area();
        ar.setDim(length , breadth);
        System.out.print("The area of triangle : " + ar.getArea());
    }
}
