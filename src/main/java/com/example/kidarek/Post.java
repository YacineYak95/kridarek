package com.example.kidarek;

import java.util.ArrayList;

/**
 * Created by yacineyakoubi on 4/20/17.
 */

public class Post {

    private String categoryName;
    private ArrayList<Logement> listLogement;

    public Post(String categoryName) {
        this.categoryName = categoryName;
        this.listLogement = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Logement> getListLogement() {
        return listLogement;
    }

    public void setListLogement(ArrayList<Logement> listLogement) {
        this.listLogement = listLogement;
    }
}
