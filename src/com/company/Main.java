package com.company;

import java.io.File;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String userDir = System.getProperty("user.dir");

        File filesDir = new File(userDir);

        String[] fileNames = filesDir.list();
        //String[] files = {"ost", "hamburgare", "tacos"};

        for(String file : fileNames){
            System.out.println(file);
        }

    }
}
