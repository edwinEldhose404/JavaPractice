package Day12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedWriterReader1 {
    public static void main(String[] args){
        File f = new File("FileHandlingSample");
        File f1 = new File("FileHandlingSample/Sample.txt");
        File f2 = new File("FileHandlingSample/Example.txt");

        if (!f.exists()){
            f.mkdir();
        }

        try{
            f1.createNewFile();
        }catch(IOException e){
            System.out.println("Error during file creation");
        }

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("FileHandlingSample/Sample.txt"));
            bw.write("This is a test");
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("FileHandlingSample/Sample.txt"));
            int file = br.read();

            while(file!= -1){
                System.out.println((char)file);
                file = br.read();
            }

            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
