package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = number.toString();
    	String retVal = "";
    	boolean isFizz = number % 3 == 0 || value.contains("3");
    	boolean isBuzz = number % 5 == 0 || value.contains("5");
    	boolean isDeluxe = number > 10 && allDigitsIdentical(value);
		if(isFizz) {
			retVal = "fizz";
    	}
		if(isBuzz) {
    		retVal = addSpaceToNonEmptyString(retVal);
    		retVal += "buzz";
    	}
		if(isDeluxe) {
    		retVal = addSpaceToNonEmptyString(retVal);
    		retVal += "deluxe";
		}
    	return (isFizz || isBuzz || isDeluxe) ? retVal : value;
    }

	private String addSpaceToNonEmptyString(String retVal) {
		if(retVal.length() != 0) {
			retVal += " ";
		}
		return retVal;
	}
}

