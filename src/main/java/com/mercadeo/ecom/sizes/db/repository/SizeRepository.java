package com.mercadeo.ecom.sizes.db.repository;

import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import com.mercadeo.ecom.sizes.db.entity.Size;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface SizeRepository extends BaseRepository<Size> {
	Set<Size> findByIdIn(Set<Long> ids);
}
