package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void testNfactorialOne() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(1); //get actual result
		assertEquals("1! = 1", 1,actual,0.0);
	}
	
	@Test
	public void testNfactorialNegativeOne() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(-1); //get actual result
		assertEquals("-1! = -1", -1,actual,0.0);
	}
	
	@Test
	public void testNfactorialNegativeOneDigit() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(-5); //get actual result
		assertEquals("-5! = -120", -120,actual,0.0);
	}

	@Test
	public void testNfactorialNegativeTwoOrMoreDigit() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(-12); //get actual result
		assertEquals("-12! = -479001600", -479001600,actual,0.0);
	}
	
	@Test
	public void testNfactorialPositiveOneDigit() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(5); //get actual result
		assertEquals("5! = 120", 120,actual,0.0);
	}
	
	@Test
	public void testNfactorialPositiveTwoOrMoreDigit() {
		// test using black-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(12); //get actual result
		assertEquals("12! = 479001600", 479001600,actual,0.0);
	}
	
	@Test
	public void testBinarySearchNotInArray() {
		// test using white-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.binarySearch(new int[]{1,2,3,4,5},0); //get actual result
		assertEquals("1 = not in array", 1,actual,0.0);
		
	}
	
	@Test
	public void testBinarySearchStartOfList() {
		// test using white-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.binarySearch(new int[]{1,2,3,4,5},1); //get actual result
		assertEquals("0 index", 0,actual,0.0);
		
	}
	
	@Test
	public void testBinarySearchMiddleOfList() {
		// test using white-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.binarySearch(new int[]{1,2,3,4,5},3); //get actual result
		assertEquals("2 index", 2,actual,0.0);
		
	}
	
	@Test
	public void testBinarySearchEndOfList() {
		// test using white-box testing
		MyCalculator bc = new MyCalculator();
		int actual = bc.binarySearch(new int[]{1,2,3,4,5},5); //get actual result
		assertEquals("4 index", 4,actual,0.0);
		
	}

}
