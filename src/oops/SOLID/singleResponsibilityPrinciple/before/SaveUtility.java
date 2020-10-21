class saveUtility{
    static public employeeFileSaveUtil(Employee e){
        String empString;            
        empString = SerailizeUtility.serailizeEmployee(e);
        Path path = Paths.get(e.getFullName().replace(" ","_") + ".rec");
        FileWriteUtility.fileWrite(path, empString);
    }
}
