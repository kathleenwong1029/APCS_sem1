//Kathleen Wong
//APCS1 pd1
//HW17--Do I repeat myself?
//2017-10-17

public class Repeater{
    public static String fenceR(int numPosts) {
	if (numPosts == 0) {
		return "";
	    }
	if (numPosts == 1) {
		return "|";
	    }
	else {
	    return "|--" + fenceR(numPosts - 1);
	}
    }
    public static String fenceW(int numPosts){
	int Cntr = numPosts;
	String fence = "|";
	if (Cntr == 0 ){
	    fence = "";}
	while (Cntr > 1){
	    fence += "--|";
	    Cntr = Cntr - 1;
	}
        
	return fence;
    }
      
    public static void main(String[] args) {
	//test cases
	System.out.println("should return empty string");
	System.out.println(fenceR(0));//returned empty string
	System.out.println("should return |");
	System.out.println(fenceR(1));//returned |
	System.out.println("should return |--|");
	System.out.println(fenceR(2));//returned |--|
	System.out.println("should return |--|--| ");
	System.out.println(fenceR(3));//returned |--|--|
	System.out.println("should return empty string");
	System.out.println(fenceW(0));//returned empty string
	System.out.println("should return |");//returned empty string
	System.out.println(fenceW(1));//returned |
	System.out.println("should return |--|");
	System.out.println(fenceW(2));//returned |--|
	System.out.println("should return |--|--| ");
	System.out.println(fenceW(3));//returned |--|--|
    }
}
