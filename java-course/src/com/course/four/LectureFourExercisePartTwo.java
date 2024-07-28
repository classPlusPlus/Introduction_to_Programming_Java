package com.course.four;

/**
 * In Java we always define a class 
 * Later we will discuss classes
 */
public class LectureFourExercisePartTwo {

    /**
     * We define a main "function" later we will discuss more on functions
     * This is the entry point for a java application
     * We can run the main function 
     * We write our code inside the main function
     * public, static, void and String[] are "reserved" words that we don't use for variables
     * These terms will be discussed later
     */
    public static void main(String[] args) {
        double totalGroceriesCost = 0.0;

        // Ask for the total cost of groceries
        // Store values in the above variable
        // Hint: Scanner to read, System.out.println() to print
        // add code here

        String promoCode;

        // Ask for the promo code
        // Store values in the above variable
        // Hint: if there is no code ask the user to press enter
        // add code here
        
        double discountedGroceriesCost = totalGroceriesCost;
        
        // if promoCode is empty check if > 200$ here
        
        // Add the switch statement here 
        // Hint: you can use default to skip/invalid option and print error message
        // Don't forget that you have to print which discount has been applied.
        // update discountedGroceriesCost
        // add code here
        
        // add the 2% if totalGroceriesCost > 400$
        // add code here
        
        double taxAmount; 
        double taxRate = 0.08; //8%
        
        // Calculate the tax using taxAmount = discountedGroceriesCost * taxRate
        // add code here
        
        double finalCost;
        
        // Calculate final cost by adding tax to the discounted price
        // print final cost and state if it is within the budget 200$
        // add code here
    }
    
    
}
