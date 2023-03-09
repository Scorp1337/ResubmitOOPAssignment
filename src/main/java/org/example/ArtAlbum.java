package org.example;

public class ArtAlbum extends Book {

    private int paperQuality;

    public ArtAlbum(String name, int numberOfPages, int paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public int getPaperQuality() {
        return paperQuality;
    }
}
