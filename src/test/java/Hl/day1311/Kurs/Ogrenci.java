package Hl.day1311.Kurs;

import javax.naming.StringRefAddr;

public class Ogrenci {
    private String name;
    private String surName;
    private int age;
    public  Ogrenci(String name,String surName,int age){
        this.name=name;
        this.surName=surName;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        if (age<15)
        this.age = age;
    }
}
