package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeFileWriter implements Writer<Employee> {

    private static final String FILE_EXTENSION = "rec";

    private final Serializer<Employee, String> serializer;

    public EmployeeFileWriter(final Serializer<Employee, String> serializer){
        this.serializer = serializer;
    }

    @Override
    public void write(final Employee employee) throws IOException {
        final Path path = Paths.get(getFileName(employee.getFullName()));
        Files.write(path, serializer.serialize(employee).getBytes());
        System.out.println("Saved employee: " + employee.toString());
    }

    private String getFileName(final String employeeName){
        return employeeName.replace(" ", "_") + "." + FILE_EXTENSION;
    }
}
