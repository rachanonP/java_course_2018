package com.example.demo;

import com.example.demo.book.BookItem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<BookItem> bookItem = new ArrayList<BookItem>();
    private double totalPrice;
    private double discount;
    private double netPrice;

    public int getBookAmount() {
        return this.bookItem.size();
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getNetPrice() {
        return this.netPrice;
    }

    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }

    public void process() {
        if (!this.bookItem.isEmpty()) {

            calculateTotalPrice();
            calculateDiscount();

            this.netPrice = getTotalPrice() - getDiscount();
        }
    }

    private void calculateDiscount() {
        this.discount = 0;
        if (getBookAmount() == 2) {
            this.discount = getTotalPrice() * 0.05;
        } else if (getBookAmount() == 3) {
            this.discount = getTotalPrice() * 0.1;
        }
    }

    private void calculateTotalPrice() {
        for (BookItem book : this.bookItem) {
            this.totalPrice += book.getTotalPrice();
        }
    }
}
