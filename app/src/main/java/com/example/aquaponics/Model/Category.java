package com.example.aquaponics.Model;

public class Category {
    private Integer id;
    private String slug;
    private String name;
    private String parent_id;
    private String thumbnail_image;
    private String banner_image;
    private String small_picture_url;
    private String large_picture_url;
    private Integer status;
    private String created_at;
    private String updated_at;

    public Category(){}

    public Category(Integer id, String slug, String name, String parent_id, String thumbnail_image, String banner_image, String small_picture_url, String large_picture_url, Integer status, String created_at, String updated_at) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.parent_id = parent_id;
        this.thumbnail_image = thumbnail_image;
        this.banner_image = banner_image;
        this.small_picture_url = small_picture_url;
        this.large_picture_url = large_picture_url;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getParent_id() {
        return parent_id;
    }

    public String getThumbnail_image() {
        return thumbnail_image;
    }

    public String getBanner_image() {
        return banner_image;
    }

    public String getSmall_picture_url() {
        return small_picture_url;
    }

    public String getLarge_picture_url() {
        return large_picture_url;
    }

    public Integer getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
