package pro.sky.HW6.service;

import java.util.List;

public interface OrderService {
    void addItem(List<Integer> itemId );
    List<Integer> getItem();
}
