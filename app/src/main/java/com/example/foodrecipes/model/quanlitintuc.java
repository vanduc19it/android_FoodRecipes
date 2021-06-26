package com.example.foodrecipes.model;

public class quanlitintuc {
    private String tieude, ngaydang, nguon;

    public quanlitintuc(String tieude, String ngaydang, String nguon) {
        this.tieude = tieude;
        this.ngaydang = ngaydang;
        this.nguon = nguon;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(String ngaydang) {
        this.ngaydang = ngaydang;
    }

    public String getNguon() {
        return nguon;
    }

    public void setNguon(String nguon) {
        this.nguon = nguon;
    }
}
