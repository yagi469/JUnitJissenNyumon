import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("divideの第2引数に0を指定すると例外が発生する")
	void divide_yIsZero_throwIllegalArgumentException() throws Exception {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Calculator sut = new Calculator();
			sut.divide(1, 0);
		});
	}
}
