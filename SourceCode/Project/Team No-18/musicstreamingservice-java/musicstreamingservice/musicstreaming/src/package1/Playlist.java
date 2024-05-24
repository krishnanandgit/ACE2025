package package1;

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private int playlistId;
    private int userId;
    private String name;
    private List<Integer> songIds;

    public Playlist(int playlistId, int userId, String name) {
        this.playlistId = playlistId;
        this.userId = userId;
        this.name = name;
        this.songIds = new ArrayList<>();
    }

    // Getters and setters

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSongIds() {
        return songIds;
    }

    public void addSongId(int songId) {
        this.songIds.add(songId);
    }
}