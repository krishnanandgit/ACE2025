package package1;

import java.util.Date;

public class Album {
    private int albumId;
    private int artistId;
    private String title;
    private int genreId;
    private Date releaseDate;

    public Album(int albumId, int artistId, String title, int genreId, Date releaseDate) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.title = title;
        this.genreId = genreId;
        this.releaseDate = releaseDate;
    }

    // Getters and setters

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}