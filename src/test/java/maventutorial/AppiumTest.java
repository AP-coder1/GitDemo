package maventutorial;

import org.testng.annotations.Test;

//go to command prompt--> C:\Users\aditya\eclipse-workspaceNew2\Mavenjava>-->mvn clean -->mvn compile --> mvn test
public class AppiumTest {
	
	@Test
	public void NativeAppAndroid() {
		
		System.out.println("NativeAppAndroid");
	}
	
	@Test
	public void IOSApps() {
		
		System.out.println("IOSApps");
		
	}

}
