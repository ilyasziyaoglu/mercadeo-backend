package com.andriambavy.ecom.productoption.db.entity;


import com.andriambavy.ecom.client.productoption.ProductSize;
import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
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
@Table(name = "product_options")
public class ProductOption extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "product_option_id_gen", sequenceName = "product_option_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_option_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "product_size")
	private ProductSize productSize;

	@Column(name = "size_mesures")
	private String sizeMeasures;

	@Override
	public Long getId() {
		return this.id;
	}
}
