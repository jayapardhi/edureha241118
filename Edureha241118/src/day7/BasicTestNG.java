package day7;

import org.testng.annotations.Test;

public class BasicTestNG {
 @Test
  public void testCase1() {
	  System.out.println("Test case 1");
  }
	

  @Test
	  public void testCase2() {
		  System.out.println("Test case 2");
	  }	  
	
      @Test
	  public void testCase3() {
		  System.out.println("Test case 3");
	  }	   
	   @Test
	  public void testCase4() {
		  System.out.println("Test case 4");	  
	  }
	
   
	  @Test(priority =1)
	  public void testCase11() {
		  System.out.println("Test case 11");
	  }
		  
		  @Test(priority=2)
		  public void testCase44() {
			  System.out.println("Test case 44");
	  }	  
		  
		  @Test(priority=3)
		  public void testCase22() {
			  System.out.println("Test case 22");
	  }	  
		  @Test(priority=4)
		  public void testCase33() {
			  System.out.println("Test case 33");	  
	  }
  
		  @Test(priority =0)
		  public void testCase10() {
			  System.out.println("Test case 10");
		  }
			  
			  @Test(priority=1000)
			  public void testCase40() {
				  System.out.println("Test case 40");
		  }	  
			  
			  @Test(priority=2000 ,enabled= false)
			  public void testCase20() {
				  System.out.println("Test case 20");
		  }	  
			  @Test(priority=3000)
			  public void testCase30() {
				  System.out.println("Test case 30");	  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}
