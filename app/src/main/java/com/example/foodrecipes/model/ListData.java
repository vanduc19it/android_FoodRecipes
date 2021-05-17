package com.example.foodrecipes.model;

import java.util.List;

public class ListData {
    private int type;
    private List<danhmuc> mliDanhmucs;
    private List<tintuc>  mlistTintuc;
    private List<moinhat> mlistMoinhat;
    private List<yeuthich> mYeuthichList;

    public ListData(int type, List<danhmuc> mliDanhmucs, List<tintuc> mlistTintuc, List<moinhat> mlistMoinhat, List<yeuthich> mYeuthichList) {
        this.type = type;
        this.mliDanhmucs = mliDanhmucs;
        this.mlistTintuc = mlistTintuc;
        this.mlistMoinhat = mlistMoinhat;
        this.mYeuthichList = mYeuthichList;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<danhmuc> getMliDanhmucs() {
        return mliDanhmucs;
    }

    public void setMliDanhmucs(List<danhmuc> mliDanhmucs) {
        this.mliDanhmucs = mliDanhmucs;
    }

    public List<tintuc> getMlistTintuc() {
        return mlistTintuc;
    }

    public void setMlistTintuc(List<tintuc> mlistTintuc) {
        this.mlistTintuc = mlistTintuc;
    }

    public List<moinhat> getMlistMoinhat() {
        return mlistMoinhat;
    }

    public void setMlistMoinhat(List<moinhat> mlistMoinhat) {
        this.mlistMoinhat = mlistMoinhat;
    }

    public List<yeuthich> getmYeuthichList() {
        return mYeuthichList;
    }

    public void setmYeuthichList(List<yeuthich> mYeuthichList) {
        this.mYeuthichList = mYeuthichList;
    }
}
