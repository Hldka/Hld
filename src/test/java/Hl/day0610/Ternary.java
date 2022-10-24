package Hl.day0610;

public class Ternary {
    public static void main(String[] args) {
        String a="kara kara dusunme ankara";
        int i1=a.indexOf('a',a.indexOf('a'));
        System.out.println(i1); //ilk a 1
        int i2=a.indexOf('a',a.indexOf('a')+1);
        System.out.println(i2);//ikinci. a 3
        int i3=a.indexOf('a',a.indexOf('a',a.indexOf('a')+1)+1);
        System.out.println(i3);//üçüncü a 6
        System.out.println( a.lastIndexOf('a'));
    }

}
