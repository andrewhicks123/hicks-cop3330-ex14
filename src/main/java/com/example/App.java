/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double tax = 0;
        System.out.print( "What is the order amount? " );
        int order = input.nextInt();
        System.out.print("What is the state? ");
        String state = input.next();
        if(state.equals("WI") == true){
            System.out.println("The subtotal is $" + order);
            tax = order*.055;
            System.out.println("The tax is $" + tax);
        }

        System.out.println("The total is $" + (order+tax));

    }
}
