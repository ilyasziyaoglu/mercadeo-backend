package com.mercadeo.ecom.orderproducts.db.repository;

import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import com.mercadeo.ecom.orderproducts.db.entity.OrderProduct;
import org.springframework.stereotype.Repository;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface OrderProductRepository extends BaseRepository<OrderProduct> {
}
