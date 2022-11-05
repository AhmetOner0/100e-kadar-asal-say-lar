package patikadev;

import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("enter a number:");
        n = in.nextInt();
        if (n == 2) {
            System.out.println(n + " is a prime number");
        }
        if (n > 0 && n < 100) {
            for (int i = 2; i < n; i++) {
                if (n % i != 0) {
                    System.out.println(n + " is a prime number");
                    break;
                } else {
                    System.out.println(n + " is not a prime number!");
                    break;
                }
            }
            {

            }
        } else {
            System.out.println("in valid number!!");
        }
    }
}
