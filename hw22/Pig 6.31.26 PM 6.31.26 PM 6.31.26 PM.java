//Kathleen Wong
//APCS1 pd1
//HW22-- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
//2017-10-15
 /* class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
      if (w.indexOf(letter) != -1){
	  return true;
      }
      else {
	  return false;
      }
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
      if (VOWELS.indexOf(letter) != -1){
	  return true;
      }
      else{
	  return false;
      }
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      int count = 0;
      for(int letters=0;letters<w.length();letters+=1){
	  if( isAVowel(w.substring(letters,letters+1))){
	      count +=1;
	  }
      }
      
      return count;
  }

  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
       for(int letters=0;letters<w.length();letters+=1){
	  if( isAVowel(w.substring(letters,letters+1))){
	      return true;
	  }
      }
       return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
      String vowels ="";
       for(int letters=0;letters<w.length();letters+=1){
	  if( isAVowel(w.substring(letters,letters+1))){
	      vowels += w.substring(letters,letters+1);
	  }
      }
      return vowels;
  }

  public static void main( String[] args ) 
  {
      //test cases
      System.out.println("hasA tests --------------------------------------------");
      System.out.println(hasA ("potatoe","o"));//true
      System.out.println(hasA ("yomama","u"));//fase
      System.out.println("isAVowel tests --------------------------------------------");
      System.out.println(isAVowel ("p"));//fase
      System.out.println(isAVowel ("a"));//true
      System.out.println("countVowels tests --------------------------------------------");
      System.out.println(countVowels ("aidugiuwia"));//7
      System.out.println(countVowels ("sdf"));//1
      System.out.println("hasAVowel tests --------------------------------------------");
      System.out.println(hasAVowel("ooek"));//true
      System.out.println(hasAVowel("mpw"));//false
      System.out.println("allVowels tests --------------------------------------------");
      System.out.println(allVowels("mpw"));//empty string
      System.out.println(allVowels("potatoe"));//oaoe
      
    
  }//end main()

}//end class Pig
