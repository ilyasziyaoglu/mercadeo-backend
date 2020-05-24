package com.mercadeo.ecom.product.service;

import com.mercadeo.ecom.client.product.ProductRequest;
import com.mercadeo.ecom.client.product.ProductResponse;
import com.mercadeo.ecom.common.basemodel.service.AbstractBaseService;
import com.mercadeo.ecom.product.db.entity.Product;
import com.mercadeo.ecom.product.db.repository.ProductRepository;
import com.mercadeo.ecom.product.mapper.ProductMapper;
import com.mercadeo.ecom.product.mapper.ProductUpdateMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductService extends AbstractBaseService<ProductRequest, Product, ProductResponse, ProductMapper> {
    private ProductRepository repository;
    private ProductMapper mapper;
    private ProductUpdateMapper updateMapper;

    public ProductService(ProductRepository repository, ProductMapper mapper, ProductUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public ProductRepository getRepository() {
        return repository;
    }

    @Override
    public ProductMapper getMapper() {
        return mapper;
    }

    @Override
    public ProductUpdateMapper getUpdateMapper() {
        return updateMapper;
    }
}
