package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movie_table")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="movie name")
    private String movieName;

    @Column(name="Director")
    private String director;

    @Column(name="YOR")
    private int yearOfReal;

    @Column(name="IMD rating")
    private double rating;


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfReal() {
        return yearOfReal;
    }

    public void setYearOfReal(int yearOfReal) {
        this.yearOfReal = yearOfReal;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movies(String movieName, String director, int yearOfReal, double rating) {
        this.movieName = movieName;
        this.director = director;
        this.yearOfReal = yearOfReal;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movies{"+
                "Movie name="+movieName+'\''+
                ", Director='"+director+'\''+
                ", Year of Release="+yearOfReal+'\''+
                ",Rating="+rating+
                '}';
    }


}
