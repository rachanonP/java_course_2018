package book;

public class BookItem {

    private Book book;
    private int quantity;

    public BookItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return book.getPrice() * quantity;
    }
}
