package chapter12;
/*
 * The purpose of this program is to play with the File class
 */

public class TestFile {
    public static void main(String[] args){
        String fileName = "chapter12//Quotient.java";
        java.io.File file = new java.io.File(fileName);
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + 
            new java.util.Date(file.lastModified()));
        
    }    
}
