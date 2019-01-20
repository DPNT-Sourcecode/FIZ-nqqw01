package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = "";
    	boolean isFizz = number % 3 == 0;
    	boolean isBuzz = number % 5 == 0;
		if(isFizz) {
    		value = "fizz";
    	}
		if(isBuzz) {
    		if(value.length() != 0) {
    			value += " ";
    		}
    		value += "buzz";
    	}
    	return (isFizz || isBuzz) ? value : number.toString();
    }
}


