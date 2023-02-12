package com.example.aquaponics.Model;

public class GetProductsResponseArray {
    private ProductDetails[] data;

    public GetProductsResponseArray(){}

    public GetProductsResponseArray(ProductDetails[] productDetails) {
        this.data = productDetails;
    }

    public ProductDetails[] getData() {
        return data;
    }
}
