/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mycalculatormethods;
import java.util.Scanner;

public class MyCalculatorMethods {
    
   

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Operations myInstance = new Operations();
                
        System.out.println("Enter the first Number");
        double num1 = userInput.nextDouble();
        
        System.out.println("Enter the second Number");
        double num2 = userInput.nextDouble();
        
        double addResult = Operations.addNumbers(num1, num2);
        double subtractResult = Operations.subtractNumbers(num1, num2);
        double divideResult = myInstance.divideNumbers(num1, num2);
        double multiplyResult = myInstance.multiplyNumbers(num1, num2);
        
        
        
        System.out.println(addResult);
        System.out.println(subtractResult);
        System.out.println(divideResult);
        System.out.println(multiplyResult);
        
        
                
        
         
       
        
    }

    
        
       
}
   
    
   
    
