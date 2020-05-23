package com.andriambavy.ecom.order.db.repository;

import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;
import com.andriambavy.ecom.order.db.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface OrderRepository extends BaseRepository<Order> {
}
