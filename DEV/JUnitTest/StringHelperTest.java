import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTest {

	@Test
	public void test() {
		StringHelper sh = new StringHelper();
		String actual = sh.truncateaInFirst2Position("BACDA");
		String expected = "CDA";
		assertEquals(actual,expected);
	}
	@Test
	public void test1() {
		StringHelper sh = new StringHelper();
		String actual = sh.truncateaInFirst2Position("ACDA");
		String expected = "CDA";
		assertEquals(actual,expected);
	}
	@Test
	public void test2() {
		StringHelper sh = new StringHelper();
		String actual = sh.truncateaInFirst2Position("AA");
		String expected = "";
		assertEquals(actual,expected);
	}
	@Test
	public void test3() {
		StringHelper sh = new StringHelper();
		String actual = sh.truncateaInFirst2Position("AADA");
		String expected = "DA";
		assertEquals(actual,expected);
	}

}
