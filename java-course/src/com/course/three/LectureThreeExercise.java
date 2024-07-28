package com.course.three;

/**
 * In Java we always define a class 
 * Later we will discuss classes
 */
public class LectureThreeExercise {

    /**
     * We define a main "function" later we will discuss more on functions
     * This is the entry point for a java application
     * We can run the main function 
     * We write our code inside the main function
     * public, static, void and String[] are "reserved" words that we don't use for variables
     * These terms will be discussed later
     */
    public static void main(String[] args) {
        String userFullName;
        
        // Ask the user to enter his fullName
        // Hint use Scanner to read and System.out.println to print
        // store the entered value in the variable userFullName
        // add code here
        
        // userFullName is a string with value entered by user that we can use String methods on it
        // Example : userFullName.charAt(2)
        // add code here
        
        // use charAt to get the first letter and print it
        // add code here
        
        // use indexOf to find the index of letter "y" and print it
        // add code here
        
        // convert userFullName to lower case using toLoweCase and print it
        // Note : The Value of userFullName no need to assign it, ( userFullName = userFullName.toLowerCase() is not needed)
        // add code here
        
        // Replace all white spaces with underscores using replaceAll
        // Note the new value of userFullName will have now "_" , example Java Course ==> Java_Course
        // add code here
        
        String lastName;
        
        // Extract the last name and store it in the last name variable
        // Hint: the last name will start after the underscore
        // Hint: use subString
        // add code here
        
        // Compare the alphabetic order of the extracted Last name and the full name and print the result of comparison
        // add code here
        // Hint: output is integer, however you can make it boolean by an if statement !
        
        String sentence = "My Name is ";
        
        // Concatenate the user's name with the above sentence and print it.
        // Hint : use concat on sentence and store the new value in the variable sentence
        // add code here
        
        // Use replace method to remove the previously added underscores
        // add code here
        
        char[] userFullNameArray;
        
        // use toCharArray() to store the String as array
        // add code here
        
        // Print the length of the created array
        // add code here
        
        // Done ! Print a final statement that the program is done
        // add code here

    }
}
