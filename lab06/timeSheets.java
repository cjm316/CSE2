//Lab 06
//Employees Timesheet Java Program
//This program will employ nested loops to generate a timesheet for employees.
//The user will first be prompted for a number of employee timesheets to be 
//read in. It will then ask for the workweek data of each employee. The
//employees will be shown to be paid in cents per hour. 
//
//   first compile the program
//      javac timeSheets.java
//   then run the program
//      java timeSheets.java
//   define a scanner
import java.util.Scanner;
//   define a class
public class timeSheets{
    //declare main method
    public static void main(String[] args){
        //declare the variables
        int day, hours = 0, wage, num, pay;
        
        double total = 0;
        
        //declare the instance of the scanner
        Scanner myScanner = new Scanner ( System.in);
        
        //ask for number of employees
        System.out.print("How many employees are there? : ");
        num = myScanner.nextInt();
        
        for (num = num; num = 0; num--){
        
        
        System.out.print("What is this employee's pay rate? (in cents) : ");
        wage = myScanner.nextInt();
        
        System.out.print("what is the amount of hours worked monday? : ");
        hours =+ myScanner.nextInt();
        
        System.out.print("Tuesday? : ")
        hours =+ myScanner.nextInt();
        
        System.out.print("Wednesday? : ")
        hours =+ myScanner.nextInt();
        
        System.out.print("Thursday? : ")
        hours =+ myScanner.nextInt();
        
        System.out.print("Friday? : ")
        hours =+ myScanner.nextInt();
        
        pay = hours * wage
        
}