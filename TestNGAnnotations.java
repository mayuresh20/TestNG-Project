package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a {

	@BeforeSuite //1
	public void setupBrowser(){
		System.out.println("Setup Chrome Browser");
	}
	
	@BeforeTest  //2
	public void launchBrowser(){
		System.out.println("Launch chrome Browser");
	}
	
	@BeforeClass   //3
	public void login(){
		System.out.println("Login to app");
		}
		
    @BeforeMethod   //4
    public void EnterURL(){
    	System.out.println("Enter URL");
    }
    
    @Test    //5
    public void GoogleTitleTest(){
		System.out.println("Google Title Test");
    }
    
    @AfterMethod   //6
    public void logout(){
		System.out.println("Logout to app");
		}
    
    @AfterClass  //7
    public void CloseBrowser(){
		System.out.println("Close the Browser");
		}
    
    @AfterTest  //8
    public void ClearAllCookies(){
		System.out.println("Clear all the Cookies");
		}
    @AfterSuite
    public void generateTestRepoets(){
    	System.out.println("Generate Test Reports");
    }
}

/*  --OUTPUT--

[RemoteTestNG] detected TestNG version 6.14.2
Setup Chrome Browser
Launch chrome Browser
Login to app
Enter URL
Google Title Test
Logout to app
Close the Browser
Clear all the Cookies
PASSED: GoogleTitleTest
*/