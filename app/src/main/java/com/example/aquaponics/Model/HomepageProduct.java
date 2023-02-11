package com.example.aquaponics.Model;

public class HomepageProduct {
    private Integer id;
    private String image;
    private String name;

    public HomepageProduct() {}

    public HomepageProduct(Integer id, String image, String name) {
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

}
