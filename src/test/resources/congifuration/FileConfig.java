package congifuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileConfig {

	public static Properties property;
	private static String configPath="src\\test\\resources\\congifuration\\confi.properties";
	
	public static void fileReader() {

		property = new Properties();
		
		FileInputStream stream;
		try {
			stream = new FileInputStream(configPath);
			property.load(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	
}
