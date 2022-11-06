package Hl.day0611;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Kacinci asal sayiyi ögrenmek istiyorsunuz ? : ");
    int n = sc.nextInt();
    int num=1, count=0, i;
    //n'inci sayiya varana kadar döngü devam etsin
        while (count < n) {
        //2'den, yani ilk asal sayidan basliyoruz.
        num=num+1;
        for (i = 2; i <= num; i++) {
            //bolunen bir sayi varsa dongüden cik. Sayiyi bir artirip devam et
            if (num % i == 0) {
                break;
            }
        }
        //döngüden hicbir sayiya bölünmeden döngüden cikan sayi asaldir. Bunu da i'nin sayiya kadar gelmesinden anlariz.
        // Bu nedenle sayaci bir atiririz.
        if (i == num) {
            count = count+1;
        }
    }
        System.out.println(n +". asal sayi: " + num);
}}
