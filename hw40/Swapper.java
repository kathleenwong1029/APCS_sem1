//Kathleen Wong
//APCS1 pd1
//HW40 -- Make It Better
//2017-11-27

/* An array is created through the createArr method with strings of 3 or 4 chars out of
the constant string of letters and then prints the array. The swap method places the old
string in a temporary string , replaces the old string with the new string,
places the temporary string in the new location, and then prints the new array.
The user can choose the rows and columns of the location of the strings that
they want to swap. */

/* Version 2 Improvements :
- Added numbers to indicate rows and columns
- Added spaces even out array
- Added color to indicate which strings had been swapped
*/

import cs1.Keyboard;

public class Swapper{

  private static String[][] array;
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_CYAN = "\u001B[36m";

  //populates array with 3 or 4 character Strings
  public static String[][] createArr(int row, int col){
    String constant= "qwertyuioplkjhgfdsazxcvbnm";
    array = new String[row][col];
    int nums = 0;
    int nums2 = 0;
    //creates label for column number
    for (int ctr1 = 1; ctr1 < array[0].length; ctr1 ++) {
      array[0][ctr1] = nums + "   ";
      nums++;
    }
    //creates label for row number
    for (int ctr1 = 1; ctr1 < array.length; ctr1 ++) {
      array[ctr1][0] = nums2 + "   ";
      nums2++;
    }
    //fills the rest of the 2d array
	  for (int ctr1 = 1; ctr1 < array.length; ctr1 ++) {
	  for (int ctr2 = 1; ctr2 < array[ctr1].length; ctr2 ++) {
    String entry = "";
    int stringCount;
    int a = 0;
      //random chooses if string is 3 or 4 characters
		  if (Math.random() < 0.5){
		    stringCount = 3;
		    }
		      else {
		    stringCount = 4;
		          }
		  while (a < stringCount){
        //strings created from String constant
		    int i = (int)(Math.random()*constant.length());
		    entry += constant.substring(i,i+1);
        a +=1;
      }
      //evens out spacing within array
      if (stringCount ==3){
        entry +=" ";
        }
		array[ctr1][ctr2] = entry;
    }
  }
    array[0][0] = "    ";
    print(array);
    return array;
  }

  //swap method
  public static String[][] swap(String[][] arr, int row1, int col1, int row2, int col2){
    //temporary string to hold old string
    String a = arr[row1 +1 ][col1 + 1];
    arr[row1 + 1][col1 +1] = ANSI_CYAN + arr[row2 +1][col2 +1] + ANSI_RESET;
    arr[row2 + 1][col2 + 1] = ANSI_CYAN + a + ANSI_RESET;
    print (arr);
    return arr;
  }

  //print method
  public static void print( String[][] a )
  {
    for (String r[] : a){
      String retStr = "";
      for ( String c : r){
       retStr +=  c + " "  ;
     }
     System.out.println(retStr);
   }
  }

  public static void main(String[] args) {
    int row1, col1, row2, col2;
    Swapper mom = new Swapper();
    String[][] arr = mom.createArr(8,6);
    System.out.println("Answer all following questions with numbers available");
    System.out.println("\nWhat is the row of the first number you want to swap?");
    row1 = Keyboard.readInt();
    System.out.println("What is the column of the first number you want to swap?");
    col1 = Keyboard.readInt();
    System.out.println("What is the row of the second number you want to swap?");
    row2 = Keyboard.readInt();
    System.out.println("What is the column of the second number you want to swap?");
    col2 = Keyboard.readInt();
    System.out.println("Your new array:");
    arr = swap (arr, row1 ,col1, row2, col2);

  }
}
