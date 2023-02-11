package com.example.aquaponics.Model;

public class ProductDetails {
    private Integer id;
    private String slug;
    private String name;
    private String details;
    private String unit_desc;
    private Integer category_id;
    private Integer status;
    private Integer is_available;
    private Integer is_product;
    private Integer is_variable_product;
    private String default_package;
    private Integer seller_id;
    private String small_picture_url;
    private String large_picture_url;
    private Category category;
    private ProductPackage[] productpackages;

    public ProductDetails(){}

    public ProductDetails(Integer id, String slug, String name, String details, String unit_desc, Integer category_id, Integer status, Integer is_available, Integer is_product, Integer is_variable_product, String default_package, Integer seller_id, String small_picture_url, String large_picture_url, Category category, ProductPackage[] productpackages) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.details = details;
        this.unit_desc = unit_desc;
        this.category_id = category_id;
        this.status = status;
        this.is_available = is_available;
        this.is_product = is_product;
        this.is_variable_product = is_variable_product;
        this.default_package = default_package;
        this.seller_id = seller_id;
        this.small_picture_url = small_picture_url;
        this.large_picture_url = large_picture_url;
        this.category = category;
        this.productpackages = productpackages;
    }

    public Integer getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getUnit_desc() {
        return unit_desc;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getIs_available() {
        return is_available;
    }

    public Integer getIs_product() {
        return is_product;
    }

    public Integer getIs_variable_product() {
        return is_variable_product;
    }

    public String getDefault_package() {
        return default_package;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public String getSmall_picture_url() {
        return small_picture_url;
    }

    public String getLarge_picture_url() {
        return large_picture_url;
    }

    public Category getCategory() {
        return category;
    }

    public ProductPackage[] getProductpackages() {
        return productpackages;
    }
}
