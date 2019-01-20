package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = number.toString();
    	boolean isFizz = number % 3 == 0 || value.contains("3");
    	boolean isBuzz = number % 5 == 0 || value.contains("5");
		if(isFizz) {
    		value = "fizz";
    	}
		if(isBuzz) {
    		if(value.length() != 0) {
    			value += " ";
    		}
    		value += "buzz";
    	}
    	return value;
    }
}



