package Hl.day1911practicetekrar;

import java.util.Arrays;

public class MDArray {
    /*
    String 2D array olustur
    {{"$12","$22","0$"},{"€9","€40","$1"},{"€12","$2","$0"}}
    String de $ varsa 3.2 ile carp
    String de € varsa 4.2 ile carp
    elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {

        String[][] arr={{"$12","$22","0$"},{"€9","€40","$1"},{"€12","$2","$0"}};
        String[][] arr1=new String[3][9];
        double toplm=0;
        double tplm1=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i][j].contains("$")){ arr[i][j].replace("$","");
                   toplm+=Double.parseDouble(arr[i][j].replace("$",""))*(3.2);

                }else if (arr[i][j].contains("€")){
                    tplm1+=Double.parseDouble(arr[i][j].replace("€",""))*(4.2);}

            }
            System.out.println(toplm+tplm1);
        }
    }
}
