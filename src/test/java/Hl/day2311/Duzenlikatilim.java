package Hl.day2311;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Duzenlikatilim {
    public static void main(String[] args) {


    HashMap<String, String> eslesme = new HashMap<>();
    Set<String> grupSet = eslesme.keySet();
    List<String[]> list = new ArrayList<>();

    String isimler1[] = {"Ayse Bay","Betül S.","Ebubekir","Fatih H.","Halide k","Kamuran","Ömer Celebi","Recep","Ridvan A.","Semra",
            "Yasin Aky","Yavuz Selim","Yunus"};
    String isimler2[] = {"Ayse Bay","Betül S.","Ebubekir","Fatih H.","Halide k","Kamuran","Ömer Celebi","Recep","Ridvan A.","Semra",
            "Yasin Aky","Yavuz Selim","Yunus"};

/*
{"Ayse Bay","Betül S.","Ebubekir","Fatih H.","Halide k","Kamuran","Ömer Celebi","Recep","Ridvan A.","Semra",
"Yasin Aky","Yavuz Selim","Yunus"}
 */
    boolean secim = true;
    while (secim) {
        int isim1 = (int) (Math.random() * 3);
        int isim2 = (int) (Math.random() * 6);
        if (list.size()<=1) {
            list.add(isimler1);
            if (!grupSet.contains(isimler1[isim1])) {
                eslesme.put(isimler1[isim1], isimler2[isim2]);
            }
        }else{
            secim = false;
        }


    }

    System.out.println(eslesme);
}}
