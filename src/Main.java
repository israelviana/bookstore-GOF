import models.*;
import initializer.Bookstore;


public class Main {
    public static void main(String[] args) {
        //Pegar instancia da biblioteca
        Bookstore bookstore = Bookstore.getInstance();

        //Criando cliente
        Client client1 = new Client();


        //Criar um tipo de livro
        Book bookScienceFictionBook = new Book("Ficcao nome", 50.0, new ScienceFictionBook());

        //Inscrever clientes no tipo do livro que querem
        bookstore.getEvents().subscribe(bookScienceFictionBook.getTypeBook(), client1);

        //Adicionar livro na livraria
        bookstore.addBook(bookScienceFictionBook);

        //Carrinho de compra estrategia
        ShoppingCart cart = new ShoppingCart();

        // Define a estratégia de desconto como DescontoEstudante
        cart.setDiscountStrategy(new StudentDiscount());
        System.out.println("Preço final com desconto de estudante: " + cart.calcularDesconto(bookScienceFictionBook.getValue()));

        // Altera a estratégia de desconto para DescontoBlackFriday
        cart.setDiscountStrategy(new BlackFridayDiscount());
        System.out.println("Preço final com desconto de Black Friday: " + cart.calcularDesconto(bookScienceFictionBook.getValue()));

    }
}