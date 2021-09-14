package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String state=" ", county="";
        double amount;
        double total, tax=0.0;

        System.out.print("What is the order amount? ");
        amount=sc.nextDouble();
        sc.nextLine();
        System.out.print("What state do you live in? ");
        state=sc.nextLine();

        total=amount;

        if(state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            county=sc.nextLine();

            if(county.equals("Eau Claire")){
                tax = amount * 0.055;
                total = total+tax;
            }
            else if(county.equals("Dunn")){
                tax = amount * 0.054;
                total = total+tax;
            }
            else{
                tax = amount * 0.05;
                total=total+tax;
            }
        }
        else if(state.equals("Illinois")){
            tax = amount * 0.08;
            total = amount + tax;
        }

        if(state.equals("Wisconsin") || state.equals("Illinois")){
            System.out.printf("The subtotal is $%.2f.\n", amount);
            System.out.printf("The tax is $%.2f.\n", tax);
        }
        System.out.printf("The total is $%.2f.\n", total);


    }
}