package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HellWorldTest {

	@Test
public void test() {
		HelloWorld junit=new HelloWorld();
		String result = junit.getMessage();
		assertEquals("Hello World!", result);
		
	}
	
	

}
