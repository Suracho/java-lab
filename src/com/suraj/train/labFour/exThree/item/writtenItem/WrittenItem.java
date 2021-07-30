package com.suraj.train.labFour.exThree.item.writtenItem;

import com.suraj.train.labFour.exThree.item.Item;

import java.util.Objects;

abstract public class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numberOfCopies,String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    @Override
    public String toString() {
        return "WrittenItem{" +
                "author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrittenItem)) return false;
        if (!super.equals(o)) return false;
        WrittenItem that = (WrittenItem) o;
        return Objects.equals(getAuthor(), that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
