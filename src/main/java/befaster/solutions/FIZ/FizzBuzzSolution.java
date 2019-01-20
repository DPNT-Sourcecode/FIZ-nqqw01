package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = "";
    	if(number % 3 == 0) {
    		value = "fizz";
    	}
    	if(number % 5 == 0) {
    		if(value.length() != 0) {
    			value += " ";
    		}
    		value += "buzz";
    	}
    	return number.toString();
    }
}

