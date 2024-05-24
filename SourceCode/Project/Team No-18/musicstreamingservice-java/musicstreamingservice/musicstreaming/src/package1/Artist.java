package package1;

import java.util.List;
import java.util.ArrayList;

public class Artist {
    private int artistId;
    private String name;
    private List<Integer> genreIds;

    public Artist(int artistId, String name) {
        this.artistId = artistId;
        this.name = name;
        this.genreIds = new ArrayList<>();
    }

    // Getters and setters

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void addGenreId(int genreId) {
        this.genreIds.add(genreId);
    }
}