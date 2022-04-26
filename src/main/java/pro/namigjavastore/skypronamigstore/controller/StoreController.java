package pro.namigjavastore.skypronamigstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.namigjavastore.skypronamigstore.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public List<Integer> addItemInBasket(@RequestParam List<Integer> id) {
        return storeService.addItems(id);
    }

    @GetMapping("/get")
    public List<Integer> getItemInBasket() {
        return storeService.getList();
    }
}
