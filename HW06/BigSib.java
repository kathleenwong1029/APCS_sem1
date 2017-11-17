public class BigSib {
    private String helloMsg;

    
    public void setHelloMsg (String msg){

	helloMsg = msg;
       	
    }

    
    public String greet(String greeting){
	String newstring;
	newstring = helloMsg;
	newstring += " ";
	newstring += greeting;
	return newstring;
    }
} 
