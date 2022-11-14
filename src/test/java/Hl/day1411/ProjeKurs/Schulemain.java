package Hl.day1411.ProjeKurs;

import java.util.ArrayList;
import java.util.Scanner;

public class Schulemain {
    public static void main(String[] args) {


    Schule schule1=new Schule("Blanc Fisher Schule",3);
ArrayList<Schüler> schuleSchülerin= (ArrayList<Schüler>) schule1.getSchülerin();

int anzahldenSchüler =1;
Scanner scan=new Scanner(System.in);
Scanner scan1=new Scanner(System.in);
do {
    System.out.println(anzahldenSchüler+".Schüler Name: ");
    String schlrNachname=scan.nextLine();
    System.out.println(anzahldenSchüler+".Schüler vorname");
    String schlervorhname=scan.nextLine();
    System.out.println(anzahldenSchüler+".Schüler ages");
    int age=scan1.nextInt();
    try {
        Schüler schlr=new Schüler(schlrNachname,schlervorhname,age);
        schuleSchülerin.add(schlr);
        anzahldenSchüler++;
    }catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println("bitte neue schüler schreiben");
    }
}while (anzahldenSchüler<=schule1.getMaxSchüler());
for (Schüler schlr:schule1.getSchülerin()){
    System.out.println("Schüler= "+schlr);
}



}}
