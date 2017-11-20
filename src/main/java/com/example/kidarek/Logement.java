package com.example.kidarek;

import java.util.LinkedList;

/**
 * Created by yacineyakoubi on 4/19/17.
 */

public class Logement {

    private String Id;
    private String title;
    private String price;
    private LinkedList<String> pictures;
    private  String prodSmallPic;
    private String prodBigPic;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LinkedList<String> getPictures() {
        return pictures;
    }

    public void setPictures(LinkedList<String> pictures) {
        this.pictures = pictures;
    }

    public String getProdSmallPic() {
        return prodSmallPic;
    }

    public void setProdSmallPic(String prodSmallPic) {
        this.prodSmallPic = prodSmallPic;
    }

    public String getProdBigPic() {
        return prodBigPic;
    }

    public void setProdBigPic(String prodBigPic) {
        this.prodBigPic = prodBigPic;
    }
}
