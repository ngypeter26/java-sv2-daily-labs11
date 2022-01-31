package day04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<WebShopItem> items = new ArrayList<>();
    private int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void buy (WebShopItem webShopItem){
        if (webShopItem.getPrice()>balance){
            throw new IllegalArgumentException("You have not enough money");
        }
        items.add(webShopItem);
        balance -= webShopItem.getPrice();
    }
    public String getName() {
        return name;
    }

    public List<WebShopItem> getItems() {
        return items;
    }

    public int getBalance() {
        return balance;
    }


}
