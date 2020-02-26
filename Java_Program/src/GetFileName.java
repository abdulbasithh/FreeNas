//This program is meant to get the file names and display them
//@author Abdul Basith Akram

import java.io.File;
import java.util.Scanner;

public class GetFileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        File folder = new File (sc.next()); //Movies File Path
        File [] listOfFiles = folder.listFiles();

        //for loop to get all the names in the folder
        LoopToGetNames:
        for (int i = 0;i<listOfFiles.length;i++ ){
            if (listOfFiles[i].isFile()){
                System.out.println("File " + listOfFiles[i].getName()); //gets the name of the file
            } else if (listOfFiles[i].isDirectory()){
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

    }
}
