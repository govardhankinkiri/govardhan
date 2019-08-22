package day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day4.MarkValidatorUsingIfElse;

class MarkValidatorUsingSwitchCaseTest {

	@Test
	public void testMarkValidatorUsingSwitchCase() {
		MarkValidatorUsingSwitchCase junit =new MarkValidatorUsingSwitchCase();
	   String result = String.valueOf(junit.isPass(25));
	   assertEquals("false", result);
	}
	@Test
	public void testMarkValidatorUsingSwitchaseForGradeD() {
		MarkValidatorUsingSwitchCase junit = new MarkValidatorUsingSwitchCase();
        char result =junit.markGrade(45);
        assertEquals('D', result);
	}
	@Test
	public void testMarkValidatorUsingSwitchaseForGradeA() {
		MarkValidatorUsingSwitchCase junit = new MarkValidatorUsingSwitchCase();
        char result =junit.markGrade(92);
        assertEquals('A', result);
	}

}
