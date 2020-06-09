package com.mercadeo.ecom.orderproducts.db.entity;


import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.order.db.entity.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "order_products")
public class OrderProduct extends AbstractBaseEntity {

	private static final long serialVersionUID = 8088012714069780250L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "order_products_id_gen", sequenceName = "order_products_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "order_products_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Order order;

	@Column(name = "product_id")
	private Long productId;

	@ElementCollection
	private Set<Long> colorIds = new HashSet<>();

	@ElementCollection
	private Set<Long> sizeIds = new HashSet<>();

	@Override
	public Long getId() {
		return this.id;
	}
}
