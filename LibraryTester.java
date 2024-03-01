package Homework_4;
public class LibraryTester {
    public static void main(String[] args) {
        // Instantiate two BookShelf objects
        BookShelf shelfO = new BookShelf();
        shelfO.setFirstLetter('O');

        BookShelf shelfT = new BookShelf();
        shelfT.setFirstLetter('T');

        // Print both BookShelf objects
        System.out.println(shelfO.toString());
        System.out.println(shelfT.toString());

        // Instantiate four Books
        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");

        // Print each of these Books
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        // Attempt to add each Book to both shelves
        shelfO.addBook(book1);
        shelfO.addBook(book2);
        shelfT.addBook(book3);
        shelfT.addBook(book4);

        // Print both BookShelf objects
        System.out.println(shelfO.toString());
        System.out.println(shelfT.toString());
    }
}

