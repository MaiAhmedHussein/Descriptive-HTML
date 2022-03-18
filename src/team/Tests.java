package team;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tests {

	InputStream input = null;
Hello hello;
	
	@Test
	void test1() throws FileNotFoundException, ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test1.txt");
		//Hello hello = new Hello(input);
		hello.ReInit(input);
	    assertEquals("<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\"/>\n"+ "",hello.words());
	}
	
	@Test
	void test2() throws FileNotFoundException, ParseException
	{
		input = new FileInputStream( System.getProperty("user.dir")+"\\src\\team\\test2.txt");
        hello.ReInit(input);
	    assertEquals("<h1>Hello World</h1>\n",hello.words());
	}
	
	@Test
	void test3() throws FileNotFoundException, ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test3.txt");
		hello.ReInit(input);
	    assertEquals("<p style=\"color:Red;font-family:Arial;\">Welcome</p>\n",hello.words());
	}
	
	@Test
	void test4() throws FileNotFoundException, ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test4.txt");
		hello.ReInit(input);
	    assertEquals("<a href=\"http://gmail.com\" style=\"color:Green;\">Email</a>\n",hello.words());
	}
	
	@Test
	void test5() throws FileNotFoundException, ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test5.txt");
		hello.ReInit(input);
	    assertEquals("<p style=\"font-family:Arial;\">Good bye</p>\n",hello.words());
	}
	
	@Test
	void test6() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test6.txt");
		hello.ReInit(input);
		
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
		
	}
	@Test
	void test7() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test7.txt");
		hello.ReInit(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	@Test
	void test8() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test8.txt");
		hello.ReInit(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	
	@Test
	void test9() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test9.txt");
		hello.ReInit(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
    @Test
	void test10() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test10.txt");
		//hello.ReInit(input);
		Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	@Test
	void test11() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test11.txt");
		hello.ReInit(input);
		//Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	
	@Test
	void test12() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test12.txt");
		hello.ReInit(input);
		//Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	
	@Test
	void test13() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test13.txt");
		hello.ReInit(input);
		//Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	
	@Test
	void test14() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test14.txt");
		hello.ReInit(input);
		//Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	
	@Test
	void test15() throws FileNotFoundException,ParseException
	{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\team\\test15.txt");
		hello.ReInit(input);
		//Hello hello = new Hello(input);
		Assertions.assertDoesNotThrow(() -> {
		       hello.words();
		});
	}
	

}
