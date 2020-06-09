package com.mercadeo.ecom.color.db.repository;

import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface ColorRepository extends BaseRepository<Color> {
	Set<Color> findAllByIdIn(Set<Long> ids);
}
