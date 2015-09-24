//Lab 05
//Calculator Special Java Program
//This program will act as a calculator by prompting the user for
//two intergers and then will give an answer to multiplication,
//division, addition, and subtraction. The special portion (what
//makes it different from lab04) of the program is that we will
//now insert a loop into the program which will prompt the user
//for an input until they prompt the user to stop.
//
//   first compile the program
//      javac CalculatorSpecial.java
//   then run the program
//      java CalculatorSpecial.java
//   define a scanner
import java.util.Scanner;
//   define a class
public class CalculatorSpecial{
    //declare main method
    public static void main(String[] args){
        //declare the string
        String Y = "";
         //declare the loop
        while (! Y.equals("N") && ! Y.equals("n")){
        
        //declare the instance of the scanner
        Scanner myScanner = new Scanner ( System.in);
        
        //to prompt the first integer
        System.out.print ("Enter the first variable a : ");
        int a = myScanner.nextInt();
        
        //to prompt the second integer
        System.out.print ("Enter the second variable b : ");
        
        int b = myScanner.nextInt();
        
        Scanner op = new Scanner(System.in);
        //prompt the user for an operator
        System.out.print ("Enter the operator(+,-,*,/) : ");
        String operator = op.next();
        
        // use switch statment to find operator
        switch (operator)  {
            //case for addition
        case "+":
            //print for addition
        System.out.println("Your answer is " + (a + b));
            break;
            //case for subtraction
        case "-":
            //print for subtraction
        System.out.println("Your answer is " + (a - b));
            break;
            //case for division (notice the doubles casted)
        case "/":
            //print for division
        System.out.println("Your answer is " + ((double)a / (double)b));
            break;
            //case for multiplication
        case "*":
            //print for multiplication
        System.out.println("Your answer is " + (a * b));
            break;
            //default necessary if they do not enter the correct operator
        default:
            //print the default
        System.out.println("User did not enter in valid operator.");
        
        
}
//Print the ending to the loop
System.out.print ("Type n or N to stop : ");
Y = myScanner.next();
        }
    }
}
