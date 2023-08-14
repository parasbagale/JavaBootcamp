package week4.day1;


import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }
}

public class ArrayListToStoreBookList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        int yearThreshold = 2000;

        for (Book book : books) {
            if (book.getYearPublished() > yearThreshold) {
                System.out.println(book);
            }
        }
    }
}