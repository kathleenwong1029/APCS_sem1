//Kathleen Wong
//APCS1 pd1
//HW49-Halving the Halves
//2017-12-08

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Comparable
  // (ie, instances of a class that implements interface Comparable)
  private ArrayList<Comparable> _data;
  private int _lo,_hi,_midIndex;
  private Comparable _mid;


  // default constructor initializes instance variable _data
  public OrderedArrayList()
  {
    _data = new ArrayList<Comparable>();

  }


  public String toString()
  {
    return _data.toString();
  }


  public Comparable remove( int index )
  {
    return _data.remove(index);
  }


  public int size()
  {
    return _data.size();
  }


  public Comparable get( int index )
  {
    return _data.get(index);
  }


  public void add(Comparable newVal)
  {
    int index = size();
    for (int i = 0; i < size(); i++) {
        if (newVal.compareTo(get(i)) <= 0) {
          index = i;
          break;
        }
      }
    _data.add(index, newVal);
  }

  public void addBin(Comparable newVal){
    _lo=0;
    _hi=size()-1;

    // if array is empty,newVal can just be added
    if(size()==0){
    _data.add(newVal);
    }

    _midIndex= (_lo + _hi )/2;
    _mid = get(_midIndex);
    while((!(newVal.compareTo(_mid)==0))&&(_hi >=_lo)) {
      _midIndex= (_lo + _hi)/2;
      _mid = get(_midIndex);
    if (newVal.compareTo(_mid) < 0){
      _hi = _midIndex -1;
    }
    if (newVal.compareTo(_mid) >0){
      _lo= _midIndex +1;
    }
  }
    //so index is not rounded down
    _midIndex= (_lo + _hi+ 1 )/2;
    _data.add(_midIndex ,newVal);
}




  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addBin( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    //check for sorted-ness
    //if msg does not appear, list was sorted
    for( int i=0; i<Franz.size()-1; i++ ) {
      System.out.println("at i: " + Franz.get(i) );
      if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
        System.out.println( " *** NOT sorted *** " );
        break;
      }
    }
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class OrderedArrayList
