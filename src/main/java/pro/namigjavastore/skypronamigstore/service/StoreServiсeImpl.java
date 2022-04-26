package pro.namigjavastore.skypronamigstore.service;

import org.springframework.stereotype.Service;
import pro.namigjavastore.skypronamigstore.data.StoreItem;


import java.util.List;


@Service
public class StoreServiсeImpl implements StoreService {
    private final StoreItem storeItem;

    public StoreServiсeImpl(StoreItem storeItem) {
        this.storeItem = storeItem;
    }

    @Override
    public List<Integer> addItems(List<Integer> idItem) {
        storeItem.addItems(idItem);
        return idItem;
    }

    @Override
    public List<Integer> getList() {
        return storeItem.getItems();
    }
}
