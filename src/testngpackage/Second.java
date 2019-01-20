package testngpackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Second {
	@Test
	public void five() {
		System.out.println("it is my fifth test case");
	}
	@Test
	public void six() throws Exception {
		System.out.println("it is my sixth test case");
		throw new  SkipException("error");
	}
	@Test
	public void seven() throws Exception {
		System.out.println("it is my seventh test case");
		throw new SkipException("error");
	}
	@Test
	public void eight() {
		System.out.println("it is my eighth test case");
	}
}
