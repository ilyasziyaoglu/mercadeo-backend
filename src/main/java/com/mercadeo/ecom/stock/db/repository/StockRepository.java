package com.mercadeo.ecom.stock.db.repository;

import com.mercadeo.ecom.common.basemodel.db.repository.BaseRepository;
import com.mercadeo.ecom.stock.db.entity.Stock;
import org.springframework.stereotype.Repository;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Repository
public interface StockRepository extends BaseRepository<Stock> {
}
