package chapter12;

/* 
 * This program takes command line arguments to remove given text from a 
 * given file.
 * Usage: java RemoveText textToRemove fileName
 * 
 */

import java.util.*;
import java.io.*;

public class RemoveText {
    public static void main(String[] args) throws Exception {
        //check command line input
        if(args.length != 2){
            System.out.println("Usage: java RemoveText textToRemove fileName");
            System.exit(1);
        }

        //Check if file exists
        File sourceFile = new File(args[1]);
        if(!sourceFile.exists()){
            System.out.println("Source file " + sourceFile + " doesn't exist");
            System.exit(2);
        }

        //Create input for source file and write the output to a temporary file
        File tempFile = new File(sourceFile.getParent() + "/output.txt");
        if(tempFile.exists()){
            System.out.println("Target file " + tempFile + " already exists");
            System.exit(3);
        }

        try(
            Scanner inputFile = new Scanner(sourceFile);
            PrintWriter outputFile = new PrintWriter(tempFile, "UTF-8");
        ){
            //crawl the document and remove the given text
            while(inputFile.hasNextLine()){
                String line = inputFile.nextLine();
                String modifiedLine = line.replaceAll(args[0], "");
                outputFile.println(modifiedLine);
            }
        }
    }
    
}
