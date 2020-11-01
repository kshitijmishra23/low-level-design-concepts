package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeFileWriteUtil {
	
	public static void fileWrie(Path path, StringBuilder sb)
	{
		try {
			Files.write(path, sb.toString().getBytes());
		} catch (IOException e) {
			System.out.println("ERROR: Could not save employee. " + e);
		}
	}

}
