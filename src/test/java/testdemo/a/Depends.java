package testdemo.a;

import org.testng.annotations.Test;

public class Depends {

	@Test(dependsOnMethods = { "m2" })
	public void m1() {
		System.out.println("i am m1");

	}

	@Test
	public void m2() {
		
		throw new ArithmeticException();

	}

}
