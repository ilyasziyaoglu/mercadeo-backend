package com.andriambavy.ecom.productoption.service;

import com.andriambavy.ecom.client.productoption.ProductOptionRequest;
import com.andriambavy.ecom.client.productoption.ProductOptionResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
import com.andriambavy.ecom.productoption.db.repository.ProductOptionRepository;
import com.andriambavy.ecom.productoption.mapper.ProductOptionMapper;
import com.andriambavy.ecom.productoption.mapper.ProductOptionUpdateMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductOptionService extends AbstractBaseService<ProductOptionRequest, ProductOption, ProductOptionResponse, ProductOptionMapper> {
    private ProductOptionRepository repository;
    private ProductOptionMapper mapper;
    private ProductOptionUpdateMapper updateMapper;

    public ProductOptionService(ProductOptionRepository repository, ProductOptionMapper mapper, ProductOptionUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public ProductOptionRepository getRepository() {
        return repository;
    }

    @Override
    public ProductOptionMapper getMapper() {
        return mapper;
    }

    @Override
    public ProductOptionUpdateMapper getUpdateMapper() {
        return updateMapper;
    }
}
