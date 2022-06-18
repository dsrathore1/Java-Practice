package com.company;
import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("readFile1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\ap.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
