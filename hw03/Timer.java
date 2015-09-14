//Homework 3
//Timer Java Program
//This program will prompt the user for the current time and dinner time and 
//calculate the amount of time remaining until they eat dinner. 
//This program will use military time.
//
//   first compile the program
//      javac Timer.java
//   then run the program
//      java Timer.java
//   define a scanner
import java.util.Scanner;
//   define a class
public class Timer{
    //declare main method
    public static void main(String[] args){
        
        //declare the instance of the scanner
        Scanner myScanner = new Scanner ( System.in);
        
        //To prompt the current time
        System.out.print ("Enter the current time HHMM : ");
        
        //accept user input
        int timeCurrentHours = myScanner.nextInt();

        //To prompt the time that you will eat dinner
        System.out.print ("Enter time that you will be eating dinner HHMM : ");
        
        //accept user input
        int timeDinnerHours = myScanner.nextInt();
        
        //Subtract current time from dinner time to find the difference
        int timeHours = timeDinnerHours - timeCurrentHours ;
        
        //Declare the time minutes as the remainder of hours divided by 100
        int timeMinutes = timeHours % 100;
        
        //Reduce hours by two digits
        timeHours /=100;
     
        //To prompt the time that it will take before you eat dinner
        System.out.print ("You have " + timeHours +  " hours and " + timeMinutes + " minutes until dinner.");
        
    }
}