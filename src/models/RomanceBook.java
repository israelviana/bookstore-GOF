package models;

import interfaces.Book;

public class RomanceBook implements Book {
    @Override
    public void detailsBook() {
        System.out.println("New book of a kind romance has been add.");
    }

    @Override
    public String getTypeBook() {
        return "romance";
    }
}
