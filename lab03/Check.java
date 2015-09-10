//Lab 2
//Check Java Program
//
//This program will use a Scanner to obtain the orignal cost of the check,
//the tip they wish to pay, and the number of ways the check will be split. 
//The program will then determine how much each person in the group needs to pay.
//
//   first compile the program
//      javac Check.java
//   then run the program
//      java Check.java

//   define a class


// Use the scanner class
import java.util.Scanner;


public class Check{
    
//   add main method
  public static void main(String[] args) {
// Declare instance of a scanner
Scanner myScanner = new Scanner( System.in);

//prompt the orginal cost of the check
System.out.print("Enter the orignal cost of the check in the form xx.xx: ");

//accept the user input
double checkCost = myScanner.nextDouble();

System.out.print ("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
double tipPercent = myScanner.nextDouble();
tipPercent /= 100 ; //We want to convert the percentage into a decimal value


double numPeople;
double totalCost;
double costPerPerson;
int dollars,  //whole dollar amount of cost
dimes, pennies; //for storing digits
                //to the right og the decimal point
                //for the cost$
totalCost = checkCost * (1 + tipPercent);
System.out.print ("Enter the number of people included in the meal x : ");
numPeople=myScanner.nextDouble();
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction 
dollars=(int) costPerPerson;
//get dimes amount, e.g.,
// (int)(6.73*10) % 10 -> 67 % 10 -> 7
// where the % (mod) operator returns the remainder
// after the division: 583%100 -> 83 27%5 -> 2
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int) (costPerPerson * 100) %10;
System.out.println("Each person in the group owes $" + dollars + '.' 
+ dimes + pennies);

  
  
  
  
  
  
  
  
  }//end main method
}//end of class