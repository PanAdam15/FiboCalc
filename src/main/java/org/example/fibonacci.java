package org.example;
import java.util.Scanner;

public class fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args)
    {
        System.out.println("Input Value");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Fibonacci number of index: " + n + " is: " + fib(n));
        System.out.println("FiboCalc\nAdam Pankowski\n1.3");
    }
}