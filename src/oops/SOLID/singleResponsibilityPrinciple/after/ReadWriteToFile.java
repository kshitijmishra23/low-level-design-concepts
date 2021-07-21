package oops.SOLID.singleResponsibilityPrinciple.after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteToFile {
	public static void readWriteToFile( String fileName , byte[] data) throws IOException {
		  Path path = Paths.get(fileName);
		//  System.out.println(path);
		  Files.write(path, data);
          
	}

	
}
