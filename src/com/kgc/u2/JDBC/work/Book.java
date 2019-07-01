package com.kgc.u2.JDBC.work;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private Integer inventory;

    public Book() {
    }

    public Book(Integer id, String name, String author, Integer inventory) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}
