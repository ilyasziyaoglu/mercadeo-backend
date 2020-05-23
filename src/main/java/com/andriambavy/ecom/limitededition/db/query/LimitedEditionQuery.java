package com.andriambavy.ecom.limitededition.db.query;

import com.andriambavy.ecom.client.limitededition.LimitedEditionRequest;
import com.andriambavy.ecom.common.basemodel.db.query.AbstractSpecification;
import com.andriambavy.ecom.limitededition.db.entity.LimitedEdition;
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
public class LimitedEditionQuery extends AbstractSpecification<LimitedEdition, LimitedEditionRequest> {

	public static Specification<LimitedEdition> filterLimitedEdition(LimitedEditionRequest dto) {
		return (Specification<LimitedEdition>) (root, criteria, cb) -> {
			LimitedEditionRequest searchDto = dto != null ? dto : new LimitedEditionRequest();

			List<Predicate> predicates = new ArrayList<>();

			if (!CollectionUtils.isEmpty(searchDto.getCategories())) {
				predicates.add(cb.in(root.get("category")).value(searchDto.getCategories()));
			}

			if (!CollectionUtils.isEmpty(searchDto.getColors())) {
				predicates.add(cb.in(root.get("colorCode")).value(searchDto.getColors()));
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

