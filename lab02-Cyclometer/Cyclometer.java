//
//Colin Miksiewicz
//Lab 2
//Cyclometer Java Program
//
// This program is going to mimic a Cyclometer given two trip.
// This program will show the time elapsed in seconds
// and the number of front wheel rotations in that time.
//
//   first compile the program
//      javac Cyclometer.java
//   run the program
//      java Cyclometer.java//
//
//   define a class

public class Cyclometer{
// add main method
 public static void main(String[] args) {
    int secsTrip1=480;      //time in seconds the first trip took
    int secsTrip2=3220;     //time in seconds the second trip took
    int countsTrip1=1561;   //the amount of revolutions the front wheel took in the first lap
    int countsTrip2=9037;   //the amount of revolutions the front wheel took in the second lap
//constants
    double wheelDiameter=27.0, //the diameter of the wheel
    PI=3.14159,                //the constant of a the ratio of circles circumfrence to its diameter
    feetPerMile=5280,          //the amount of feet in a mile
    inchesPerFoot=12,          //the amount of inches in a foot
    secondsPerMinute=60;       //the amount of seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance; //declaring the intermediate variables
//Print out the initial data
    System.out.println(" Trip 1 took "+
        (secsTrip1/secondsPerMinute) +" minutes and had " +
         countsTrip1+" counts.");
    System.out.println(" Trip 2 took "+
        (secsTrip2/secondsPerMinute) +" minutes and had " +
         countsTrip2+" counts.");
//run the calculation; store the values. Document the 
//calculation here. 
    distanceTrip1=countsTrip1*wheelDiameter*PI;     //gives distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;       //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data
    System.out.println("Trip 1 was " +distanceTrip1+ " miles");
    System.out.println("Trip 2 was " +distanceTrip2+ " miles");
    System.out.println("The Total distance was " +totalDistance+ " miles");
 } //end main method
} // end of class
