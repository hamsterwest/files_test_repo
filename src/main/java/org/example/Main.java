package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File test;

        Path path_test = Paths.get("C:\\\\Users\\\\Lyubanya\\\\Desktop\\\\testFile.txt");
        if(!Files.exists (path_test))
        {
            test = new File("C:\\\\Users\\\\Lyubanya\\\\Desktop\\\\","testFile.txt");
        }

        Path path_read = Paths.get("C:\\\\Users\\\\Lyubanya\\\\Desktop\\\\read_file.txt");

        try {
            File read_test = new File("C:\\\\Users\\\\Lyubanya\\\\Desktop\\\\read_file.txt");
            FileReader fr = new FileReader(read_test);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
//            System.out.println(e);
            e.printStackTrace();
        }

//        File output = new File("output.txt");
//        FileWriter writer = new FileWriter(output);
//
//        writer.write("This text was written with a FileWriter");
//        writer.flush();
//        writer.close();

        //TODO:


//        Path path = Paths.get("C:\\\\Users\\\\Lyubanya\\\\Desktop\\\\testFile.txt");
        String someString = "Hello World";

        byte[] bytes = someString.getBytes();
        String named = "dusya_kukusya";

        try {
            Files.write(path_test, bytes);
            Files.write(path_test, "\nlalalalalal".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println(ex);
        }

//        try {
//
//        }
//        catch (IOException ex){
//
//        }
    }
}