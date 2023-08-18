package sg.edu.rp.c346.id22014093.mymovies;

import java.util.Calendar;

import java.util.Calendar;

public class Movie {
    private String title;
    private int year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String showing;
    private String description;

    public Movie(String title, int year, String rated, String genre, Calendar watched_on, String showing, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.showing = showing;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatchedOn() {
        return watched_on;
    }

    public void setWatchedOn(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getShowing() {
        return showing;
    }

    public void setShowing(String showing) {
        this.showing = showing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

