import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("toSnakeCaseはスネークケースを返す_aaaの場合")
	void toSnakeCase_aaa() {
		assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
	}

}
