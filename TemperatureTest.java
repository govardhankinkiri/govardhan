package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	public void testConvert212degreeFarenheitToCelsius() {
		Temperature junit= new Temperature();
		double actual = junit.convertToCelsius(212);
		assertEquals(100, actual);
	
	}
	@Test
	public void testConvert32degreeFarenheitToCelsius() {
		Temperature junit= new Temperature();
		double actual = junit.convertToCelsius(32);
		assertEquals(0, actual);
	}
	@Test
	public void testConvert100degreeCelsiusToFarenheit() {
		Temperature junit =new Temperature();
    double actual = junit.convertToFarenheit(100);
    assertEquals(212, actual);
	}
	@Test
	public void testConvert45degreeCelsiusToFarenheit() {
		Temperature junit =new Temperature();
    double actual = junit.convertToFarenheit(45);
    assertEquals(113, actual);
	}
	

}
