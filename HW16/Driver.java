//Kathleen Wong
//APCS1 pd1
//HW16--Get It While You Can
//2017-10-16
/***
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Move the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor
       Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
    else
    System.out.println( "No match. Firestarter you can not be." );

    //runs coin flips until 5 heads have apppeared
    while((yours.getHeadsCtr() + wayne.getHeadsCtr()) < 5){
	yours.flip();
	wayne.flip();
        
    }
    System.out.println("5 heads reached after " + yours.getFlipCtr() +" flips");

    //runs coin flips until 5 matches have occured
    while (yours.getMatchCtr() < 5){
    yours.flip();
    wayne.flip();
    yours.equals(wayne);
    }
    System.out.println( "5 matches reached after " + yours.getFlipCtr() + " flips");

    //runs coin flips until 14007 matches have occured
    while (yours.getMatchCtr() < 14007){
	yours.flip();
	wayne.flip();
	yours.equals(wayne);
    }
     System.out.println( "14007 matches reached after " + yours.getFlipCtr() +" flips");

 
   
   
 /*===================TOP==========================

	    ====================BOTTOM======================*/

  }//end main()

}//end class
