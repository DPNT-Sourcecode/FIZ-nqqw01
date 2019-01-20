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
    		if(number % 2 == 1) {
    			retVal += "fake ";
    		}
    		retVal += "deluxe";
		}
    	return (isFizz || isBuzz || isDeluxe) ? retVal : value;
    }

	private boolean allDigitsIdentical(String value) {
		char first = value.charAt(0);
		for(int i = 1; i < value.length(); i++) {
			if(first != value.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	private String addSpaceToNonEmptyString(String retVal) {
		if(retVal.length() != 0) {
			retVal += " ";
		}
		return retVal;
	}
}



