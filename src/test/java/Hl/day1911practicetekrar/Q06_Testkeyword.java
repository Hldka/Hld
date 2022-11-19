package Hl.day1911practicetekrar;

public class Q06_Testkeyword {
    /*
    8  nolu ogrencinin 7 dogru cevabi var.
     */
    public static void main(String[] args) {
        char[][] answers= {
                {'A','B','C','C','D','E','E','A','D'},
                {'D','B','C','C','D','E','E','A','D'},
                {'E','B','C','C','D','E','E','A','D'},
                {'C','B','C','C','D','E','E','A','D'},
                {'A','B','C','C','D','E','E','A','D'},
                {'B','B','C','C','D','E','E','A','D'},
                {'B','B','C','C','D','E','E','A','D'},
                {'E','B','E','C','D','E','E','A','D'}};

            char[] keys=   {'B','B','C','C','D','E','E','A','D'};
            testSonucu(answers,keys);

    }

    private static void testSonucu(char[][] answers, char[] keys) {
        for (int i=0; i<answers.length;i++){
            int sayac=0;
     for (int j=0;j< answers[i].length;j++){
         if (answers[i][j] == keys[j]){
             sayac++;
         }
     }
            System.out.println(i+1+" nolu ögrenci dogru cevbi "+ sayac);
        }



    }}

