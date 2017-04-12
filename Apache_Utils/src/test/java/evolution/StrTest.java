package evolution;

import org.junit.Test;

public class StrTest {
	@Test
	public void testIsEmpty() {
		Sys.println(Str.isEmpty("Hello World"));
		Sys.println(Str.isEmpty(""));
		Sys.println(Str.isEmpty(null));
		Sys.println(Str.isBlank("Hello World"));
		Sys.println(Str.isBlank(""));
		Sys.println(Str.isBlank(null));
	}
}
