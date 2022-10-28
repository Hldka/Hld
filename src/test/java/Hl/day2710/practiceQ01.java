package Hl.day2710;

public class practiceQ01 {/*
   Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz
   {4,6,5,-10,8,5,20} ===> 10
   4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
   */
    public static void main(String[] args) {
int []arr={4,6,5,-10,8,5,20};
ikilileribul(arr,10);


    } public static void ikilileribul (int []arr,int number){
        for (int i=0;i< arr.length;i++){for (int j=0;j< arr.length;j++){
            if (i+j==10){
                System.out.println( i+" +"+j+" ="+(i+j));
            }
        }

        }

    }
}
