package com.example.aquaponics.Model;

public class GetCategoriesResponseArray {
    private Category[] data;

    public GetCategoriesResponseArray(){}

    public GetCategoriesResponseArray(Category[] categories) {
        this.data = categories;
    }

    public Category[] getData() {
        return data;
    }
}
