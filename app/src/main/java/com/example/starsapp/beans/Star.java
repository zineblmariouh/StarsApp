package com.example.starsapp.beans;

public class Star {
    private int id;
    private String nom;
    private String image;
    private float star;
    private static int comp;

    public Star(int id, String nom, String image, float star) {
        this.id = id;
        this.nom = nom;
        this.image = image;
        this.star =star;
        this.id = ++comp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Star.comp = comp;
    }


}

