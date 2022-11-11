package org.example.mapper;

import org.example.model.dto.ProductDto;
import org.example.model.param.ProductParam;

import java.util.List;

public interface ProductMapper {
    List<ProductDto>queryAll(String conditions, int id);

    int delete(int id);

    void add(ProductParam productParam);

    void addQue(String id);

    void xiugai(ProductParam productParam);
}
