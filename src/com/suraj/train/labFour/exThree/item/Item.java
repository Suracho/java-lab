package com.suraj.train.labFour.exThree.item;

import java.util.Objects;

abstract public class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id == item.id && numberOfCopies == item.numberOfCopies && Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, numberOfCopies);
    }

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }
}
