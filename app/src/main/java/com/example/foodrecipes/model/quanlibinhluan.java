package com.example.foodrecipes.model;

public class quanlibinhluan {
    private String name, comment;
    private int image;

    public quanlibinhluan(String name, String comment, int image) {
        this.name = name;
        this.comment = comment;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
