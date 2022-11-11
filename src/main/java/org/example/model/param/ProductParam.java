package org.example.model.param;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductParam {
    private String id;
    private String productName;
    private String productDesc;
    private int productSum;
    private BigDecimal productPrice;
    private String productDate;
}
