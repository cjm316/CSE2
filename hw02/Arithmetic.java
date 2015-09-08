//Homework 2
//Arithmetic Java Program
//
//   first compile the program
//      javac Arithmetic.java
//   then run the program
//      java Arithmetic.java

//   define a class
public class Arithmetic{
    
//   add main method
  public static void main(String[] args) {
  //constants and declaring main variables
      //Number of pairs of socks
      int nSocks=3;
      //Cost per pair of socks
      //('$' is a part of the variable name)
      double sockCost$=2.58;
      
      //Number of drinking glasses
      int nGlasses=6;
      //Cost per glass
      double glassCost$=2.29;
      
      //number of boxes of envelopes
      int nEnvelopes=1;
      //cost per box of envelopes
      double envelopeCost$=3.25;
      double taxPercent=0.06;
      
      //variables for socks
      double totalSockCost$=nSocks*sockCost$;                       //pre tax total on socks
      double totalSockTax$=totalSockCost$*taxPercent;               //taxes on the socks
      double finalSockCost$=totalSockCost$+totalSockTax$;           //after tax total on socks
      
      //variables glasses
      double totalGlassCost$=nGlasses*glassCost$;                   //pre tax total on glasses
      double totalGlassTax$=totalGlassCost$*taxPercent;             //taxes on the glasses
      double finalGlassCost$=totalGlassCost$+totalGlassTax$;        //after tax total on glasses
      
      //variables of envelopes
      double totalEnvelopeCost$=nEnvelopes*envelopeCost$;               //pre tax total on envelopes
      double totalEnvelopeTax$=totalEnvelopeCost$*taxPercent;           //taxes on the envelopes
      double finalEnvelopeCost$=totalEnvelopeCost$+totalEnvelopeTax$;    //after tax total on envelopes
     
      //variables for the total cost of all items
      double totalCostBeforeTax$=totalEnvelopeCost$+totalSockCost$+totalGlassCost$;  //pre tax cart total
      double totalTax$=totalGlassTax$+totalSockTax$+totalEnvelopeTax$;               //total taxes on the cart
      double totalCostAfterTax$=totalCostBeforeTax$+totalTax$;                        //total cost of the cart after tax

      //Print the outputs
      //Print Sock info
      System.out.println("This information pertains to Socks purchased.");
      System.out.println(+ (nSocks) + " Socks were purchased.");
      System.out.println(+ (sockCost$) + " was the cost per Envelope.");
      System.out.println(+ (totalSockCost$) + " was the total cost of all Socks before tax");
      System.out.printf("The cost of the tax is %.2f", totalSockTax$);
      System.out.println(" ");
      System.out.printf("The total after tax cost of the socks is %.2f", finalSockCost$);
      System.out.println(" ");
      //Print Glass info
      System.out.println("This information pertains to Glasses purchased.");
      System.out.println(+ (nGlasses) + " Glasses were purchased.");
      System.out.println(+ (glassCost$) + " was the cost per Glasses.");
      System.out.println(+ (totalGlassCost$) + " was the total cost of all Glasses before tax");
      System.out.printf("The cost of the tax is %.2f", totalGlassTax$);
      System.out.println(" ");
      System.out.printf("The total after tax cost of the socks is %.2f", finalGlassCost$);
      System.out.println(" ");
      //Print Envelope info
      System.out.println("This information pertains to Envelopes purchased.");
      System.out.println(+ (nEnvelopes) + " Envelopes were purchased.");
      System.out.println(+ (envelopeCost$) + " was the cost per Envelope.");
      System.out.println(+ (totalEnvelopeCost$) + " was the total cost of all Envelopes before tax");
      System.out.printf("The cost of the tax is %.2f", totalEnvelopeTax$);
      System.out.println(" ");
      System.out.printf("The total after tax cost of the socks is %.2f", finalEnvelopeCost$);
      System.out.println(" ");
      System.out.println(" ");
      //Print Cast info
      System.out.println("This information pertains to the total amount of goods in the cart.");
      System.out.printf("The pre tax cart total is %.2f", totalCostBeforeTax$);
      System.out.println(" ");      
      System.out.printf("The total tax on the cart is %.2f", totalTax$);
      System.out.println(" ");
      System.out.printf("The total cost of the cart after tax is %.2f", totalCostAfterTax$); 
      
      
  }//end main method
}//end of class