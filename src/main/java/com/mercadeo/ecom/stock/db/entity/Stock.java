package com.mercadeo.ecom.stock.db.entity;


import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.sizes.db.entity.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "stocks")
public class Stock extends AbstractBaseEntity {

	private static final long serialVersionUID = 4910203770989997799L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "stocks_id_gen", sequenceName = "stocks_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "stocks_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id", referencedColumnName = "id")
	private Color color;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "size_id", referencedColumnName = "id")
	private Size size;

	@Column(name = "stock")
	private Integer stock;

	@Override
	public Long getId() {
		return this.id;
	}
}
