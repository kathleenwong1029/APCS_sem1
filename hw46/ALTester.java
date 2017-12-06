// Kathleen Wong
// APCS1 pd1
// HW46 --  Al<B> Sorted!
// 2017-12-05
import java.util.ArrayList;
public class ALTester{
  public static void populate(ArrayList<Comparable> a){
    for (int x=0; x <=22; x++){
  		int number=(int)(Math.random()*100); // ints limited from 0 to 99
      a.add(x,number);
  }
}
  public static boolean compare(ArrayList<Comparable> x){
    for(int a =1; a < x.size();a++ ){
      if((x.get(a-1).compareTo(x.get(a)))>0)
      return false;

    }
    return true;
  }
  public static void main(String[] args) {
    ArrayList <Comparable> nums = new ArrayList <Comparable>(23);
    int count =0;
    for(int x =0; x <=22;x++ ){
      nums.add(count,x);
      count ++;
    }
    System.out.println("Printing populated ArrayList nums...");
    System.out.println(nums);
    //test to see if compare works
    System.out.println("Sorted?");
    System.out.println(compare(nums));

    ArrayList <Comparable> hi = new ArrayList <Comparable>(23) ;
    populate(hi);
    System.out.println("Printing populated ArrayList hi...");
    System.out.println(hi);
    System.out.println("Sorted?");
    System.out.println(compare(hi));
  }
}
