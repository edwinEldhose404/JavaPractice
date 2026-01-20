package Day12;

import java.io.File;
import java.io.IOException;

public class FilePackage{
    public static void main (String[] args){
        //Methods
            //mkdir() - make one directory
            //mkdirs() - multiple directories
            //delete() - delete
            //rename() - rename
            //createNewFile() - check file
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

        System.out.println("F is File: " + f.isFile());
        System.out.println("F1 is File: " + f1.isFile());
        System.out.println("F1's length is : " + f1.length());

        String[] fileList = f.list();
        for (int i=0;i<fileList.length;i++){
            System.out.println(fileList[i]);
        }

        if(f1.renameTo(f2)){
            System.out.println("F1 is renamed to F2");
        }

        if (f1.delete()){
            System.out.println("F1 is deleted");
        }


    }
}