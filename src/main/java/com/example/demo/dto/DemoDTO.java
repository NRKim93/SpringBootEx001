package com.example.demo.dto;

import java.time.LocalDateTime;

public class DemoDTO {

    private  int id;
    private String wisesaying;
    private String author;
    private LocalDateTime regdate;
    private LocalDateTime editdate;

    public DemoDTO(int id, String wisesaying, String author, LocalDateTime regdate, LocalDateTime editdate) {
        this.id = id;
        this.wisesaying = wisesaying;
        this.author = author;
        this.regdate = regdate;
        this.editdate = editdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWisesaying() {
        return wisesaying;
    }

    public void setWisesaying(String wisesaying) {
        this.wisesaying = wisesaying;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }

    public LocalDateTime getEditdate() {
        return editdate;
    }

    public void setEditdate(LocalDateTime editdate) {
        this.editdate = editdate;
    }
}
