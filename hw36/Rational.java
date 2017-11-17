//Kathleen Wong
//APCS1 pd1
//HW26 -- Be Rational
//2017-11-20

public class Rational {
  //instance variables
  private int num;
  private int den;

  //default constructor
  public Rational (){
    num=0;
    den=1;
  }
  //constructor
  public Rational (int a, int b){
    num =a;
    den=b;
    if (den = 0)
      System.out.println("error,undefined");
      this();
  }
  public String toString(){
    String retStr = "";
    retStr = num + "/" +den;
  }
  public double floatValue
}
