package day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void FactorialTestFor4() {
		Factorial junit= new Factorial();
	   int result = junit.calculateFactorial(4);
	   assertEquals(24,result);
	}
	@Test
	public void FactorialTestFor6() {
		Factorial junit= new Factorial();
	   int result = junit.calculateFactorial(6);
	   assertEquals(720,result);
	}
	

}
