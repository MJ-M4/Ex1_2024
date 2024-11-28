package Ex1_2024_28_11.Ex1_2024_28_11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
/* Mohmad Jayusi - 322458431
 * Mohamed Mhajne - 207705096  */

public class AppTest {
	question4 tester = new question4();	
    /**
     * Rigorous Test :-)
     */
		@Test
	    public void test_1() {
	      String Expected_result="B";
	      int a=20, b =35;
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 1 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_2() {
	      String Expected_result="A";
	      int a=-2 , b=-11;
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 2 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_3() {
	      String Expected_result="Error";
	      int a=55;
	      String b = "h";
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 3 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_4() {
	      String Expected_result="A";
	      int a=33 ,b =100;
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 4 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);

	    }
		@Test
	    public void test_5() {
	      String Expected_result="B";
	      int a=44 ,b =-17;
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 5 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);

	    }
		@Test
	    public void test_6() {
	      String Expected_result="Error";
	      int a=-88;
	      String b = "W";
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 6 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);

	    }
		@Test
	    public void test_7() {
	      String Expected_result="A";
	      float a=4 ,b =6;
	      String mod="inverse";
	      String actual_result=tester.compare(a, b, mod); 
	      System.out.println("Test 7 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_8() {
	      String Expected_result="B";
	      float a=-1 ,b =-3;
	      String mod="inverse";
	      String actual_result=tester.compare(a, b, mod);
	      System.out.println("Test 8 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_9() {
	      String Expected_result="Error";
	      float a=44;
	      String b = "r";
	      String mod="inverse";
	      String actual_result=tester.compare(a, b,mod);
	      System.out.println("Test 9 : "+Expected_result);
	      assertEquals(Expected_result,actual_result);
	    }		  
}