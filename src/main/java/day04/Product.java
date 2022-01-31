package day04;

import java.time.LocalDate;

public class Product extends WebShopItem{
    public static final int DEFAULT_GUARANTEE = 3;

    public Product(String name, int price) {
        super(name, price);
    }

    public Product(WebShopItem wsi) {
        super(wsi);
    }

    @Override
    public WebShopItem copy() {
        WebShopItem wsi = new Product(this);
        wsi.setExpireDate(LocalDate.now().plusYears(DEFAULT_GUARANTEE));
        return wsi;
    }

    public void addExtraGuarantee(int years){
        setExpireDate(LocalDate.now().plusYears(years));
    }
}
