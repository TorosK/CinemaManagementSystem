package com.Cinema.CinemaManagerSystem;

public class Movie {

    private int id;
    private String name;
    private String genre;
    private String duration;
    private String movieDescription;
    private boolean isAvailable;

    public Movie(){
        this.isAvailable = true;
    }

    public Movie(int id, String name, String genre, String duration, String movieDescription, boolean available){
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.movieDescription = movieDescription;
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}