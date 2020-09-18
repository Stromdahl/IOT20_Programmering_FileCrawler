package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.concurrent.ExecutionException;
import java.util.Scanner;

class Main {
    public static String userDir;
    public static void main(String[] args) {
        // write your code here
        String searchWord = "READ";
        userDir = System.getProperty("user.dir");
        File filesDir = new File(userDir);
        findFiles(searchWord, filesDir);
    }
    public static boolean fileContains(File file, String searchWord){
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.contains(searchWord))
                {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(file.getAbsolutePath());
        }
        return false;
    }
    public static void findFiles(String searchWord, File files){
        File[] fileDirectory = files.listFiles();
        for(File file : fileDirectory){
            if(file.isDirectory()){
                findFiles(searchWord, file);
            } else {
                String fileName = file.getName();
                
                if (fileContains(file, searchWord)) {
                        System.out.println(userDir + "\\" + file);
                }
            }
        }
    }
}
