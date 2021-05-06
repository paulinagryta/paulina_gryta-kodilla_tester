package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("tytul", "autor");
        Book book2 = BookManager.createBook("tytul", "autor");
        System.out.println(book1.equals(book2));


    }
}
