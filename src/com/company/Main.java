package com.company;

import java.io.File;
import java.sql.SQLOutput;
import java.util.concurrent.ExecutionException;

class Main {

    public static String userDir;

    public static void main(String[] args) {
	// write your code here

        String searchWord = "READ";
        userDir = System.getProperty("user.dir");
        File filesDir = new File(userDir);
        findFiles(searchWord, filesDir);

    }

    public static void findFiles(String searchWord, File files){
        File[] fileDirectory = files.listFiles();
        for(File file : fileDirectory){
            if(file.isDirectory()){
                findFiles(searchWord, file);
            } else {
                String fileName = file.getName();
                if (fileName.contains(searchWord)) {
                        System.out.println(userDir + "\\" + file);
                }
            }
        }
    }
}
