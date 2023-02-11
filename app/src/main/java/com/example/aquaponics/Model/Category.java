package com.example.aquaponics.Model;

public class Category {
    private Integer id;
    private String slug;

    public Category() {}

    public Category(Integer id, String slug) {
        this.id = id;
        this.slug = slug;
    }

    public Integer getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }
}
