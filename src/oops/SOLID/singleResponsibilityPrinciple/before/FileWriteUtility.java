class FileWriteUtility{
    static public void fileWrite(Path path, String str){            
        Files.write(path, str.getBytes());            
    }
}
