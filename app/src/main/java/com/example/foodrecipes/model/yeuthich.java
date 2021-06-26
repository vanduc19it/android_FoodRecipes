package com.example.foodrecipes.model;

public class yeuthich {
    private int imgyeuthich,imgperson;
    private String nameperson,mota;

    public yeuthich(int imgyeuthich, int imgperson, String nameperson, String mota) {
        this.imgyeuthich = imgyeuthich;
        this.imgperson = imgperson;
        this.nameperson = nameperson;
        this.mota = mota;
    }

    public int getImgyeuthich() {
        return imgyeuthich;
    }

    public void setImgyeuthich(int imgyeuthich) {
        this.imgyeuthich = imgyeuthich;
    }

    public int getImgperson() {
        return imgperson;
    }

    public void setImgperson(int imgperson) {
        this.imgperson = imgperson;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
