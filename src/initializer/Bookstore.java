package initializer;

import models.Book;
import publisher.EventManager;

import java.util.ArrayList;

public class Bookstore {
    private final EventManager events;
    private static Bookstore instance;
    private static ArrayList<Book> storageBooks;
    private Bookstore(ArrayList<Book> listBooks, EventManager eventManager) {
        events = eventManager;
        storageBooks = listBooks;

    }
    public static Bookstore getInstance() {
        if (instance == null) {
            ArrayList<Book> newListBook = new ArrayList<Book>();
            EventManager newEventManager = new EventManager("romance", "science fiction");
            instance = new Bookstore(newListBook, newEventManager);
        }
        return instance;
    }

    public void addBook(Book book) {
        storageBooks.add(book);
        System.out.println("Livro adicionado na livraria");
        events.notify(book.getTypeBook(), String.format("New book of a kind %s has been add.", book.getTypeBook()));
    }

    public ArrayList<Book> listAllBooks(){
        return storageBooks;
    }

    public EventManager getEvents(){
        return events;
    }

}
