package com.company;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args)
    {

        int n,i,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();

        for(i=1;i<n;i++)
        {
            if (n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println(n+"is a perfect mumber");
        else
            System.out.println(n+" is a perfect number");


    }


}
