/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycalculatormethods;


import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Operations {
    
     //Declaring the addNumbers method
    public static double addNumbers(double num1, double num2) {
         
             double resultAdd;
             resultAdd = num1 + num2;
             return resultAdd;
        }
    
     //Declaring the subtract Numbers method
    public static double subtractNumbers(double num1, double num2) {
    
             double resultSub;
             resultSub = num1 - num2;
             return resultSub; 
        }
    
     //Declaring the divide Numbers method
    public static double divideNumbers(double num1, double num2) {
    
             double resultDiv;
             resultDiv = num1 / num2;
             return resultDiv;
        }
    
     //Declaring the multiply Numbers method
    public static double multiplyNumbers(double num1, double num2) {
    
             double resultMul;
             resultMul = num1 * num2;
             return resultMul;   
            }
    
     public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
         
        double result = addNumbers(100,50);
        
        System.out.println(result); 
        
        System.out.println(addNumbers(100,100));
        System.out.println(subtractNumbers(100,100));
        System.out.println(divideNumbers(100,100));
        System.out.println(multiplyNumbers(100,100));
}
}
    
