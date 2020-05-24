package com.mercadeo.ecom.product.db.entity;


import com.mercadeo.ecom.brand.db.entity.Brand;
import com.mercadeo.ecom.category.db.entity.Category;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.enums.Status;
import com.mercadeo.ecom.productcolor.db.entity.ProductColor;
import com.mercadeo.ecom.sizes.db.entity.Size;
import com.mercadeo.ecom.stock.db.entity.Stock;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
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
	@Column(name = "id",
			nullable = false)
	@SequenceGenerator(name = "product_id_gen",
					   sequenceName = "product_id_seq",
					   allocationSize = 1)
	@GeneratedValue(generator = "product_id_gen",
					strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id", referencedColumnName = "id")
	private Brand brand;

	@Column(name = "img_url")
	private String imgUrl;

	@Column(name = "price")
	private BigDecimal price;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category1_id")
	private Category category1;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category2_id")
	private Category category2;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category3_id")
	private Category category3;

	@Column(name = "collection")
	private String collection;

	@Column(name = "status")
	private Status status;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProductColor> productColors;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private List<Stock> stocks;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "product_sizes",
			   joinColumns = @JoinColumn(name = "product_id"),
			   inverseJoinColumns = @JoinColumn(name = "size_id"))
	private List<Size> sizes;

	/**
	 * comma separated
	 */
	@Column(name = "infos",
			length = 2000)
	private String infos;

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
