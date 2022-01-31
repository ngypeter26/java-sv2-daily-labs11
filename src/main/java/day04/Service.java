package day04;

import java.time.LocalDate;

public class Service extends WebShopItem{
    public static final int DEFAULT_EXPIRATION = 1;

    public Service(String name, int price) {
        super(name, price);
    }

    public Service(WebShopItem wsi) {
        super(wsi);
    }

    @Override
    public WebShopItem copy() {
        WebShopItem wsi = new Service(this);
        wsi.setExpireDate(LocalDate.now().plusYears(DEFAULT_EXPIRATION));
        return wsi;
    }
}
