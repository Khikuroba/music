package dev.gopro.se.android.mp3clone;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private int resourceId;

    public Song(String title, int resourceId) {
        this.title = title;
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceId() {
        return resourceId;
    }
}
