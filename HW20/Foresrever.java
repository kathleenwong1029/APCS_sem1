//Kathleen Wong
//APCS1 pd1
//HW20--For the Lulz Love of Strings
//2017-10-20

public class Foresrever{
    public static String fenceF (int posts){
	String newFence ="";
	int numposts= posts;
	for(String fence = "|";numposts >= 1; fence += "--|"){
	    newFence = fence;
	    numposts -= 1;
	}
	return newFence;
    }
    //reverse word using for loop
    public static String reverseF( String s){
	int wLength = s.length();
	String rWord = "";
        for(String word= s.substring(0);wLength >= 1 ;wLength-- ){
	rWord+= word.substring(wLength-1,wLength);
	    
	    }
		return rWord;
    }
    //reverse word using recursion
    public static String reverseR (String s){
	int wLength = s.length();
	String rWord = "";
	
	if (wLength >=1){
	    rWord = s.substring((wLength-1),(wLength));//starts with last letter
	    rWord = rWord+reverseR(s.substring(0,wLength -1));// recursions keeps adding letters until wLength=0
	
	}
	return rWord;
    }
		        
    public static void main (String[] args){
	//test cases
	System.out.println("fence test cases------------------------------------");
	System.out.println(fenceF(0));//empty string
	System.out.println(fenceF(1));//|
	System.out.println(fenceF(2));//|--|
      	System.out.println(fenceF(3));//|--|--|
	System.out.println("reverseF test cases------------------------------------");		   
        System.out.println(reverseF("stressed"));//desserts
	System.out.println(reverseF("a"));//a
	System.out.println(reverseF("sour patch kids"));//sdik hctap ruos
	System.out.println("reverseR test cases------------------------------------");
	System.out.println(reverseR("stressed"));//desserts
	System.out.println(reverseR("d"));//d
        System.out.println(reverseR("what a cool bop"));//pob looc a tahw

    }
}
			   
