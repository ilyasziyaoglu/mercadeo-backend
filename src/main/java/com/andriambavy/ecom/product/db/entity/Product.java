package com.andriambavy.ecom.product.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.enums.Status;
import com.andriambavy.ecom.productmodel.db.entity.ProductModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "products")
public class Product extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "product_id_gen", sequenceName = "product_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	/**
	 * comma separated
	 */
	@Column(name = "infos", length = 2000)
	private String infos;

	@Column(name = "collection")
	private String collection;

	@Column(name = "category")
	private String category;

	/**
	 * comma separated
	 */
	@Column(name = "tags")
	private String tags;

	@Column(name = "status")
	private Status status;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private List<ProductModel> productModels = new ArrayList<>();

	@Override
	public Long getId() {
		return this.id;
	}
}
