package junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit { 
@BeforeClass
public static void beforeClass() {
	System.out.println("Before class");
}
@AfterClass
public static void afterclass() {
	System.out.println("After class");
}
@Before
public void before() {
	System.out.println("Before");
}
@After
public void after() {
	System.out.println("after");
}
@Test
public void test1() {
	System.out.println("Test 1");
}
@Test
public void test2() {
	System.out.println("Test 2");
}
}





