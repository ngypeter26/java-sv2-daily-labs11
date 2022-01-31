package day04;

import java.util.ArrayList;
import java.util.List;

public class Webshop {
    private List<WebShopItem> webShopItems = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addItem(WebShopItem webShopItem){
        webShopItems.add(webShopItem);
    }
    public void addUser(User user){
        users.add(user);
    }

    public List<WebShopItem> getWebShopItems() {
        return webShopItems;
    }

    public List<User> getUsers() {
        return users;
    }

    public void buy(String userName, String itemName) {
        User user = searchUser(userName);
        WebShopItem item = searchItem(itemName);

        if(user.getBalance()>=item.getPrice()){
            user.buy(item.copy());
        }
    }

    public User searchUser(String userName){
        for (User u : users){
            if (u.getName().equals(userName)){
                return u;
            }
        }
        throw new IllegalArgumentException("User does not found");
    }
    public WebShopItem searchItem(String itemName){
        for (WebShopItem wsu : webShopItems){
            if (wsu.getName().equals(itemName)){
                return wsu;
            }
        }
        throw new IllegalArgumentException("Item does not found");
    }

}
