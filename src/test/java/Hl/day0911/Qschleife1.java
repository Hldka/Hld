package Hl.day0911;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qschleife1 {

/*
1. (for-Schleifen)ProgrammierenSiefor-Schleifen,welchediefolgendenAnforderungenerfu ̈llen.:
• Es sollen alle geraden Zahlen zwischen 35 und 75 ausgegeben werden.
• Es sollen alle Zahlen zwischen 1 und 100 ausgegeben werden welche durch 9 oder 17 teilbar sind.
Fu ̈r jede der Anforderungen soll eine eigene Schleife geschrieben werden.
     */
    public static void main(String[] args) {
/*
        //Es sollen alle geraden Zahlen zwischen 35 und 75 ausgegeben werden.
        for (int i=35;i<75;i++){if (i%2==0){
            System.out.print(i+" ");
        }}
        System.out.println();
        //Es sollen alle Zahlen zwischen 1 und 100 ausgegeben werden welche durch 9 oder 17 teilbar sind.
        for (int i=1;i<101;i++){
            if (i%9==0||i%17==0){
                System.out.print(i+" ");
            }
        }*/
//(while-Schleifen)
//• Schreiben Sie eine while-Schleife die 20 mal “Hallo Welt“ ausgibt. •A ̈ndernSiedieSchleifesoab,dasssieabwechselnd“HalloWelt“und“Ichbinim
//Javakurs“ ausgibt.
/*

        int i=0;

        while (i<=20){
            System.out.println("Hello Welt");
            if (i==20){for (int k=0;k<20;k++){if (k%2==0){
                System.out.println("Hallo Welt ");
            }else {
                System.out.println("Ich bin im JavaKurs");}}}






            i++;}
            */

/*
Zu Beginn der Aufgabe wird u ̈ber einen Scanner eine Zahl eingelesen und in der Variable “zahl “ gespeichert. Schreiben sie Schleifen, welche die folgenden Aufgaben erfu ̈llen:
• Geben sie eine Reihe von Sternen (*) auf der Konsole aus. Die Anzahl der Sterne soll dem Wert von zahl entsprechen.
•A ̈ndernsieIhreSchleifesoab,dasswennderWertvonZahldurch16teilbaristfol- gendes Muster statt Sterne ausgegeben wird: *+*
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte eien Zahl geben");
        int zahl= scan.nextInt();
        for (int m=1;m<=zahl;m++){String ch="*";
        if (m%16==0){ ch="*+*";}
            System.out.print(ch+" ");

        }


    }
}
