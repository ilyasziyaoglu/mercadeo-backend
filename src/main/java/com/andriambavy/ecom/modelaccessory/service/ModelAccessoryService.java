package com.andriambavy.ecom.modelaccessory.service;

import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryRequest;
import com.andriambavy.ecom.client.modelaccessory.ModelAccessoryResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import com.andriambavy.ecom.modelaccessory.db.repository.ModelAccessoryRepository;
import com.andriambavy.ecom.modelaccessory.mapper.ModelAccessoryMapper;
import com.andriambavy.ecom.modelaccessory.mapper.ModelAccessoryUpdateMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ModelAccessoryService extends AbstractBaseService<ModelAccessoryRequest, ModelAccessory, ModelAccessoryResponse, ModelAccessoryMapper> {
    private ModelAccessoryRepository repository;
    private ModelAccessoryMapper mapper;
    private ModelAccessoryUpdateMapper updateMapper;

    public ModelAccessoryService(ModelAccessoryRepository repository, ModelAccessoryMapper mapper, ModelAccessoryUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public ModelAccessoryRepository getRepository() {
        return repository;
    }

    @Override
    public ModelAccessoryMapper getMapper() {
        return mapper;
    }

    @Override
    public ModelAccessoryUpdateMapper getUpdateMapper() {
        return updateMapper;
    }

    public ServiceResult<ModelAccessory> getPropertiesByModelIdAndAccessoryId(Long modelId, Long accessoryId) {
        ServiceResult<ModelAccessory> serviceResult = new ServiceResult<>();
        try {
            Optional<ModelAccessory> modelAccessory = repository.findByModelIdAndAccessoryId(modelId, accessoryId);
            if (modelAccessory.isPresent()) {
                serviceResult.setValue(modelAccessory.get());
            } else {
                serviceResult.setMessage("Properties not fount by the given modelId: " + modelId + " and accessoryId:" +
                        accessoryId);
                serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            serviceResult.setMessage(e.getMessage());
            serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return serviceResult;
    }
}
