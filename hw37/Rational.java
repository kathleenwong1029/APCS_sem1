//Kathleen Wong
//APCS1 pd1
//HW37 -- Be More Rational
//2017-11-21

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
    if (den == 0){
      System.out.println("error:undefined fraction");
      num =0;
      den =1;

    }
  }

  //toString method
  public String toString(){
    return num + "/" +den;
  }

  //returns float approximation of number
  public  double floatValue (){
    return (double)num / den;
  }

  //multiply
  public void multiply ( Rational fraction) {
    this.num *= fraction.num;
    this.den *= fraction.den;
  }
  //divide
  public void divide ( Rational fraction) {
    if (fraction.num != 0) {
    this.num *= fraction.den;
    this.den *= fraction.num;}
    else {
      System.out.println("error");
    }
  }

    //static gcd method with two int parameters
    public static int gcd ( int a, int b){ // Does a recursive algorithm of GCD
          if (a % b == 0) {
                  return b;
          }
          return gcd( b, a%b);
  }

  //finds lcm of two integers
  public int lcm (int a , int b){
    int lcm =  (a * b) / (gcd(a,b));
    return lcm;
  }
  //takes 1 rational object and adds it to current rational object
  public void add(Rational a){
    int gcd = lcm (den, a.den);
    num = (gcd/den*num) + (gcd/a.den*a.num);
    den = gcd;
  }
    //takes 1 rational object and subtract it from current rational object
  public void subtract (Rational a){
    int gcd = lcm (den, a.den);
    num = (gcd/den*num) - (gcd/a.den*a.num);
    den = gcd;
  }
  //returns the gcd of the numerator and denominator of this Rational
  public int gcd(){
    return gcd(num,den);
  }
  //Changes this Rational to one in reduced form
  public void reduce (){
    int gcf = this.gcd();
    num = num /gcf;
    den = den /gcf;
  }

  //Takes a Rational parameter and compares it to the calling object
  //Returns 0 if the two numbers are equal
  //Returns a positive integer if the calling number is larger than the parameter
  //Returns a negative integer if the calling number is smaller than the parameter
  public int compareTo (Rational a){
    double x = this.floatValue();
    double y = a.floatValue();
    if (x==y){
      return 0;
    }
    else if (x > y){
      return 1;
    }
    else {
      return -1;
    }
  }

  public static void main (String[] args){
    //add tests
    Rational r = new Rational(2,3); //Stores rational number 2/3
    Rational s = new Rational(1,2); //Stores rational number 1/2
    r.add(s);
    System.out.println("r: " + r); // returns 7/6
    System.out.println("s: " + s); // returns 1/2
    //compareTo tests
    System.out.println(r.compareTo(s));// returned 1
    //subtact tests
    Rational a = new Rational(2,3); //Stores rational number 2/3
    Rational b = new Rational(1,2); //Stores rational number 1/2
    a.subtract(b);
    System.out.println("a: " + a);//returns 1/6
    //gcd tests
    Rational t = new Rational(4,18); //Stores the rational number 4/18
    System.out.println("gcd of t is: "+ t.gcd());// returns 2
    //reduce tests
    t.reduce();
    System.out.println("t: " + t);//t changed to 2/9

  }
}
