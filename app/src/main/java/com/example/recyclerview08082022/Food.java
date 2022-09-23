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
    private int hourOpenTime;
    private int minuteOpenTime;
    private int hourCloseTime;
    private int minuteCloseTime;

    public Food(int image, String name, String address, List<CategoryEnum> categoryEnums, String saleOff, float distance, int hourOpenTime, int minutesOpenTime, int hourCloseTime, int minutesCloseTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.categoryEnums = categoryEnums;
        this.saleOff = saleOff;
        this.distance = distance;
        this.hourOpenTime = hourOpenTime;
        this.minuteOpenTime = minutesOpenTime;
        this.hourCloseTime = hourCloseTime;
        this.minuteCloseTime = minutesCloseTime;
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

    public int getHourOpenTime() {
        return hourOpenTime;
    }

    public void setHourOpenTime(int hourOpenTime) {
        this.hourOpenTime = hourOpenTime;
    }

    public int getMinuteOpenTime() {
        return minuteOpenTime;
    }

    public void setMinuteOpenTime(int minuteOpenTime) {
        this.minuteOpenTime = minuteOpenTime;
    }

    public int getHourCloseTime() {
        return hourCloseTime;
    }

    public void setHourCloseTime(int hourCloseTime) {
        this.hourCloseTime = hourCloseTime;
    }

    public int getMinuteCloseTime() {
        return minuteCloseTime;
    }

    public void setMinuteCloseTime(int minuteCloseTime) {
        this.minuteCloseTime = minuteCloseTime;
    }
}
