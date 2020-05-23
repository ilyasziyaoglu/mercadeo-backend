package com.andriambavy.ecom.accessory.service;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.accessory.db.repository.AccessoryRepository;
import com.andriambavy.ecom.accessory.mapper.AccessoryMapper;
import com.andriambavy.ecom.accessory.mapper.AccessoryUpdateMapper;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.client.accessory.AccessoryResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import com.andriambavy.ecom.modelaccessory.db.repository.ModelAccessoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class AccessoryService extends AbstractBaseService<AccessoryRequest, Accessory, AccessoryResponse, AccessoryMapper> {
    private AccessoryMapper mapper;
    private AccessoryRepository repository;
    private AccessoryUpdateMapper updateMapper;
    private ModelAccessoryRepository modelAccessoryRepository;

    public AccessoryService(final AccessoryRepository repository, final AccessoryMapper mapper, final AccessoryUpdateMapper updateMapper, final ModelAccessoryRepository modelAccessoryRepository) {
        this.mapper = mapper;
        this.repository = repository;
        this.updateMapper = updateMapper;
        this.modelAccessoryRepository = modelAccessoryRepository;
    }

    @Override
    public AccessoryRepository getRepository() {
        return repository;
    }

    @Override
    public AccessoryMapper getMapper() {
        return mapper;
    }

    @Override
    public AccessoryUpdateMapper getUpdateMapper() {
        return updateMapper;
    }

    public ServiceResult<List<Accessory>> getAccessoriesByModelId(Long modelId) {
        ServiceResult<List<Accessory>> serviceResult = new ServiceResult<>();
        List<Accessory> accessories = new ArrayList<>();
        try {
            List<ModelAccessory> modelAccessories = modelAccessoryRepository.findAllByModelId(modelId);
            if (modelAccessories.size() > 0) {
                List<Long> accessoryIds =
                        modelAccessories.stream().map(ModelAccessory::getAccessoryId).collect(Collectors.toList());
                accessories = repository.findAllById(accessoryIds);
            }
            serviceResult.setHttpStatus(HttpStatus.OK);
        } catch (Exception e) {
            serviceResult.setMessage(e.getMessage());
            serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        serviceResult.setValue(accessories);
        return serviceResult;
    }
}
