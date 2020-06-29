  
package com.example;
import java.util.*;

public class Complex {

       double real;
       double img;

       public Complex(double rel , double imge){

           this.real = rel;
           this.img = imge;
       }

       public static void main(String[] args) {
           double r1 , i1 , r2 , i2;
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the first real part: ");
           r1 = sc.nextDouble();
           System.out.print("Enter the first imaginary part: ");
           i1 = sc.nextDouble();
           System.out.print("Enter the second real part: ");
           r2 = sc.nextDouble();
           System.out.print("Enter the second imaginary part: ");
           i2 = sc.nextDouble();
           Complex n1 = new Complex(r1,i1),
                n2 = new Complex(r2, i2),
                temp,
                temp1,
                temp2;

         temp = add(n1, n2);
         temp1 = product(n1 , n2);
         temp2 = difference(n1 , n2);

         System.out.println("Sum :"+" " + temp.real+ "+" + temp.img + "i");
         System.out.println("Pro :"+ " " + temp1.real+ "+" + temp1.img + "i");
         System.out.println("Difference :"+ " " + temp2.real+ "+" + temp2.img + "i");

       }

       public static Complex add(Complex o1 , Complex o2){

              Complex temp = new Complex(0.0 , 0.0);

              temp.real = o1.real + o2.real;
              temp.img = o1.img + o2.img;

              return temp;
       }

       public static Complex product(Complex o1 , Complex o2){

           Complex temp = new Complex(0.0 , 0.0);

           temp.real = (o1.real*o2.real) - (o1.img*o2.img);
           temp.img = (o1.real*o2.img) + (o1.img *o2.real);

           return temp;

       }

       public static Complex difference(Complex o1 , Complex o2){

           Complex temp = new Complex(0.0 , 0.0);

           temp.real = o1.real - o2.real;
           temp.img = o1.img - o2.img;

           return temp;

       }

}
