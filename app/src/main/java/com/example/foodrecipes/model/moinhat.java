package com.example.foodrecipes.model;

public class moinhat {
    private String nameperson,motamoinhat;
    private int imgperson,imgmoinhat;

    public moinhat(String nameperson, String motamoinhat, int imgperson, int imgmoinhat) {
        this.nameperson = nameperson;
        this.motamoinhat = motamoinhat;
        this.imgperson = imgperson;
        this.imgmoinhat = imgmoinhat;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getMotamoinhat() {
        return motamoinhat;
    }

    public void setMotamoinhat(String motamoinhat) {
        this.motamoinhat = motamoinhat;
    }

    public int getImgperson() {
        return imgperson;
    }

    public void setImgperson(int imgperson) {
        this.imgperson = imgperson;
    }

    public int getImgmoinhat() {
        return imgmoinhat;
    }

    public void setImgmoinhat(int imgmoinhat) {
        this.imgmoinhat = imgmoinhat;
    }
}
