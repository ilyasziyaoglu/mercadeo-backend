package com.andriambavy.ecom.limitededition.db.repository;

import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface LimitedEditionRepository extends BaseRepository<LimitedEdition> {
}
