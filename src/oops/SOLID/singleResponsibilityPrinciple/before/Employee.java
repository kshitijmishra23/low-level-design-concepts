package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Models an employee form a business perspective
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    public Employee(String fullName, int monthlyIncome){
        setMonthlyIncome(monthlyIncome);

        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getEmail() {
        return this.firstName + "." +
                this.lastName +
                "@globomanticshr.com";
    }

    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName + " - " +
                this.monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if(monthlyIncome < 0){
            throw new IllegalArgumentException("Income must be positive");
        }

        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        if(nbHoursPerWeek <= 0){
            throw new IllegalArgumentException("Income must be positive");
        }

        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public  void save(){
        try {
            saveUtility.employeeFileSaveUtil(this);
            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
    class saveUtility{
        static public employeeFileSaveUtil(Employee e){
            String empString;            
            empString = SerailizeUtility.serailizeEmployee(e);
            Path path = Paths.get(e.getFullName().replace(" ","_") + ".rec");
            FileWriteUtility.fileWrite(path, empString);
        }
    }
    class SerailizeUtility{
        static public String serailizeEmployee(Employee e){
            Employee employee =e;
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD ####");
            sb.append(System.lineSeparator());
            sb.append("NAME: ");
            sb.append(employee.firstName + " " + employee.lastName);
            sb.append(System.lineSeparator());
            sb.append("POSITION: ");
            sb.append(employee.getClass().getTypeName());
            sb.append(System.lineSeparator());
            sb.append("EMAIL: ");
            sb.append(employee.getEmail());
            sb.append(System.lineSeparator());
            sb.append("MONTHLY WAGE: ");
            sb.append(employee.monthlyIncome);
            sb.append(System.lineSeparator());
            return sb.toString();
        }
    }
    class FileWriteUtility{
        static public fileWrite(Path path, String str){            
            Files.write(path, str.getBytes());            
        }
    }
}
