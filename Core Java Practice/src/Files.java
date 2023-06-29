import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {

        /*File Creation can be done using
        File class in java.io or FileOutputStream
        */
        String path = new String("C:\\Users\\Pranav\\IdeaProjects\\ISS_Assignment_Java\\src");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name : " );
        String fileName = sc.nextLine();
        File newFile = new File(path + "\\" + fileName + ".txt");
        newFile.createNewFile();

        /*
        * File writing can be done using
        * 1. writeString
        * 2.FileWriter
        * 3.BufferedWriter
        * 4.FileOutputStream */

        FileWriter fw = new FileWriter(newFile);
        System.out.println("Enter text to write to file : " );
        String toWrite = sc.nextLine();
        fw.write(toWrite);
        fw.close();

        /*File Reading can be done using
        * 1.BufferedReader
        * 2.Scanner
        * 3.File Reader
        * */

        FileReader fr = new FileReader(newFile);
        System.out.println("The contents of the file are : ");
        int i;
        while((i=fr.read())!= -1){
            System.out.print((char)i);
        }
        fr.close();

        /*File Deletion can be done by
         1. delete() form java.io.File
         2. deleteIfExists() from java.nio.Files
         */
        System.out.print("Press 1 to delete file else press 2 :  ");
        int choice = sc.nextInt();
        if(choice == 1){
            if(newFile.delete()){
                System.out.println("File has been deleted");
            }
            else {
                System.out.println("File has not been deleted");
            }
        }

        /*File Permissions*/
        File permissionFile = new File("C:\\Users\\Pranav\\IdeaProjects\\ISS_Assignment_Java\\src\\permissions.txt");
        if(permissionFile.exists()){
            System.out.println("The file is executable? : " + permissionFile.canExecute());
            System.out.println("The file can be read? : " + permissionFile.canRead());
            System.out.println("The file can be written? : " + permissionFile.canWrite());
        }
        else{
            System.out.println("File Doesnt Exist");
        }

        //Setting FileWriting permission to False
        permissionFile.setWritable(false);
        //     Code below gives a FileNotFound Exception

        //        FileWriter f = new FileWriter(permissionFile);
        //        f.write("abcde");
        //        f.close();
    }
}
