package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	String value = number.toString();
    	String retVal = "";
    	boolean isDivisibleBy3 = number % 3 == 0;
    	boolean isDivisibleBy5 = number % 5 == 0;
		boolean contains3 = value.contains("3");
		boolean contains5 = value.contains("5");

		boolean isFizz = isDivisibleBy3 || contains3;
		boolean isBuzz = isDivisibleBy5 || contains5;
		
    	boolean isDeluxe = (isDivisibleBy3 && contains3) || (isDivisibleBy5 && contains5);
    	
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

