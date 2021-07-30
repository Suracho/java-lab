package com.suraj.train.labFour.exThree.Demo;

import com.suraj.train.labFour.exThree.item.mediaItem.CD;
import com.suraj.train.labFour.exThree.item.mediaItem.Video;
import com.suraj.train.labFour.exThree.item.writtenItem.Book;
import com.suraj.train.labFour.exThree.item.writtenItem.JournalPaper;



public class Demo {
    public static void main(String[] args) {
        Book book = new Book(2,"The Book",5,"Shakespeare");
        System.out.println(book);

        CD cd = new CD(5,"me","pop");
        System.out.println(cd);

        Video video = new Video(5,"mango","scary",1999);
        System.out.println(video);

        JournalPaper journalPaper = new JournalPaper(5,"Nice Journal",2,"Bill Gates");
        System.out.println(journalPaper);
    }
}
