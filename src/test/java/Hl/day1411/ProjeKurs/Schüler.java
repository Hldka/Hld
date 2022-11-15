package Hl.day1411.ProjeKurs;

public class Schüler {
    /*
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */

    private String vorname;
    private String nachName;
    int age;
    public Schüler(String vorname, String nachName, int age){
        setNachName(nachName);
        setVorname(vorname);
        setAge(age);

    }

    public String getVorname() {
        return vorname;
    }

    public String getNachName() {
        return nachName;
    }

    public int getAge() {
        return age;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setAge(int age) { if (age>15)
    {throw  new RuntimeException("Bitte achten Sie Age ,es muss 15");

    }
        this.age = age;}

    @Override
    public String toString() {
        return "Schüler{" +
                "vorname='" + vorname + '\'' +
                ", nachName='" + nachName + '\'' +
                ", age=" + age +
                '}';
    }
}
