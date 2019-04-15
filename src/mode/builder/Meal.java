package mode.builder;

import java.util.LinkedList;
import java.util.List;

public class Meal {
    private List<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost = cost + item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("商品:" + item.name());
            System.out.println("包装:" + item.packing().pack());
            System.out.println("价钱:" + item.price() + "元");
        }
        System.out.println("一共："+getCost()+"元");
        System.out.println("");
    }
}
