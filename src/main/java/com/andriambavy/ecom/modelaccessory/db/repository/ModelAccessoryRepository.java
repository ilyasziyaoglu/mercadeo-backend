package com.andriambavy.ecom.modelaccessory.db.repository;

import com.andriambavy.ecom.modelaccessory.db.entity.ModelAccessory;
import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface ModelAccessoryRepository extends BaseRepository<ModelAccessory> {
	List<ModelAccessory> findAllByModelId(Long modelId);
	Optional<ModelAccessory> findByModelIdAndAccessoryId(Long modelId, Long accessoryId);
}
