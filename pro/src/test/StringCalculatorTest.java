package test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringCalculatorTest {
	static StringCalculator sc = null;

	@BeforeClass
	public static void SetUp() { //test 전 객체 생성
		System.out.println("@BeforeClass");
		sc = new StringCalculator();
	}

	@Test
	public void testPlus() { //값이 맞는지 test
		System.out.println("@Test-testPlus()");
		double actual=sc.plus(12.5, 90);
		assertEquals(100,actual,12.5+90);
	}

	@Test
	public void testMinus() { //값이 맞는지 test
		System.out.println("@Test-testMinus()");
		double actual=sc.minus(77.7, 10.2);
		assertEquals(80,actual,77.7-10.2);
	}

	@Test
	public void testClear() { //값이 clear 되는지
		System.out.println("@Test-testClear()");
			sc.clear();
		assertEquals(0,sc.defaultVal,3.5);
	}
}
