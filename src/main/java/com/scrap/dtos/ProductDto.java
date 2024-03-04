package com.scrap.dtos;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
//@AllArgsConstructor
public class ProductDto {
    public String name = "COCA-COLA 50ML";
    public double price = 10.0;
    public double total = 0.0;
    public Integer cant = 2;
    public double dto = 0.0;
    public String dto_type = "%";

    @JsonGetter("total")
    public double total() {
        return total = cant * price;
    }
}
