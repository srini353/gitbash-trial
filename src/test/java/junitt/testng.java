package junitt;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng {
	
		@Test
		public void test1() {
			System.out.println("test1");
		}
		@AfterSuite
		public void aftersuite() {
			System.out.println("aftersuite");
		}
		@BeforeMethod
		public void beforemethod() {
			System.out.println("before method");
		}
		@BeforeSuite
		public void beforesuite() {
			System.out.println("before suite");
		}
		@AfterMethod
		public void aftermethod() {
			System.out.println("aftermethgod");
		}
		@Test
		public void test2() {
			System.out.println("test2");
		}

		@Test
		public void aftertest() {
			System.out.println("aftertest");
		
		}
		@Test
		public void beforetest() {
			System.out.println("beforetest");
		}

	}

