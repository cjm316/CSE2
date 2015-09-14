//Homework 3
//Block Java Program
//This program will prompt the user for the length, width, and 
//height of a block, and will then produce the volume and 
//surface area of the block.
//
//   first compile the program
//      javac Block.java
//   then run the program
//      java Block.java
//   define a scanner
import java.util.Scanner;
//   define a class
public class Block{
    //declare main method
    public static void main(String[] args){
        
    //declare the instance of the scanner
    Scanner myScanner = new Scanner( System.in);
    
    //To prompt the length
    System.out.print ("Enter the length of the block here : ");
    
    //Declare length
    double length = myScanner.nextDouble();
    
    //To prompt the width
    System.out.print ("Enter the width of the block here : ");
    
    //Declare width
    double width = myScanner.nextDouble();
    
    //To prompt the height
    System.out.print ("Enter the height of the block here : ");
    
    //Declare height
    double height = myScanner.nextDouble();
    
    //Declare volume and surface area through formulae
    double volume = length * width * height ;
    double surfaceArea = 2*length*width + 2*length*height + 2*width*height ;
    
    //print the volume
    System.out.print ("The volume of the block the dimensions " + length + " " + 
    width + " " + height + " is " + volume + ".") ; 
    //print a space
    System.out.println (" ");
    //print the surface area
    System.out.print ("The surface area of the block is " + surfaceArea + ".") ;
    
    
    
    }
}
