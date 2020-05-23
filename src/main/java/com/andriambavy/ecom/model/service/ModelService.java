package com.andriambavy.ecom.model.service;

import com.andriambavy.ecom.client.model.ModelRequest;
import com.andriambavy.ecom.client.model.ModelResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.model.db.entity.Model;
import com.andriambavy.ecom.model.db.repository.ModelRepository;
import com.andriambavy.ecom.model.mapper.BagModelMapper;
import com.andriambavy.ecom.model.mapper.ModelUpdateMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ModelService extends AbstractBaseService<ModelRequest, Model, ModelResponse, BagModelMapper> {
    private ModelRepository repository;
    private BagModelMapper mapper;
    private ModelUpdateMapper updateMapper;

    public ModelService(ModelRepository repository, BagModelMapper mapper, ModelUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public ModelRepository getRepository() {
        return repository;
    }

    @Override
    public BagModelMapper getMapper() {
        return mapper;
    }

    @Override
    public ModelUpdateMapper getUpdateMapper() {
        return updateMapper;
    }
}
