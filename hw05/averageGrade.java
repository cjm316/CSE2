//Homework 5
//Average Grade Java Program
//
//This program will prompt the user for grades, and will then print
//out an average of those grades once the user exits the loop.
//The program will tell a user when they enter an invalid grade, and
//it will not store the invalid information the user enters.
//
//   first compile the program
//      javac averageGrade.java
//   then run the program
//      java averageGrade.java
//   define a scanner
import java.util.Scanner;
//   define a class
public class averageGrade{
    //declare main method
    public static void main(String[] args){
         //declare the variables
        int sum = 0, num, count = 0;
        
        double average;
        
        //declare the instance of the scanner
        Scanner myScanner = new Scanner ( System.in);
        
        //Prompt the exit command and first line
        System.out.print (" Enter 999 to stop the loop : ");
        num = myScanner.nextInt();
        
         //declare the whie loop
        while (num != 999 ){
         
         //begin the if-else statement
         
         if ( (num >= 0) && (num <= 100) ){
             
             //add 1 to the count
             count++;

             //add the number entered to the sum total
             sum += num;
             
             //prompt for another entry
             System.out.print (" Enter another value : ");
             num = myScanner.nextInt();
             
         } else { 
             
             //error message: prompt for another entry
             System.out.print ("Improper grade entered, enter a correct value : ");
            num = myScanner.nextInt();
}

        }
            //define the average
            average = (double)sum/count;
            
            //print out the average
            System.out.print ("The average grade is : " + average);
            //print an empty line to make it look pretty
            System.out.println ("");
            
   
   
    }
    
    
}