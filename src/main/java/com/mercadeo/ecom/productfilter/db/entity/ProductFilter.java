package com.mercadeo.ecom.productfilter.db.entity;


import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "v_product_filter")
public class ProductFilter extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "img_url")
	private String imgUrl;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "collection")
	private String collection;

	/**
	 * comma separated
	 */
	@Column(name = "features", length = 500)
	private String features;

	/**
	 * comma separated
	 */
	@Column(name = "tags")
	private String tags;

	@Override
	public Long getId() {
		return this.id;
	}
}
