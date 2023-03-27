package com.example.aquaponics.Model;

public class GetProductResponseArray {
    private ProductDetails[] data;

    public GetProductResponseArray(){}

    public GetProductResponseArray(ProductDetails[] data) {
        this.data = data;
    }

    public ProductDetails[] getData() {
        return data;
    }
}
