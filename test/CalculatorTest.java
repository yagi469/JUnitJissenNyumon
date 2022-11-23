import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test(expected = IllegalArgumentException.class)
	void divide_yIsZero_throwIllegalArgumentException() throws Exception {
		Calculator sut = new Calculator();
		sut.divide(1, 0);
	}

}
