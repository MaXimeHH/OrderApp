package com.back.order.services;

import com.back.order.dto.OrderDto;
import java.util.List;


public interface OrderService {

    List<OrderDto> getAllOrders();

    OrderDto getbyId(Long id);

    OrderDto updateOrder(OrderDto order);

    String deleteOrder(Long id);

    OrderDto createOrder(OrderDto order);
}
