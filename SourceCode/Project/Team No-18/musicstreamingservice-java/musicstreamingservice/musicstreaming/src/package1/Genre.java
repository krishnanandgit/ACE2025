package package1;

public class Genre {
    private int genreId;
    private String name;

    public Genre(int genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    // Getters and setters

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}