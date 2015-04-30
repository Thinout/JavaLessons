package lesson150430.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ATestTest {
	
	static {
		System.out.println("static init");
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("class init");
	}
	
	{
		System.out.println("init");
	}
	
	public ATestTest() {
		System.out.println("constructor");
	}
	
	@Before
	public void setup() {
		System.out.println("setup");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@AfterClass
	public static void teardropClass() {
		System.out.println("teardrop class");
	}
}
