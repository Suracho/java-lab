package com.suraj.train.labFour.exThree.item.writtenItem;

public class JournalPaper extends WrittenItem{
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public JournalPaper(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }
}
