package com.example.aquaponics.Model;

public class GetProductResponse {
    private ProductDetails data;

    public GetProductResponse(){}

    public GetProductResponse(ProductDetails productDetails) {
        this.data = productDetails;
    }

    public ProductDetails getData() {
        return data;
    }
}
