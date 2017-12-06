//Kathleen Wong
//APCS1 pd1
//HW41-- Array of Steel
//2017-11-28
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String retStr = "[";

           for (int i = 0; i < _data.length; i++) {
               if (i > 0)
                   retStr += ", " + _data[i];
               else
                   retStr += _data[i];
           }
           return retStr + "]";

   }



  //double capacity of SuperArray
  private void expand()
  {
    _size = _data.length *2;
    int[] _dataTwice =  new int[_size];
    for(int i = 0; i < _data.length; i++)
        _dataTwice[i] = _data[i];
        _data = _dataTwice;

  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int a = get(index);
   _data[index]=newVal;
    return a;
  }


  //main method for testing
  public static void main( String[] args )
  {
    SuperArray curtis = new SuperArray();
    System.out.println( "Printing empty SuperArray curtis..." );
    System.out.println( curtis );

    for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
    }

    System.out.println("Printing populated SuperArray curtis...");
    System.out.println(curtis);

    for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
                         + curtis._data.length );
    }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~x
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
