package ObjectIO;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println("Java copy sourcefilea and targetfile don't exist");
            System.exit(0);
        }
        File sourceFile = new File(args[0]);
        if( !sourceFile.exists()){
            System.out.println("Source file doesn't exist");
            System.exit(0);
        }
        File targetFile = new File(args[1]);
        if(targetFile.exists()){
           System.out.println("Target file already exists");
            System.exit(0);
        }
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));

        int r;
        int numberOfBytes = 0;
        while((r = input.read()) != -1){
            output.write((byte)r);
            numberOfBytes++;
        }
        input.close();
        output.close();
    }
}
