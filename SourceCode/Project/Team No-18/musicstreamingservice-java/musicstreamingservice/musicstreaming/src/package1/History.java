package package1;

import java.util.Date;

public class History {
    private int historyId;
    private int userId;
    private int songId;
    private Date timestamp;

    public History(int historyId, int userId, int songId, Date timestamp) {
        this.historyId = historyId;
        this.userId = userId;
        this.songId = songId;
        this.timestamp = timestamp;
    }

    // Getters and setters

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}