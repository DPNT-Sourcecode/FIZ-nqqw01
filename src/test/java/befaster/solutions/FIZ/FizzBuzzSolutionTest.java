package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class FizzBuzzSolutionTest {

	final FizzBuzzSolution solution = new FizzBuzzSolution();
	
	@Test
	public void three() {
		
		assertThat(solution.fizzBuzz(3), is(equalTo("fizz")));
	}
	
	@Test
	public void four() {
		
		assertThat(solution.fizzBuzz(4), is(equalTo("4")));
	}
	
	@Test
	public void five() {
		
		assertThat(solution.fizzBuzz(5), is(equalTo("buzz")));
	}

	@Test
	public void fifteen() {
		
		assertThat(solution.fizzBuzz(15), is(equalTo("fizz buzz")));
	}

	@Test
	public void containsFive() {
		
		assertThat(solution.fizzBuzz(52), is(equalTo("buzz")));
	}

	@Test
	public void fiveHundred() {
		
		assertThat(solution.fizzBuzz(500), is(equalTo("buzz")));
	}

	@Test
	public void thirtyThree() {
		
		assertThat(solution.fizzBuzz(33), is(equalTo("fake deluxe")));
	}

	@Test
	public void thirty() {
		
		assertThat(solution.fizzBuzz(30), is(equalTo("deluxe")));
	}
}

