/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SwitchDemo {
    
    static Scanner in = new Scanner(System.in);
    private static float balance = 0.0F;
    private static float amount = 0.0F;
    
    static {
         System.out.println("-----------------------------");
         System.out.println("Welcome to our hospital");
         System.out.println("----------------------------------");
    }
    
    public static void main(String[] args) {
        
        String message = "Enter 1 to Deposit\n Enter 2 to Withdraw\n Enter 3 to check balance\n Enter 4 to Recharge\n Enter 5 to quit";
        
         int input;

         do{
            System.out.println(message);     
            //collect the user input
             input = in.nextInt();
            switch(input){
            case 1:
                System.out.println("Enter the amount you want to deposit");
                amount = in.nextFloat();
                deposit(amount);
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw");
                amount = in.nextFloat();
                withdraw(amount);
                break;
            case 3:
                System.out.println("Your balance is " + checkBalance());
                break;
            case 4:
                System.out.println("Enter the amount you want to recharge");
                int value = in.nextInt();
                recharge(value);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Value is invalid");
                break;
            }
       }
       while(input != 5);
            
        
   } 
    public static void deposit(float amount){
         balance = balance + amount;
         System.out.println( amount + " was successfully added to your account ");
    }
    
    public static void withdraw(float amount){
        if(balance > amount){
           balance = balance - amount;
           System.out.println(" You withdraw " + amount + " your new balance is " + balance);
        }
        else
            System.out.println("You don't have a succffient fund");
    
    }
    
    public static float checkBalance(){
        return balance;
    }
    
    public static void recharge(int amount){
        System.out.println("Enter 1 for Glo\n Enter 2 for Etisalat\n Enter 3 for Mtn");
        int userInput = in.nextInt();
        switch(userInput){
            case 1:
                if(checkBalance() > amount){
                    System.out.println(amount + " is successfully recharged for glo");
                    balance = balance - amount;
                }
                else{
                    System.out.println("YOu do not have suffient fund.");
                }
                break;
            case 2:
                if(checkBalance() > amount){
                    System.out.println(amount + " is successfully recharged for etisalat");
                    balance = balance - amount;
                }
                else{
                    System.out.println("YOu do not have suffient fund.");
                }
                break;
            case 3:
                if(checkBalance() > amount){
                    System.out.println(amount + " is successfully recharged for mtn ");
                    balance = balance - amount;
                }
                else{
                    System.out.println("YOu do not have suffient fund.");
                }
                break;
        }
    }
}