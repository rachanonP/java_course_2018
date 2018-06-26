package book;

import java.util.Objects;

//POJO (Paint Old Java Object) Getter, Setter
public class Book {

    //variable
    //static variable
    private static final String QTY = "";
    // --> final is immutable. can't implement variable. but variable is null can first implement
    //non static
    private String name;
    private double price;
    private int stock;

    //constructor
    public Book(String name, double price, int stock) {
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //method
    // --> public
    // --> private

    public static Book createHarryPotterOne() {
        return new Book("H1", 8, 2);
    }

    public static Book createHarryPotterTwo() {
        return new Book("H2", 8, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                stock == book.stock &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, stock);
    }

    public double getPrice() {
        return this.price;
    }
}
