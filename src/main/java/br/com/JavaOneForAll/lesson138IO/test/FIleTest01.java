package br.com.JavaOneForAll.lesson138IO.test;

import java.io.File;
import java.io.IOException;

public class FIleTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\guilh\\OneDrive\\Documentos\\JavaOneForALL\\src\\main","fileTest.txt");

        boolean isCreated = file.createNewFile();
        System.out.println("is created " + isCreated);
        boolean exists = file.exists();
        System.out.println("exists: " + exists);
        System.out.println("path " + file.getPath());
        System.out.println("Absolute path " + file.getAbsolutePath());
        System.out.println("is file " + file.isFile());
        System.out.println("is directory " + file.isDirectory());
        System.out.println("is hidden " + file.isHidden());
//        if (exists) {
//            boolean isDeleted = file.delete();
//            System.out.println("deleted " + isDeleted);
//        }


    }}




