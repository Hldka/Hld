package Hl.day0711;

public class Exception03 {
    public static void main(String[] args) throws IllegalGradeException {
        IllegalGradeException ige=new IllegalGradeException("abc...");
        printGrades(80);
        checkNameFormat("Ali");

    }
    //Ögrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100'den cok olamaz");
        }else {
            System.out.println(grade);
        }
    }
    //verilen ismin ilk harfinin büyük harf olmamasi durumda exception veren kodu yaziniz

    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("isimler büyük harfle baslamalidir");
        }

    }
}
