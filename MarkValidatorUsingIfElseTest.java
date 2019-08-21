package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorUsingIfElseTest {

	@Test
	public void testMarkValidatorUsingIfElse() {
		MarkValidatorUsingIfElse junit =new MarkValidatorUsingIfElse();
	   String result = String.valueOf(junit.isPass(25));
	   assertEquals("false", result);
	}
	@Test
	public void testMarkValidatorUsingIfElseForGradeD() {
		MarkValidatorUsingIfElse junit = new MarkValidatorUsingIfElse();
        char result =junit.markGrade(45);
        assertEquals('D', result);
	}
	@Test
	public void testMarkValidatorUsingIfElseForGradeA() {
		MarkValidatorUsingIfElse junit = new MarkValidatorUsingIfElse();
        char result =junit.markGrade(92);
        assertEquals('A', result);
	}
}
