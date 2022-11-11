package org.example.service.impl;

import org.example.mapper.ProductMapper;
import org.example.model.dto.ProductDto;
import org.example.model.param.ProductParam;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDto> queryAll(String conditions,int id) {
        return productMapper.queryAll(conditions,id);
    }

    @Override
    public int delete(int id) {
        return productMapper.delete(id);
    }

    @Override
    public void add(ProductParam productParam) {
        productMapper.add(productParam);
        productMapper.addQue(productParam.getId());
    }

    @Override
    public void xiugai(ProductParam productParam) {
         productMapper.xiugai(productParam);
    }
}
