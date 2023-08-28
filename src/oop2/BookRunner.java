package oop2;

public class BookRunner {
    public static void main(String[] args) {
        Books books = new Books(123, "Object Oriented Programming with Java", "Ranaga");

        books.addReview(new Review(10, "Great Book", 5));
        books.addReview(new Review(101, "Awesome", 5));

        System.out.println(books);
    }
}
