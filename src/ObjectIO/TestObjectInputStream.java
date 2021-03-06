package ObjectIO;

import sun.awt.image.BufferedImageDevice;

import java.io.*;

public class TestObjectInputStream  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        String name = input.readUTF();
        Double score = input.readDouble();
        java.util.Date date = (java.util.Date) input.readObject();
        System.out.println(name + " " + score + " " + date );
    }
}

