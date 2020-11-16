package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveEmployeeUtil {
	
	public static StringBuilder serializeEmployeeData(Employee e){
		StringBuilder empData = new StringBuilder();
        
        empData.append("EMPLOYEE RECORD");
        empData.append(System.lineSeparator());
        empData.append("-------------------------------------");
        empData.append(System.lineSeparator());
        
        empData.append("NAME: ");
        empData.append(e.getFirstName() + " " + e.getLastName());
        empData.append(System.lineSeparator());
        
        empData.append("POSITION: ");
        empData.append(e.getClass().getSimpleName());
        empData.append(System.lineSeparator());
        
        empData.append("EMAIL: ");
        empData.append(e.getEmail());
        empData.append(System.lineSeparator());
        
        empData.append("MONTHLY WAGE: ");
        empData.append(e.getMonthlyIncome());
        empData.append(System.lineSeparator());
        
        return empData;
	}
	
	public static Path getPath(String Name){
		Path path = Paths.get(Name.replace(" ","_")+".txt");
		return path;
	}
	
	public static String save(Employee e){
		
		StringBuilder msg = new StringBuilder();
		try{
            StringBuilder empData = serializeEmployeeData(e);
            Files.write(getPath(e.getFullName()), empData.toString().getBytes());
            msg.append("Employee Data saved successfully");
		}
		catch(IOException exp){
			msg.append("ERROR: Could not save employee. " + exp);
		}
		return msg.toString();
	}
	
}
