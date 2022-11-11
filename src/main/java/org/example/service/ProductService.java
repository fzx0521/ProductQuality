package org.example.service;

import org.example.model.dto.ProductDto;
import org.example.model.param.ProductParam;

import java.util.List;

public interface ProductService {
    List<ProductDto> queryAll(String conditions,int id);

    int delete(int id);

    void add(ProductParam productParam);

    void xiugai(ProductParam productParam);
}
