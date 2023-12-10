package delivery;

import item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
