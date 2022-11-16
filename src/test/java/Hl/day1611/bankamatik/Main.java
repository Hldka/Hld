package Hl.day1611.bankamatik;

import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {


    Methodlar musteriNoveSifresi=new Methodlar();
        musteriNoveSifresi.getIdpswrd().put(12345678, 1876);
        musteriNoveSifresi.getIdpswrd().put(22222222, 1234);
        musteriNoveSifresi.getIdpswrd().put(98765432, 1453);
        musteriNoveSifresi.getIdpswrd().put(55554444, 2020);

        musteriNoveSifresi.getDpswrd().put(12345678, 120.0);
        musteriNoveSifresi.getDpswrd().put(22222222, 3000.0);
        musteriNoveSifresi.getDpswrd().put(98765432, 7000.0);
        musteriNoveSifresi.getDpswrd().put(55554444, 50.0);

musteriNoveSifresi.kontrolId();
}}

