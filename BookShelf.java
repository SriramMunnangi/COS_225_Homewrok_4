package Homework_4;
import java.util.ArrayList;

public class BookShelf {
    private char firstLetter;
    private ArrayList<Book> books;

    // Default constructor
    public BookShelf() {
        books = new ArrayList<>();
    }

    // Getter and setter for firstLetter
    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    // Method to add a Book to the shelf if the title begins with the correct letter
    public void addBook(Book book) {
        if (book.toString().charAt(0) == firstLetter && books.size() < 8) {
            books.add(book);
        }
    }

    // Method to remove a Book from the shelf
    public void removeBook(Book book) {
        books.remove(book);
    }

    // ToString method to print each Book title in the shelf on a single line
    @Override
    public String toString() {
        if (books.isEmpty()) {
            return "_";
        } else {
            StringBuilder result = new StringBuilder();
            for (Book book : books) {
                result.append(book.toString()).append("   ");
            }
            return result.toString();
        }
    }
}

