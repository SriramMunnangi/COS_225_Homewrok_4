package Homework_4;
class Book {
    private String title;
    // Parameterized constructor
    public Book(String title, String genre) {
        this.title = title;
    }

    // ToString method to print only the title of the book
    @Override
    public String toString() {
        return title;
    }

    

}