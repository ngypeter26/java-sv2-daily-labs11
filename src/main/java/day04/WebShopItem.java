package day04;

import java.time.LocalDate;
import java.time.LocalTime;

public  abstract class WebShopItem {
    private String name;
    private int price;
    private LocalDate expireDate;

    public WebShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public WebShopItem(WebShopItem wsi) {
        this.name = wsi.name;
        this.price = wsi.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExpireDate() {
        if(expireDate == null){
            throw new IllegalStateException("Depends when you buy it!");
        }
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public abstract WebShopItem copy();
}
