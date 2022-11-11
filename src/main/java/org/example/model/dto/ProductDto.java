package org.example.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private int id;
    private String productName;
    private String productDate;
    private int productSum;
    private String productDesc;
    private BigDecimal productPrice;
    private int score;
}
