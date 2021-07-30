package com.suraj.train.labFour.exThree.item.mediaItem;

import java.util.Objects;

public class CD extends MediaItem{
    private String artist;
    private String genre;

    public CD(int runtime, String artist, String genre) {
        super(runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD)) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return Objects.equals(getArtist(), cd.getArtist()) && Objects.equals(getGenre(), cd.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArtist(), getGenre());
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
