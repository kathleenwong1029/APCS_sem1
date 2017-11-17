//Kathleen Wong
//APCS pd1
//HW12 -- stAtistically sPeaking
//2017-10-06

public class Stats {

    //mean for int
    public static int mean(int a, int b){
	return (a + b) / 2;
    }
    //mean for double
    public static double mean(double a, double b){
	return (a + b) / 2;
}
    //max for int
    public static int max(int a, int b){
	if (a > b){
	    return a;
		}
	else {
	    return b;
		}
    }
    //max for double
    public static double max(double a, double b){
	if (a > b){
	    return a;
		}
	else {
	    return b;
		}
    }
    //geoMean for int
    public static int geoMean(int a, int b){
	return (int)(Math.sqrt(a * b));
    }
    //geoMean for double
    public static double geoMean(double a, double b){
	return Math.sqrt(a * b);
    }

    //main method to test
	public static void main (String []args){
	    
	    System.out.println (Stats.mean(2,10));
	    System.out.println (Stats.mean(5.5,7.88));
	    System.out.println (Stats.max(5,9));
	    System.out.println (Stats.max(4.36436,3.857));
	    System.out.println (Stats.geoMean(2,32));
	    System.out.println (Stats.geoMean(5.65,3.546));
	}
}
