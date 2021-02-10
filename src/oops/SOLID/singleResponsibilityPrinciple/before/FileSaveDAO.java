package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSaveDAO {

	public FileSaveDAO(Employee employee, StringBuilder sb) throws IOException {
		Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
		try {
			Files.write(path, sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
