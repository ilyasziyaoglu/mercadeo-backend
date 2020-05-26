package com.mercadeo.ecom.productfilter.db.query;

import com.mercadeo.ecom.client.productfilter.ProductFilterRequest;
import com.mercadeo.ecom.common.basemodel.db.query.AbstractSpecification;
import com.mercadeo.ecom.productfilter.db.entity.ProductFilter;
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
public class ProductFilterQuery extends AbstractSpecification<ProductFilter, ProductFilterRequest> {

	public static Specification<ProductFilter> filterProduct(ProductFilterRequest dto) {
		return (Specification<ProductFilter>) (root, criteria, cb) -> {
			ProductFilterRequest searchDto = dto != null ? dto : new ProductFilterRequest();

			List<Predicate>      predicates = new ArrayList<>();

			if (!CollectionUtils.isEmpty(searchDto.getBrands())) {
				predicates.add(cb.in(root.get("brand_id")).value(searchDto.getBrands()));
			}

			if (!CollectionUtils.isEmpty(searchDto.getColors())) {
				predicates.add(cb.in(root.get("color_id")).value(searchDto.getColors()));
			}

			if (!CollectionUtils.isEmpty(searchDto.getSizes())) {
				predicates.add(cb.in(root.get("size_id")).value(searchDto.getSizes()));
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

