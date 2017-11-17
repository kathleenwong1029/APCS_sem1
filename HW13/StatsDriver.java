public class StatsDriver{
//methods for easier SOPing
    private static void p(int l) {
        System.out.println(l);
    }
    private static void p(double l) {
        System.out.println(l);
    }
    private static void pline(String l) {
	System.out.println(l);
    }
    

    //main method to test
    
	public static void main (String []args){
	    pline("==========================");
	    pline("testing int mean: should return 6 and -3");
	    p(Stats.mean(2,10));//returned 6
	    p(Stats.mean(-9,3));//returned -3
	    
	    pline("==========================");
	    pline("testing double  mean: should return around 6.69 and -.8975");
	    p(Stats.mean(5.5,7.88));//returned around 6.69
	    p(Stats.mean(-7.565,5.77));//returned around -0.8975

	    pline("==========================");
	    pline("testing int max for 2 ints: should return 9 and -3");
	    p(Stats.max(5,9));//returned 9
	    p(Stats.max(-3,-23));//returned -3

	    pline("==========================");
	    pline("testing int max for 3 ints: should return 5");
	    p(Stats.max(4,-1,5));//returned 5

	    pline("==========================");
	    pline("testing double max for 2 doubles: should return 6.44 and 2.33");
	    p(Stats.max(.54,6.44));//returned 6.44
	    p(Stats.max(2.33,-.44));//retured 2.33

	    pline("==========================");
	    pline("testing double max for 3 doubles: should return 6.44");
	    p(Stats.max(6.44,-5.443,2.33333));//returned 6.44

	    pline("==========================");
	    pline("testing int geoMean for 2 ints: should return 8 and 8");
	    p(Stats.geoMean(2,32));//returned 8
	    p(Stats.geoMean(-8,-8));//returned 8

	    pline("==========================");
	    pline("testing int geoMean for 3 ints: should return 4");
	    p(Stats.geoMean(2,4,8));//returned

	    pline("==========================");
	    pline("testing double geoMean for 2  doubles: should return around 4.476");
	    p(Stats.geoMean(5.65,3.546));//returned around 4.476

	    pline("==========================");
	    pline("testing double geoMean for 3 doubles: should return around 4.8256");
	    p(Stats.geoMean(5.44,4.54,4.55));//returned around 4.8256
	}	    
	    
}
    

