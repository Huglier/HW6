package pro.sky.HW6.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItem(List<Integer> itemId) {
        basket.addItem(itemId);

    }

    @Override
    public List<Integer> getItem() {
        return basket.getItem();
    }
}
