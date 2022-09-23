package com.example.recyclerview08082022;

import java.util.List;

/**
 * Created by pphat on 9/23/2022.
 */
public class Food {
    public final static String instance = "Food Class";
    private int image;
    private String name;
    private String address;
    private List<CategoryEnum> categoryEnums;
    private String saleOff;
    private float distance;
    private long openTime;
    private long closeTime;

    public Food(int image, String name, String address, List<CategoryEnum> categoryEnums, String saleOff, float distance, long openTime, long closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.categoryEnums = categoryEnums;
        this.saleOff = saleOff;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CategoryEnum> getCategoryEnums() {
        return categoryEnums;
    }

    public void setCategoryEnums(List<CategoryEnum> categoryEnums) {
        this.categoryEnums = categoryEnums;
    }

    public String getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(String saleOff) {
        this.saleOff = saleOff;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }
}
