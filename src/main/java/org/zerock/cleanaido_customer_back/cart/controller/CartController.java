package org.zerock.cleanaido_customer_back.cart.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zerock.cleanaido_customer_back.cart.dto.CartDetailDTO;
import org.zerock.cleanaido_customer_back.cart.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
@Log4j2
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class CartController {

    private final CartService cartService;

    @GetMapping("list")
    public ResponseEntity<List<CartDetailDTO>> list(
            @RequestParam(value = "customerId", required = false) String customerId
    ) {
        log.info("-----kkkkkkkkkkkkkk-------");
        log.info(customerId);
        return ResponseEntity.ok(cartService.listCartDetail(customerId));
    }
}