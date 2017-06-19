package code.kata;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzz_of_0is0() {
		assertThat(FizzBuzz.of(0), is("0"));
	}
	
	@Test
	public void fizzBuzz_of1is1() {
		assertThat(FizzBuzz.of(1), is("1"));
	}
	
	@Test
	public void fizzBuzz_of3isFizz() {
		assertThat(FizzBuzz.of(3), is("Fizz"));
	}
	
	@Test
	public void fizzBuzz_of5isBuzz() {
		assertThat(FizzBuzz.of(5), is("Buzz"));
	}

}

