package br.com.JavaOneForAll.lesson138IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {

    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write("Hello everyone!");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
