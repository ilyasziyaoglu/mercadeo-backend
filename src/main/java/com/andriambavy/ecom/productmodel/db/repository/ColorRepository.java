package com.andriambavy.ecom.productmodel.db.repository;

import com.andriambavy.ecom.productmodel.db.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
