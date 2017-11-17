//Team: Tiny Turtles
//Thet Htay Zaw and Kathleen Wong
//APCS1 pd1 
//HW19 -- GCD 3 ways 
//2017-10-18

public class Stats { 

	public static int gcd(int a, int b) { 
		int Min = Math.min(a,b); //Make Min the min value
		int Max = Math.max(a,b); //Make Max the max value 
		int ctr = 1;			 //A counter for the while loop
		int GCD = 1;			 //To keep track of the GCD
		
		if ( a == 0 || b == 0 ) { //If either number is zero, return the maximum
			return Max;
		} 
		
		while ( ctr <= Min ) { //While the counter is less than or equal to the minimum, check for the GCD
							   //We need <= as opposed to < because we need the actual Min value to be tested too
			if ( Min % ctr == 0 && Max % ctr == 0 ) { 
				GCD = ctr;
			}
			ctr += 1;
		}
		
		return GCD;
	}
	
	/*Euclid's Algorithm 
	Euclid's Algorithm is a method to find the greatest common divisor (GCD) between two positive integers.
	You then divide the larger integer by the smaller integer.
	If it divides evenly, then the smaller integer is the GCD.
	If there is a remainder, the larger integer will now be replaced by the smaller integer and the smaller integer is replaced by the remainder. 
	From here on, you repeat the steps until you reach a point where the two numbers divide evenly,
	or one of the two numbers becomes a zero, in which case, the other nonzero number becomes the GCD. 
	*/
	
	
	
	
	public static int gcdER(int a, int b) { 
		int Min = Math.min(a,b); //Setting the minimum 
		int Max = Math.max(a,b); //Setting the maximum
		
		if ( a == 0 || b == 0 ) { //Same as above, if either value is zero, the maximum is returned
			return Max; 
		}
		
		if (Max % Min == 0) { //If Min divides into the maximum with a remainder of 0 (aka is a divisor), return Min
			return Min;
		} 
		else {                //Otherwise Min is now the Max minus the Min as given by the notes and flowchart
			Min = Max - Min; 
		} 
		if (Min == 0 || Max == 0 ) {  //Now check if either value is equal to 0
			if ( Min == 0 ) {         //If one value is Zero, return the other
				return Max;
				} 
			else { 
				return Min; 
				} 
		} 
		else { 						  //Else, call the function with the new Min and Max
			return gcdER(Min, Max);
		}
	
	}
	
	public static int gcdEW(int a, int b) { 
		int Max = Math.max(a, b);
		int Min = Math.min(a,b);

		if ( a == 0 || b == 0 ) { //Same as above, if either value is zero, the maximum is returned
			return Max; 
		}

        // if the minimum divides the maximum without a quotient, the minimum is the gcf
		if (Max % Min == 0) {
			return Min;
			}
			
		else {
			while (!(Max % Min == 0)){
				Min= Max % Min; //replaces min by remainder
				Max= Math.min(a,b);// former minimum becomes new maximum
				
				if (Max == 0 || Min == 0) {
					
					if (Max == 0){
						return Min;
					}
						
					else {
						return Max;
					}
				}
			}
	    
		}
		return Min;	
	}
	 
	
	
	public static void main(String [] args) { 
		//gcd
		System.out.println("Testing the Regular gcd method============================");
		System.out.println(gcd(15,20)); //Returns 5
		System.out.println(gcd(20,15)); //Returns 5
		System.out.println(gcd(10,30)); //Returns 10
		System.out.println(gcd(30,10)); //Returns 10
		System.out.println(gcd(100,50)); //Returns 50
		System.out.println(gcd(99,66)); //Returns 33
		System.out.println(gcd(72,0)); //Returns 72
		System.out.println(gcd(40,40)); //Returns 40
		
		//gcdER
		System.out.println("\nTesting the gcdER method============================");
		System.out.println(gcdER(15,20)); //Returns 5
		System.out.println(gcdER(20,15)); //Returns 5
		System.out.println(gcdER(10,30)); //Returns 10
		System.out.println(gcdER(30,10)); //Returns 10
		System.out.println(gcdER(100,50)); //Returns 50
		System.out.println(gcdER(99,66)); //Returns 33
		System.out.println(gcdER(72,0)); //Returns 72
		System.out.println(gcdER(16,24)); //Returns 8
		System.out.println(gcdER(24,16)); //Returns 8
		System.out.println(gcdER(40,40)); //Returns 40
		
		//gcdEW
		System.out.println("\nTesting the gcdEW method============================");
		System.out.println(gcdEW(15,20)); //Returns 5
		System.out.println(gcdEW(20,15)); //Returns 5
		System.out.println(gcdEW(10,30)); //Returns 10
		System.out.println(gcdEW(30,10)); //Returns 10
		System.out.println(gcdEW(100,50)); //Returns 50
		System.out.println(gcdEW(99,66)); //Returns 33
		System.out.println(gcdEW(72,0)); //Returns 72
		System.out.println(gcdEW(0,24)); //Returns 24
		System.out.println(gcdEW(24,16)); //Returns 8
		System.out.println(gcdEW(40,40)); //Returns 40
	}
} 
