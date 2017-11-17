import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext( )) {
		    System.out.println(sc.next( ));
	}
	//pre: w != null
//post: firstVowel("") --> ""
//      firstVowel("zzz") --> ""
//      firstVowel("meatball") --> "e"
public static String firstVowel(String w) { }

//pre: w != null and w.length() > 0
//post: beginsWithVowel("apple")  --> true
//      beginsWithVowel("strong") --> false
public static boolean beginsWithVowel(String w) { }

//pre: w.length() > 0
//post: engToPig("apple")  --> "appleway"
//      engToPig("strong") --> "ongstray"
//      engToPig("java")   --> "avajay"
public static String engToPig(String w) { }
		
	}
}
