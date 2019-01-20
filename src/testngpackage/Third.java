package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Third {
String actualTitle="anish";
String exceptedTitle="ashish";
@Test
public void eleven() {
	Assert.assertEquals(actualTitle, exceptedTitle);
	System.out.println("it is my first test case");
}
@Test
public void nine() {
	Assert.assertEquals(actualTitle, exceptedTitle);
	System.out.println("it is my second test case");
}
@Test
public void anish() {
	System.out.println("it is my four test case");
}
@Test
public void gaurav() {
	System.out.println("it is my five test case");
}
	
	
}
