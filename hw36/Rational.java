//Kathleen Wong
//APCS1 pd1
//HW36 -- Be Rational
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
    this.num =a;
    this.den=b;
    if (den == 0){
      System.out.println("error:undefined fraction");
      this.num = 0;
      this.den = 1;

    }
  }
  //toString method
  public String toString(){
    String retStr = "";
    retStr = num + "/" +den;
    return retStr;
  }
  //returns float approximation of number
  public static double floatValue (Rational fraction){
    double aprox = (double)fraction.num / fraction.den;
    return aprox;
  }
  public void multiply ( Rational fraction) {
    this.num *= fraction.num;
    this.den *= fraction.den;
  }
  public void divide ( Rational fraction) {
    this.num *= fraction.den;
    this.den *= fraction.num;
  }
  public static void main (String[] args){
    Rational a = new Rational (1,0); //printed error message
    System.out.println(a);//stored as 0/1
    Rational r = new Rational(2,3); //Stores rational number 2/3
    Rational s = new Rational(1,2); //Stores rational number 1/2
    System.out.println(floatValue(r)); // returns 0.6666666666666666
    System.out.println(floatValue(s)); // returns .5
    r.multiply(s);
    System.out.println(r); // returns 2/6
    System.out.println(s); // returns 1/2


  }
}
