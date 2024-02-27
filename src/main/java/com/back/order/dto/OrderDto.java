package com.back.order.dto;

import com.back.order.model.Customer;
import com.back.order.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OrderDto {

    private Long id;

    private List<Product> products;

    private Customer customer;
}
