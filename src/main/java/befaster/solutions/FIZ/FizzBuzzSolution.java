package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = number.toString();
    	String retVal = "";
    	boolean isFizz = number % 3 == 0 || value.contains("3");
    	boolean isBuzz = number % 5 == 0 || value.contains("5");
		if(isFizz) {
			retVal = "fizz";
    	}
		if(isBuzz) {
    		if(retVal.length() != 0) {
    			retVal += " ";
    		}
    		retVal += "buzz";
    	}
    	return (isFizz || isBuzz) ? retVal : value;
    }
}




