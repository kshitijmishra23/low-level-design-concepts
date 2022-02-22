package oops.SOLID.singleResponsibilityPrinciple.before;

import java.nio.file.Paths;
class CreatePath{

    public Path getPath(Employee employee){
        return Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
    }
}