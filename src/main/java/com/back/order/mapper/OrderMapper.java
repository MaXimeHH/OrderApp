package com.back.order.mapper;

import com.back.order.dto.OrderDto;
import com.back.order.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface OrderMapper {

    @Mapping(source="id", target="id")
    @Mapping(source = "products", target = "products")
    @Mapping(source = "customer", target = "customer")
    public OrderDto OrderToOrderDto(Order order);
    @Mapping(source="id", target="id")
    @Mapping(source = "products", target = "products")
    @Mapping(source = "customer", target = "customer")
    public Order OrderDtoToOrder(OrderDto order);

}
