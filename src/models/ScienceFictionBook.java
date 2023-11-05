package models;

import interfaces.Book;

public class ScienceFictionBook implements Book{


    @Override
    public void detailsBook() {
        System.out.println("New book of a kind science fiction has been add.");
    }

    @Override
    public String getTypeBook() {
        return "science fiction";
    }
}
