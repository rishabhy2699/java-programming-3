import java.util.Scanner;
public class Palindrome {
    private static void checkPalindrome(int num) {
        int a , sum=0 , temp;
        temp = num;
        while (num>0) {
            a = num%10;
            sum = (sum*10) + a;
            num= num/10;
        }
        if(temp==sum) {
            System.out.println("Given number is a Palindrome number: ");
        } else {
            System.out.println("Given number is not a Palindrome number: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int n = sc.nextInt();
        checkPalindrome(n);
    }
}
