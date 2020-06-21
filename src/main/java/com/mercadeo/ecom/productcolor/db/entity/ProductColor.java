package com.mercadeo.ecom.productcolor.db.entity;


import com.mercadeo.ecom.color.db.entity.Color;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.enums.Status;
import com.mercadeo.ecom.product.db.entity.Product;
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
@Table(name = "product_colors")
public class ProductColor extends AbstractBaseEntity {

	private static final long serialVersionUID = 8088012714069780250L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "product_colors_id_gen", sequenceName = "product_colors_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_colors_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "color_id", referencedColumnName = "id")
	private Color color;

	@Column(name = "status")
	private Status status;

	@Column(name = "img_url", length = 1000)
	private String imgUrl;

	@Override
	public Long getId() {
		return this.id;
	}
}
