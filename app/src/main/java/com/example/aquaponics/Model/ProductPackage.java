package com.example.aquaponics.Model;

public class ProductPackage {
    private Integer id;
    private String skucode;
    private Integer product_id;
    private Integer unit_id;
    private String unit_name;
    private String package_masters_id;
    private String market_price;
    private String offer_price;
    private String offer_percentage;
    private String offer_flat_amount;
    private String offer_percentage_amount;
    private String offer_type;
    private String stock;
    private String alert_stock;
    private String gst_percentage;
    private String gst_amount;
    private Integer is_offer;
    private Integer status;

    public ProductPackage() {}

    public ProductPackage(Integer id, String skucode, Integer product_id, Integer unit_id, String unit_name, String package_masters_id, String market_price, String offer_price, String offer_percentage, String offer_flat_amount, String offer_percentage_amount, String offer_type, String stock, String alert_stock, String gst_percentage, String gst_amount, Integer is_offer, Integer status) {
        this.id = id;
        this.skucode = skucode;
        this.product_id = product_id;
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.package_masters_id = package_masters_id;
        this.market_price = market_price;
        this.offer_price = offer_price;
        this.offer_percentage = offer_percentage;
        this.offer_flat_amount = offer_flat_amount;
        this.offer_percentage_amount = offer_percentage_amount;
        this.offer_type = offer_type;
        this.stock = stock;
        this.alert_stock = alert_stock;
        this.gst_percentage = gst_percentage;
        this.gst_amount = gst_amount;
        this.is_offer = is_offer;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getSkucode() {
        return skucode;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public Integer getUnit_id() {
        return unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public String getPackage_masters_id() {
        return package_masters_id;
    }

    public String getMarket_price() {
        return market_price;
    }

    public String getOffer_price() {
        return offer_price;
    }

    public String getOffer_percentage() {
        return offer_percentage;
    }

    public String getOffer_flat_amount() {
        return offer_flat_amount;
    }

    public String getOffer_percentage_amount() {
        return offer_percentage_amount;
    }

    public String getOffer_type() {
        return offer_type;
    }

    public String getStock() {
        return stock;
    }

    public String getAlert_stock() {
        return alert_stock;
    }

    public String getGst_percentage() {
        return gst_percentage;
    }

    public String getGst_amount() {
        return gst_amount;
    }

    public Integer getIs_offer() {
        return is_offer;
    }

    public Integer getStatus() {
        return status;
    }
}
