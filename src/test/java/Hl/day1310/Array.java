package Hl.day1310;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {

int[]stdAges=new int[7];//[0,0,0,0,0,0,0]
        System.out.println(Arrays.toString(stdAges));
        //Arraylere elemanlar nasil eklenir
        stdAges[1]=11;

        System.out.println(Arrays.toString(stdAges));
        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));
//aarayda herhangi bir elemani yazdiriniz
        System.out.println(stdAges[4]);
        //arraydeki en kücük ve en büyük elemani ekrana yazdirin
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);
        //Example 2: stdAges icinddeki tüm elemanlrin toplamini yazdiran kodu yaziniz
        int sum=0;
        for (int i=0;i<stdAges.length;i++){
            sum=sum+stdAges[i];
        }
        System.out.println(sum);
int i=0;
int toplam=0;
while (i<stdAges.length){
    toplam=toplam+stdAges[i];
    i++;

}
        System.out.println(toplam);

int k=0;
int s=0;
do {s=s+stdAges[k];
    k++;
}while (k<stdAges.length);
        System.out.println(s);
        int t=0;
        for (int w:stdAges){
            t=t+w;
        }
        System.out.println(t);
        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";
        int chrsayitplm=0;
        for (String w:stdNames){chrsayitplm=chrsayitplm+w.length();}
        System.out.println(chrsayitplm);


//Example 4: char bir Array olusturunuz 5 eleman ekleyiniz sadec büyük harfleri
        char ch[]={'A','c','D','k','M'};
        for (char w: ch){
        if (w>='A'&& w<='Z'){
            System.out.print(w);
        }
    }}
}
