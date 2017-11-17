//Kathleen Wong
//APCS1 pd1
//HW21--Karmacommma
//2017-10-24

public class Commafier{
    
    public static String commafyF(int num){
	String withComma ="";
	String lastTree="";
	if(num < 1000){
	    withComma+=num; //if number is less than 1000,it doesn't need commas
	}
	else{
	    lastTree += num % 1000;//remainder finds last three digits after commma
	    if(lastTree .equals( "0")){
		lastTree="000"; //if num is divisible by 1000,only one zero will show
	    }
	    withComma= (num/1000)+ "," + lastTree;

		}
	
	return withComma;
    }
    public static String commafyR(int num){
	String lastTree="";
	String number="";
	if(num<1000){
	    number+=num;
	    return number;
	    
	}
	else{
	    lastTree += num%1000;
	     if(lastTree .equals( "0")){
		lastTree="000";
	     }
	     return commafyR(num/1000) + "," +lastTree;
	}
	    

    }
    public static void main(String[]args){
	for(String s:args){
	    System.out.println(commafyR(Integer.parseInt(s)));
	    System.out.println(commafyF(Integer.parseInt(s)));
	}
	/*
	//test cases 
	System.out.println("Recursive version-------------------------");
        System.out.println(commafyR(1));//1
	System.out.println(commafyR(10));//10
       	System.out.println(commafyR(101));//101
      	System.out.println(commafyR(1000));//1,000
	System.out.println(commafyR(12345));//12,345
	System.out.println("Iterative version--------------------------");
	System.out.println(commafyF(1));//1
	System.out.println(commafyF(10));//10
	System.out.println(commafyF(101));//101
	System.out.println(commafyF(1000));//1,100
	System.out.println(commafyF(12345));//12,345
	*/
    }
}
