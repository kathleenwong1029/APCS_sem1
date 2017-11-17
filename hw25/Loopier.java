//Kathleen Wong
//APCS1 pd1
//HW25-- All Hallow's Eve
//2017-11-01

public class Loopier{

//populates existing array with randomly generated ints
public static int[] populateArray(int[] numsArray){
	for (int i=0; i < numsArray.length; i++){
		numsArray[i]=(int)(Math.random()*100); // ints limited from 0 to 99
		}
	return numsArray;
}

//returns String version of Array
public static String returnArray(int[] numsArray){
	String retStr = "{";
	for ( int element : numsArray){
		 retStr += element + ",";
			}
	return retStr + "}";
}

//iterative search for target
public static int linSearch (int[] a, int target){
	for (int x = 0; x < a.length; x++){
		if (a[x] == target) {
			return x;
		}
	}
	return -1; //if target is not in array, return -1
}

//recursive search for target
private static String YorN ="";
public static int linSearchR( int[] a, int target ){
	
	int intlength= a.length;
	int x= 0;
	int Array[]= new int[intlength-1];
	
	if (a.length==0){
		return -1;
	}
	if (a[0]==target){
		YorN += "Y";
		return YorN.indexOf("Y");
	}
	YorN += "N";
	for (int i = 1; i < intlength; i++){
		Array[x]=a[i];		
		x+=1;
	}
	return linSearchR(Array, target);
}

//iterative search for frequency
public static int freq( int[] a, int target ){
	int targetCtr =0;
	for (int x = 0; x < a.length; x++){
		if (a[x] == target) {
			targetCtr +=1; 
		}
	}
	return targetCtr;
}

//recursive search for frequency
public static int freqRec( int[] a, int target ){
	if (a.length==0){
		return 0;
	}
	int x= 0;
	int Array[]= new int[a.length-1];

    for (int i = 1; i < a.length; i++){
		Array[x]=a[i];
		x+=1;
	}		

	if (a[0]==target){
		return 1 + freqRec(Array, target);
	}

	return freqRec(Array,target);
}


public static void main(String[] args) {
	//test cases
	System.out.println ( "=================returnArray test=================");
	int numsArray[]= new int[10];
	System.out.println(returnArray(populateArray(numsArray)));
	System.out.println (" =================linSearch tests=================");
	int anArray[]= {1,4,3,3,3};
	System.out.println(linSearch(anArray,1));// returns 0
	System.out.println(linSearch(anArray,3));//returns 2
	System.out.println(linSearchR(anArray,4));//returns 1
	System.out.println (" =================freq tests=================");
	System.out.println(freq(anArray, 3));//returns 3
	System.out.println(freq(anArray, 4));//returns 1
	System.out.println(freqRec(anArray,3));//returns 3
	
}
}