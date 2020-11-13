package junitTest.valid;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//테스트소스
//비밀번호유효성검사 기능을 테스트하기위한 테스트클래스
@RunWith(Parameterized.class)
public class ValidPWTest {
	private String password;
	private boolean isValid;
	private static ValidPW validator;
	
	@BeforeClass
	public static void setUp() { 
		validator= new ValidPW();
		
	}

	public ValidPWTest(String password, boolean isValid) {
		this.password=password;
		this.isValid=isValid;
	}
	@Parameters
	public static Collection passwords() {
		return Arrays.asList(
				new Object[][] {
					{"123f",false},
					{"123",false},
					{"qwertyui12",true},
					{"12345",false},
					{"1p2p3k4k5j",true},
					{"fdfdfdfd",false},
				}
				
				);
				
	}
	@Test
	public void isValidPwWithParams() {
		assertEquals(validator.isValid(this.password),this.isValid);
	}
}
