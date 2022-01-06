package com.harshitha.shopping.productservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harshitha.shopping.productservice.entity.Product;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class ProductJson {

    @Test
    public void generateJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Product product = Product.builder()
               // .productType("abc")
                .name("lcu")
                .category("soap")
                //.rating(double 4.0)
                //.review(Map.of(1, "Bad"))
                //.imageList(List.of("httt"))
                .price(122.5)
                .description("soap")
                //.specification(Map.of("soap", "bath"))
                .build();

        System.out.println(mapper.writeValueAsString(product));
    }
}
