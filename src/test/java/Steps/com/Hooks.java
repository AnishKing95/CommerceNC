package Steps.com;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

import Initialization.Initialization;
import congifuration.FileConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Initialization {

	@Before
	public static void setup() {

		FileConfig.fileReader();
		Initialization.getAllObjects();

		
	}

	@AfterClass
	public static void tearDown() {

		driver.close();
		driver.quit();
		

	}
}
