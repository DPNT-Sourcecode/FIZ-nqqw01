package befaster.solutions.FIZ;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FizzBuzzSolutionTest {

	final FizzBuzzSolution solution = new FizzBuzzSolution();
	
	@Test
	public void three() {
		
		MatcherAssert.assertThat(solution.fizzBuzz(3), is(equalTo("fizz")));
	}
	
	@Test
	public void four() {
		
		MatcherAssert.assertThat(solution.fizzBuzz(4), is(equalTo("4")));
	}
	
	@Test
	public void five() {
		
		MatcherAssert.assertThat(solution.fizzBuzz(5), is(equalTo("buzz")));
	}
	
	@Test
	public void fifteen() {
		
		MatcherAssert.assertThat(solution.fizzBuzz(15), is(equalTo("fizz buzz")));
	}
}
