package com.scrap.dtos;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
//@AllArgsConstructor
public class OrderDto {
    @JsonIgnore
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Date date = new Date();

    @JsonIgnore
    public String client = "cliente 1";
    public Boolean delivered = false;
    public Boolean paid = true;

    @JsonGetter("date")
    public  String date(){
        return formatter.format(date);
    }

    @JsonGetter("total")
    public  double total(){
        return products.stream().mapToDouble(o -> o.total).sum();
    }

    @JsonProperty("items")
    public List<ProductDto> products = Arrays.asList(
            new ProductDto(),
            new ProductDto(),
            new ProductDto()
    );
}
