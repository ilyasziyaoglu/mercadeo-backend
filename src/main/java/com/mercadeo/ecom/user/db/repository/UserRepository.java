package com.mercadeo.ecom.user.db.repository;

import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import com.mercadeo.ecom.user.db.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface UserRepository extends BaseRepository<User> {
	Optional<User> findByUsername(String username);
}
