package Hl.day0911;

public class Questions {
    /*

18.Soru
Aşağıdaki üçgenin tepesinden başlayıp aşağıdaki sıradaki bitişik sayılara geçerek,
yukarıdan aşağıya maksimum toplam 23'tür.
3
7 4
2 4 6
8 5 9 3
Yani 3 + 7 + 4 + 9 = 23.
Aşağıdaki üçgenin yukarıdan aşağıya maksimum toplamını bulun:
                                              75
                                            95 64
                                          17 47 82
                                        18 35 87 10
                                      20 04 82 47 65
                                    19 01 23 75 03 34
                                  88 02 77 73 07 63 67
                               99 65 04 28 06 16 70 92
                             41 41 26 56 83 40 80 70 33
                          41 48 72 33 47 32 37 16 94 29
                        53 71 44 65 25 43 91 52 97 51 14
                      70 11 33 28 77 73 17 78 39 68 17 57
                   91 71 52 38 17 14 91 43 58 50 27 29 48
                 63 66 04 68 89 53 67 30 73 16 69 87 40 31
               04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
NOT: Sadece 16384 yön olduğu için her yönü deneyerek bu sorunu çözmek mümkündür.
Ancak, 67.soru(henüz paylaşılmadı), yüz satır içeren bir üçgen ile aynı zorluktur;
kaba kuvvetle çözülemez ve akıllıca bir yöntem gerektirir!
     */
    public static void main(String[] args) {
        // 17.Soru
        //1'den 5'e kadar olan sayılar bir, iki, üç, dört, beş kelimelerle yazılırsa, toplamda
        // 3 + 3 + 5 + 4 + 4 = 19 harf kullanılır.
        //1'den 1000'e (bin) kadar olan tüm sayılar kelimelerle yazılsaydı kaç harf kullanılırdı?
        int sayi = 20;
        int birlerBas = (sayi % 10);
        int onlarBas = (sayi / 10) % 10;
        int yuzlerBas = (sayi / 100);

        for (int i = 0; i < sayi; i++) {

            if (sayi > 99 && sayi < 1000) {
                ////100 LER BASAMAGI
                switch (yuzlerBas) {
                    case 0:
                        System.out.print("");
                        break;
                    case 1:
                        System.out.print("Yuz");
                        break;
                    case 2:
                        System.out.print("Ikiyuz");
                        break;
                    case 3:
                        System.out.print("Ucyuz");
                        break;
                    case 4:
                        System.out.print("Dortyuz");
                        break;
                    case 5:
                        System.out.print("Besyuz");
                        break;
                    case 6:
                        System.out.print("Altiyuz");
                        break;
                    case 7:
                        System.out.print("Yediyuz");
                        break;
                    case 8:
                        System.out.print("Sekizyuz");
                        break;
                    case 9:
                        System.out.print("Dokuzyuz");
                        break;
                }
                //////////10 LAR BAS******************\\\\\\\\\\\\
                switch (onlarBas) {
                    case 0:
                        System.out.print("");
                        break;
                    case 1:
                        System.out.print("on");
                        break;
                    case 2:
                        System.out.print("yirmi");
                        break;
                    case 3:
                        System.out.print("otuz");
                        break;
                    case 4:
                        System.out.print("kirk");
                        break;
                    case 5:
                        System.out.print("elli");
                        break;
                    case 6:
                        System.out.print("altmis");
                        break;
                    case 7:
                        System.out.print("yetmis");
                        break;
                    case 8:
                        System.out.print("seksen");
                        break;
                    case 9:
                        System.out.print("doksan");
                        break;
                }
                switch (birlerBas) {
                    case 0:
                        System.out.print("");
                        break;
                    case 1:
                        System.out.print("bir");
                        break;
                    case 2:
                        System.out.print("iki");
                        break;
                    case 3:
                        System.out.print("uc");
                        break;
                    case 4:
                        System.out.print("dort");
                        break;
                    case 5:
                        System.out.print("bes");
                        break;
                    case 6:
                        System.out.print("alti");
                        break;
                    case 7:
                        System.out.print("yedi");
                        break;
                    case 8:
                        System.out.print("sekiz");
                        break;
                    case 9:
                        System.out.print("dokuz");
                        break;
                }


            }

        }
        System.out.println(birlerBas+onlarBas+yuzlerBas);
    }}
