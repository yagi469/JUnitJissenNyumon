import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("toSnakeCaseはスネークケースを返す_aaaの場合")
	void toSnakeCase_aaa() {
		assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
	}
	
	@Test
	@DisplayName("toSnakeCaseはスネークケースを返す_HelloWorldの場合")
	void toSnakeCase_HelloWorld() {
		assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
	}
	
	@Test
	@DisplayName("toSnakeCaseはスネークケースを返す_practiceJunitの場合")
	void toSnakeCase_practiceJunit() {
		assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
	}

}
