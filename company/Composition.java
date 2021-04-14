package com.company;

/**
 * Composition - музыкальные композиции , у которых есть имя исполнителя (группы) и название
*/
public class Composition {
    private String Title;
    private String ArtistName;

    public Composition(String title, String artistName) {
        Title = title;
        ArtistName = artistName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }
}
