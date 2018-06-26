package com.example.demo;

import book.Book;
import book.BookItem;
import book.Order;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void createEmptyOrder() {
        Order order = new Order();
        assertEquals(0, order.getBookAmount());
        assertEquals(0, order.getTotalPrice(), 2);
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(0, order.getNetPrice(), 2);
    }

    @Test
    public void createOrderWithOneBook() {
        Book book1 = new Book("H1",8,2);
        BookItem bookItem = new BookItem(book1, 1);
        Order order = new Order();
        order.addItem(bookItem);
        order.process();

        assertEquals(1, order.getBookAmount());
        assertEquals(8, order.getTotalPrice(), 2);
        assertEquals(0, order.getDiscount(), 2);
        assertEquals(8, order.getNetPrice(), 2);

    }

    @Test
    public void createOrderWithTwoBook() {
        Book book1 = new Book("H1",8,2);
        Book book2 = new Book("H2",8,2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.process();

        assertEquals(2, order.getBookAmount());
        assertEquals(16, order.getTotalPrice(), 2);
        assertEquals((16 * 0.05), order.getDiscount(), 2);
        assertEquals(16 - (16 * 0.05), order.getNetPrice(), 2);
    }

    @Test
    public void createOrderWithThreeBook() {
        Book book1 = new Book("H1",8,2);
        Book book2 = new Book("H2",8,2);
        Book book3 = new Book("H3",8,2);
        BookItem bookItem1 = new BookItem(book1, 1);
        BookItem bookItem2 = new BookItem(book2, 1);
        BookItem bookItem3 = new BookItem(book3, 1);
        Order order = new Order();
        order.addItem(bookItem1);
        order.addItem(bookItem2);
        order.addItem(bookItem3);
        order.process();

        assertEquals(3, order.getBookAmount());
        assertEquals(24, order.getTotalPrice(), 0.0);
        assertEquals((24 * 0.1), order.getDiscount(), 0.0);
        assertEquals(24 - (24 * 0.1), order.getNetPrice(), 0.0);

    }
}

