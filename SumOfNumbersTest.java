package day6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumOfNumbersTest {

	@Test
	public void testForSumOfEvenNumbersFrom1To10() {
		SumOfNumbers junit = new SumOfNumbers();
	    int result = junit.sumOfEvenNumbers(1, 10);
	    assertEquals(30, result);
	
	}
	@Test
	public void testForSumOfOddNumbersFrom1To10() {
		SumOfNumbers junit = new SumOfNumbers();
	    int result = junit.sumOfOddNumbers(1, 10);
	    assertEquals(25, result);
	
	}

}
