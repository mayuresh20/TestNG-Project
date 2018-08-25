package firstproject;

import org.testng.annotations.Test;

public class testngexample {

@Test(priority=2,description="this is 2nd priority")	
public void testapp1(){
	
	System.out.println("This is my first test");
	
}

@Test(priority=3,description="this is 3rd priority")	
public void testapp2(){
	
	System.out.println("This is my Second test");
	
}

@Test(priority=1,description="this is 1st priority")	
public void testapp3(){
	
	System.out.println("This is my Third test");
	
}
}
