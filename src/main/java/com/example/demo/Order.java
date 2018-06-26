package com.example.demo;

import java.util.ArrayList;

public class Order {

    private ArrayList<BookItem> bookItem = new ArrayList<BookItem>();
    private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;

    public int getBookAmount() {
        return this.bookAmount;
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

            this.bookAmount = this.bookItem.size();

            for (BookItem book : this.bookItem) {
                this.totalPrice += book.getTotalPrice();
            }

            this.discount = 0;
            if (getBookAmount() == 2 ) {
                this.discount = getTotalPrice() * 0.05;
            }

            this.netPrice = getTotalPrice() - getDiscount();
        }
    }
}
