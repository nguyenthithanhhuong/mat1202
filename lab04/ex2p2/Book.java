package lab04.ex2p2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book[name = ").append(name).append(", authors = {");
        for (Author author: authors) {
            sb.append(author.toString()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("}, price = ").append(price).append(", qty = ").append(qty).append("]");
        return sb.toString();
    }

    public String getAuthorNames() {
        StringBuilder sb = new StringBuilder();
        for (Author author: authors) {
            sb.append(author).append(",");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
}
