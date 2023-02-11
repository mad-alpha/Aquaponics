package com.example.aquaponics.Model;

public class GetProductsResponse {
    private ProductDetails[] data;

    public GetProductsResponse(){}

    public GetProductsResponse(ProductDetails[] productDetails) {
        this.data = productDetails;
    }

    public ProductDetails[] getData() {
        return data;
    }
}
