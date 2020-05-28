package com.mercadeo.ecom.product.db.query;

import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.common.basemodel.db.query.AbstractSpecification;
import com.mercadeo.ecom.product.db.entity.Product;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Murat Celik
 */
@Component
public class ProductQuery extends AbstractSpecification<Product, ProductFilterRequest> {

	public static Specification<Product> filterProduct(ProductFilterRequest dto) {
		return (Specification<Product>) (root, criteria, cb) -> {
			ProductFilterRequest searchDto = dto != null ? dto : new ProductFilterRequest();

			List<Predicate>      predicates = new ArrayList<>();

			if (!CollectionUtils.isEmpty(searchDto.getBrandIds())) {
				predicates.add(cb.in(root.get("brand")).value(
						searchDto.getBrandIds()));
			}

			if (searchDto.isCheckIds()) {
				predicates.add(cb.in(root.get("id")).value(searchDto.getIds()));
			}

			if (searchDto.getCategory1() != null) {
				predicates.add(cb.equal(root.get("category1"), searchDto.getCategory1()));
			}

			if (searchDto.getCategory2() != null) {
				predicates.add(cb.equal(root.get("category2"), searchDto.getCategory2()));
			}

			if (searchDto.getCategory3() != null) {
				predicates.add(cb.equal(root.get("category3"), searchDto.getCategory3()));
			}

			if (searchDto.getMinPrice() != null) {
				predicates.add(cb.greaterThanOrEqualTo(root.get("price"), searchDto.getMinPrice()));
			}

			if (searchDto.getMaxPrice() != null) {
				predicates.add(cb.lessThanOrEqualTo(root.get("price"), searchDto.getMaxPrice()));
			}

			criteria.orderBy(cb.desc(root.get("id")));
			return cb.and(predicates.toArray(new Predicate[predicates.size()]));
		};
	}
}

