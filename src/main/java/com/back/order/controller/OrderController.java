package com.back.order.controller;

import com.back.order.controller.api.OrderApiInterface;
import com.back.order.dto.OrderDto;
import com.back.order.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders/")
@AllArgsConstructor
@NoArgsConstructor
public class OrderController implements OrderApiInterface {

    private OrderService orderService;

    @GetMapping("getAllOrders")
    public ResponseEntity<List<OrderDto>> getAllOrders() {
        return ResponseEntity.ok(this.orderService.getAllOrders());
    }

    @PostMapping("getOrderById")
    public ResponseEntity<OrderDto> getByid(@RequestBody Long id) {
        return ResponseEntity.ok(this.orderService.getbyId(id));
    }

    @PostMapping("updateOrder")
    public ResponseEntity<OrderDto> updateOrder(@RequestBody OrderDto order) {
        return ResponseEntity.ok(this.orderService.updateOrder(order));

    }

    @PostMapping("deleteOrder")
    public ResponseEntity<String> deleteOrder(@RequestBody Long id) {
        return ResponseEntity.ok(this.orderService.deleteOrder(id));
    }

    @PostMapping("createOrder")
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto order) throws Exception {
        return ResponseEntity.ok(this.orderService.createOrder(order));
    }
}
