package Hl.day2311;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BuchMain {
    public static void main(String[] args) {

        TreeSet<Book> buchs=new TreeSet<>();
        Book book=new Book("Stolz und vorurteil","lgm","Jane Austen",354,"2021");
        Book book1=new Book("Hexe Lili","km","hha",200,"1980");

buchs.add(book);
buchs.add(book1);
    }
}
