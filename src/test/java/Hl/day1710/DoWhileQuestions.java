package Hl.day1710;

public class DoWhileQuestions {
    public static void main(String[] args) {
        //What will the following code print when compiled and run:
        int k=2;
        do {
            System.out.println(k);
        }while (--k>0);

        int i=1, j=10;
        int m=1;
        do {
            System.out.println("iteration "+m+": i="+i+" j="+j);
            m++;
            if (i++>--j){continue;}
        }while (i<5);
        System.out.println("i= "+i+ " J="+j);
        int count=0,sum=0;
        do {
            if (count%3==0) continue;sum=sum+count;
        }while (count++<11);
        System.out.println(sum);
/*
Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
Integer arr[] = {4, 6, 5, -10, 8, 5, 20}; int num = 10;
for(int i=0; i<arr.length; i++) {
for(int j=i+1; j<arr.length; j++) { if(arr[i]+arr[j]==num) {
System.out.println(arr[i] + " + " + arr[j] + " = " + num); }
} }
 */
    }
}
