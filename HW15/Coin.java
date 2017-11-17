//Kathleen Wong
//APCS1 pd1
//HW15--Wayne's World
//2017-10-12

public class Coin{

    //instance variables
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;


    //default constructor sets value to 0, upFace to heads, name to null, all counters to 0, and sets bias as a random int from 0.0 to 1.0
    public Coin (){
	value = 0;
	upFace = "heads";
	name = "null";
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
	bias= Math.random();
    }
    //first overloaded constructor takes string denomination to indicate name
    public Coin (String denomination){
	this();
	name = denomination;
	    }
    //second overloaded constructor takes strings to indicate denomination and current face
    public Coin (String denomination, String face){
	this();
	name = denomination;
	upFace = face;
    }

    //flip()- Returns a String (“heads” or “tails”) with probability of getting heads determined by bias
    public String flip(){
	if(bias > .5){
	    upFace= "heads";
	    return "heads";
	}
	else {
	    upFace= "tails";
	    return "tails";
	}
    }
    
    // toString method-returns a coin’s denomination and current face.
    public String toString(){
  
	return name + " -- " + upFace;
    }

    //equals method-compares this Coin to another. Returns true if they show the same face, false otherwise.
    public Boolean equals(Coin another){
	return (another.upFace == upFace);
	    
    	}
    //assignValue()-assigns a Coin’s monetary value according to its name
    public void assignValue(String name){
	if (name == "penny"){
	    value = .01;
	}
	if (name == "nickel"){
	    value = .05;
	}
	if (name == "dime"){
	    value = .10;
	}
	if (name == "quarter"){
	    value = .25;
	}
	if (name == "half dollar"){
	    value = .50;
	}
	if (name == "dollar"){
	    value = 1.00;
       	}
    }   			  
}
