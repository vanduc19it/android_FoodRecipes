package com.example.foodrecipes.model;

public class quanlidanhmuc {
    private int image;
    private String tendanhmuc;

    public quanlidanhmuc(int image, String tendanhmuc) {
        this.image = image;
        this.tendanhmuc = tendanhmuc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }
}
