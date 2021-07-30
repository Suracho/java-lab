package com.suraj.train.labFour.exThree.item.mediaItem;

import java.util.Objects;

public class Video extends MediaItem{
    private String director;
    private String genre;
    private int year;

    @Override
    public String toString() {
        return "Video{" +
                "director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        if (!super.equals(o)) return false;
        Video video = (Video) o;
        return getYear() == video.getYear() && Objects.equals(getDirector(), video.getDirector()) && Objects.equals(getGenre(), video.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDirector(), getGenre(), getYear());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Video(int runtime, String director, String genre, int year) {
        super(runtime);
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    public Video(int runtime) {
        super(runtime);
    }
}
