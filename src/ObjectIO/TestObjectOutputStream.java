package ObjectIO;
import java.io.*;

import java.io.ObjectOutputStream;

/**
 * Created by jortiz on 11/19/15.
 */
public class TestObjectOutputStream  {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        output.writeUTF("Joe");
        output.writeDouble(89.1);
        output.writeObject(new java.util.Date()); /**Writing object to a file on the byte level**/
        output.close();
    }
}


