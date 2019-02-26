package com.detroitlabs.giflibrary.model;

import java.time.LocalDate;

public class Gif {

    String name;
    LocalDate dateUploaded;
    String username;
    boolean favorite;
    String avatarName;
    int id;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int id) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.id = id;
    }



    public String usernameWithoutSpaces() {
        String modifiedName = getUsername().toLowerCase().replace(" ","");
                return modifiedName;
    }


    public String getAvatarName() {
        return avatarName;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
