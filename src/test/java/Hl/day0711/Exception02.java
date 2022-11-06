package Hl.day0711;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();
        System.out.println("**************************************************");
        readTheText();


    }



    //bir text File'daki text'i okuyan kodu yaziniz
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis=new FileInputStream("src/test/java/Hl/day0711/File1.txt");

        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }

    }

    //2.way
    public static void readTheText(){
        try {FileInputStream fis=new FileInputStream("src/test/java/Hl/day0711/File1.txt");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        }catch (FileNotFoundException e){
            System.out.println("Dosyanin adresi veya varliginda bir problem var");
        }catch (IOException e){
            System.out.println("Dosya'da okunamayan charakter var");
        }
    }
}
