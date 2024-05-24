package package1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Song {
    private int songId;
    private String title;
    private int artistId;
    private int albumId;
    private List<Integer> genreIds;
    private int length; // Length in seconds
    private Date releaseDate;

    public Song(int songId, String title, int artistId, int albumId, int length, Date releaseDate) {
        this.songId = songId;
        this.title = title;
        this.artistId = artistId;
        this.albumId = albumId;
        this.genreIds = new ArrayList<>();
        this.length = length;
        this.releaseDate = releaseDate;
    }

    // Getters and setters

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void addGenreId(int genreId) {
        this.genreIds.add(genreId);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}