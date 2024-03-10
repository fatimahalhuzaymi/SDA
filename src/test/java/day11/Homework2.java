package day11;

import day08.utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

public class Homework2 extends TestBase {

    //Create a File on Desktop
    //Verify that the file exists



    public static void main(String[] args) {
        //C:\Users\hp-pc\Desktop\fileT2
        String userHome = System.getProperty("user.home");
        String sepertor = System.getProperty("fileT2.separator");
        System.out.println("userHome = " + userHome);
        System.out.println("sepertor = " + sepertor);


        String path =userHome + sepertor + "FileExist";

        System.out.println("path = " + path);
        boolean isExists = Files.exists(Path.of(path));
        System.out.println("isExists = " + isExists);

}
}