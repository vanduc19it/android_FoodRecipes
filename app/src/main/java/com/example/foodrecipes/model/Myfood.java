package com.example.foodrecipes.model;

public class Myfood {
    private String name,mota;
    private int imgperson,imgfood;

    public Myfood(String name, String mota, int imgperson, int imgfood) {
        this.name = name;
        this.mota = mota;
        this.imgperson = imgperson;
        this.imgfood = imgfood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImgperson() {
        return imgperson;
    }

    public void setImgperson(int imgperson) {
        this.imgperson = imgperson;
    }

    public int getImgfood() {
        return imgfood;
    }

    public void setImgfood(int imgfood) {
        this.imgfood = imgfood;
    }
}
