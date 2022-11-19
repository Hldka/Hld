package Hl.day1911practicetekrar;

public class MD_Array {
    /*
    girilen multidimensional arraydeki cift sayilari toplayan bir method yaziniz
    inpu ={{1,3,6},{2,8},{5,7,9,14}}
    output= araydeki cift sayilarin toplami

    */
    public static void main(String[] args) {
        int [][]arr={{1,3,6},{2,8},{5,7,9,14}};
        ciftsayitopla(arr);
        System.out.println(ciftsayitopla(arr));
    }

    private static int  ciftsayitopla(int[][] arr) {
        int topm=0;

        for (int [] w:arr
             ) {
            for (int w1:w) { if (w1%2==0){topm+=w1;}
                
            }
            
        }
      return topm;
    }
}
