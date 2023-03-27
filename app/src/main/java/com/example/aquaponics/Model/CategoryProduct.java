package com.example.aquaponics.Model;

public class CategoryProduct {
    private Integer id;
    private String image;
    private String name;

    private String price;
    private String priceUnit;
    private String unitsAvailable;

    public CategoryProduct() {}

    public CategoryProduct(Integer id, String image, String name, String price, String priceUnit, String unitsAvailable) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.priceUnit = priceUnit;
        this.unitsAvailable = unitsAvailable;
    }

    public Integer getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getUnitsAvailable() {
        return unitsAvailable;
    }

    public String getPriceUnit() {
        return this.priceUnit;
    }
}
