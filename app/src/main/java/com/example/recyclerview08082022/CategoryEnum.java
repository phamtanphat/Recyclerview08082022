package com.example.recyclerview08082022;

/**
 * Created by pphat on 9/23/2022.
 */
public enum CategoryEnum {
    RESTAURANT("Nhà hàng"),
    BIRTH_DAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Hội nhóm"),
    STORE("Cửa hàng"),
    SHOP_ONLINE("Shop Online"),
    STREET_FOOD("Đồ ăn đường phố"),
    BUFFET("Buffer");

    private final String name;

    CategoryEnum(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}
