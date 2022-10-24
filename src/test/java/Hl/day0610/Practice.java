package Hl.day0610;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String isim=input.nextLine();
        String i=isim.trim();

        int bosluk4=i.indexOf(' ',i.indexOf(' ',i.indexOf(' ',i.indexOf(' ')+1)+1)+1);
        String name5=i.substring(bosluk4+1,bosluk4+2).toUpperCase()+i.substring(bosluk4+2).toLowerCase();
        int bosluk3=i.indexOf(' ',i.indexOf(' ',i.indexOf(' ')+1)+1);
        String name4=i.substring(bosluk3+1,bosluk3+2).toUpperCase()+i.substring(bosluk3+2,bosluk4).toLowerCase();
        int bosluk2=i.indexOf(' ',i.indexOf(' ')+1);
        String name3=i.substring(bosluk2+1,bosluk2+2).toUpperCase()+i.substring(bosluk2+2,bosluk3).toLowerCase();
        int bosluk1=i.indexOf(' ',1);
        String name2=i.substring(bosluk1+1,bosluk1+2).toUpperCase()+i.substring(bosluk1+2,bosluk2).toLowerCase();
        String name1=i.substring(0,1).toUpperCase()+i.substring(1,bosluk1).toLowerCase();
        System.out.println(name1+" "+name2+" "+name3+" "+name4+" "+name5);
    }
}
