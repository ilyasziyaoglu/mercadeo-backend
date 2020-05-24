package com.mercadeo.ecom.order.db.entity;


import com.mercadeo.ecom.client.order.OrderStatus;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.user.db.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "orders")
public class Order extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "order_id_gen", sequenceName = "order_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "order_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "buyer_note", length = 1000)
	private String buyerNote;

	@Column(name = "status")
	private OrderStatus status;

	@Column(name = "history", length = 10000)
	private String history;

	@Column(name = "shipping_info", length = 1024)
	private String shippingInfo;

	@Column(name = "reason", length = 1024)
	private String reason;

	public Order() {
	}

	@Override
	public Long getId() {
		return id;
	}
}
