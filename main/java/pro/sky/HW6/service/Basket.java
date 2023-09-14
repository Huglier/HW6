package pro.sky.HW6.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> item = new ArrayList<>();

    public void addItem(List<Integer> itemId){
        item.addAll(itemId);
    }
    public List<Integer> getItem(){
        return Collections.unmodifiableList(item);
    }
}
