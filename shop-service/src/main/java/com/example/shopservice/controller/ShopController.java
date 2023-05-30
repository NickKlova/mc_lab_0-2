package com.example.shopservice.controller;


import com.example.shopservice.dto.ShopDTO;
import com.example.shopservice.entity.ShopEntity;
import com.example.shopservice.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class ShopController {

    private final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    ShopService shopService;

    @PostMapping("/shop")
    public ResponseEntity<ShopEntity> addShop (@RequestBody ShopDTO shopDTO) {
        logger.info("Received POST request on creating new shop");
        ShopEntity shopEntity = shopService.addShop(shopDTO);
        logger.info("New shop saved");
        return ResponseEntity.ok(shopEntity);
    }


    @GetMapping("/shop/{id}")
    public ResponseEntity<ShopEntity> getShopById (@PathVariable int id) {
        logger.info("Received GET request on getting shop with id: {}", id);
        ShopEntity shopEntity = shopService.getShopById(id);
        logger.info("Returned shop with id: {}", id);
        return ResponseEntity.ok(shopEntity);
    }

    @PostMapping(value = "/shop", consumes = "application/x-www-form-urlencoded")
    public  ResponseEntity<ShopEntity> addShopByTelegram (ShopDTO shopDTO) {
        logger.info("Received POST request on creating new shop");
        ShopEntity shopEntity = shopService.addShop(shopDTO);
        logger.info("New shop saved");
        return ResponseEntity.ok(shopEntity);
    }

}
