package com.example.recyclerview08082022;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
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

    public static List<Food> getMock() {
        return new ArrayList<>(Arrays.asList(
                new Food(R.drawable.foody_restaurant_sanfulou, "San Fu Lou - Ẩm Thực Quảng Đông - Lê Lai", "Tầng Trệt, AB Tower, 76A Lê Lai, P. Bến Thành,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT), "Buoi sang - 10%", 15f, 7, 0, 10, 10),
                new Food(R.drawable.foody_ut_ut_quan, "Quán Ụt Ụt - Barbecue & Beer - Võ Văn Kiệt", "168 Võ Văn Kiệt, P. Cầu Ông Lãnh,  Quận 1, TP. HCM", Arrays.asList(), "Buoi toi - 20%", 18f, 11, 0, 24, 0),
                new Food(R.drawable.foody_restaurant_fuji, "Fuji Japanese Restaurant 富士 - Nikko Saigon Hotel", "Tầng Trệt Nikko Saigon Hotel, 235 Nguyễn Văn Cừ, P. Phạm Ngũ Lão,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Không có ưu đãi", 14.7f, 10, 18, 19, 11),
                new Food(R.drawable.foody_buffet_sabusabu, "Shabu Ya - SC VivoCity", "Tầng 4 - SC VivoCity, 1058 Nguyễn Văn Linh, KP. 1, P. Tân Phong,  Quận 7, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Ca ngay 15%", 28.4f, 9, 5, 22, 1),
                new Food(R.drawable.foody_buffet_hana_bbq_and_hot_pot, "Hana BBQ & Hot Pot Buffet - Nguyễn Quý Đức", "65 Nguyễn Quý Đức, P. An Phú,  Quận 2, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY), "Buoi sang 10%", 13.2f, 8, 5, 22, 5),
                new Food(R.drawable.foody_restaurant_kvegetarian, "Quán Chay KVegetarian - Bình Thạnh", "20/15 Phan Đăng Lưu, P. 6,  Quận Bình Thạnh, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Không có ưu đãi", 7.3f, 9, 3, 21, 2),
                new Food(R.drawable.foody_streetfood_223flan, "Quán 223 - Bánh Flan Thập Cẩm", "223 Trần Bình Trọng,  Quận 5, TP. HCM", Arrays.asList(CategoryEnum.STREET_FOOD, CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP), "Không có ưu đãi", 20f, 11, 59, 21, 58),
                new Food(R.drawable.foody_streetfood_banh_mi_bo_a_tung, "A Tùng - Bánh Mì Bò Nướng Bơ Cambodia - Cống Quỳnh", "171 Cống Quỳnh,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.STREET_FOOD, CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP), "Không có ưu đãi", 11f, 14, 32, 21, 13),
                new Food(R.drawable.foody_shop_online_bep_rua, "Bếp Rùa - Chân Gà Rút Xương Ngâm Sả Tắc - Shop Online", "127/5/9 Lê Thúc Hoạch, P. Phú Thọ Hòa,  Quận Tân Phú, TP. HCM", Arrays.asList(CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP, CategoryEnum.FAMILY), "Ca ngay 10%", 20f, 5, 9, 24, 0),
                new Food(R.drawable.foody_shop_online_bep_9_sach, "Bánh 9 Sạch - Bánh Sầu Riêng - Shop Online", "73 An Dương Vương, P. 8,  Quận 5, TP. HCM", Arrays.asList(CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP, CategoryEnum.FAMILY), "Ca ngay 5%", 16f, 8, 0, 18, 6))
        );
    }

    public static List<Food> getMoreData() {
        return new ArrayList<>(Arrays.asList(
                new Food(R.drawable.img_cheesecake, "Uncle Lu's Cheesecake - Sư Vạn Hạnh", "652 Sư Vạn Hạnh, P. 12, Quận 10, TP. HCM", Arrays.asList(CategoryEnum.FAMILY, CategoryEnum.GROUP), "Cả ngày - 15%", 10.1f, 8, 30, 17, 20),
                new Food(R.drawable.foody_com_tam_minh_long, "Cơm Tấm Minh Long - Nguyễn Thị Thập", "607 Nguyễn Thị Thập, P. Tân Hưng, Quận 7, TP. HCM", Arrays.asList(CategoryEnum.FAMILY, CategoryEnum.SHOP_ONLINE), "Ca ngay - 30%", 22f, 7, 0, 13, 0),
                new Food(R.drawable.foody_pizza_4p, "Pizza 4P’s - Pizza Kiểu Nhật - Lê Thánh Tôn", "8/15 Lê Thánh Tôn, P. Bến Nghé,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Ca ngay 50%", 10.5f, 10, 0, 18, 0),
                new Food(R.drawable.foody_restaurant_sanfulou, "San Fu Lou - Ẩm Thực Quảng Đông - Lê Lai", "Tầng Trệt, AB Tower, 76A Lê Lai, P. Bến Thành,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Buoi sang - 10%", 15f, 7, 0, 19, 10),
                new Food(R.drawable.foody_ut_ut_quan, "Quán Ụt Ụt - Barbecue & Beer - Võ Văn Kiệt", "168 Võ Văn Kiệt, P. Cầu Ông Lãnh,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.BIRTH_DAY, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Buoi toi - 20%", 18f, 11, 0, 24, 0),
                new Food(R.drawable.foody_restaurant_fuji, "Fuji Japanese Restaurant 富士 - Nikko Saigon Hotel", "Tầng Trệt Nikko Saigon Hotel, 235 Nguyễn Văn Cừ, P. Phạm Ngũ Lão,  Quận 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Không có ưu đãi", 14.7f, 10, 18, 19, 11),
                new Food(R.drawable.foody_buffet_sabusabu, "Shabu Ya - SC VivoCity", "Tầng 4 - SC VivoCity, 1058 Nguyễn Văn Linh, KP. 1, P. Tân Phong,  Quận 7, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Ca ngay 15%", 28.4f, 9, 5, 22, 1),
                new Food(R.drawable.foody_buffet_hana_bbq_and_hot_pot, "Hana BBQ & Hot Pot Buffet - Nguyễn Quý Đức", "65 Nguyễn Quý Đức, P. An Phú,  Quận 2, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY), "Buoi sang 10%", 13.2f, 8, 5, 22, 5),
                new Food(R.drawable.foody_restaurant_kvegetarian, "Quán Chay KVegetarian - Bình Thạnh", "20/15 Phan Đăng Lưu, P. 6,  Quận Bình Thạnh, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Không có ưu đãi", 7.3f, 9, 3, 21, 2),
                new Food(R.drawable.foody_streetfood_223flan, "Quán 223 - Bánh Flan Thập Cẩm", "223 Trần Bình Trọng,  Quận 5, TP. HCM", Arrays.asList(CategoryEnum.STREET_FOOD, CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP), "Không có ưu đãi", 20f, 11, 59, 21, 58))
        );
    }
}
