package com.andriambavy.ecom.user.db.repository;

import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;
import com.andriambavy.ecom.user.db.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
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
