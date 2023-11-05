package models;

public class Book {
    private String name;
    private double value;
    private interfaces.Book typeBook;

    public Book(String name, double value, interfaces.Book typeBook) {
        this.name = name;
        this.value = value;
        this.typeBook = typeBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public String getTypeBook() {
        return typeBook.getTypeBook();
    }

}
