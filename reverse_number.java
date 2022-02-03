package com.company;
import java.util.Scanner;

public class reverse_number {

    public static void main(String[] args) {
        int n, reverse = 0 , reminder=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = sc.nextInt();

        while(n!=0)
        {
            reminder = n%10;
            reverse = reverse*10 + reminder;
            n=n/10;

        }
        System.out.print("Revese number is"+reverse);
    }
}
