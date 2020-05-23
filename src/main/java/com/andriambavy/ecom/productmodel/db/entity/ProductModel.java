package com.andriambavy.ecom.productmodel.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.enums.Status;
import com.andriambavy.ecom.productoption.db.entity.ProductOption;
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
@Table(name = "product_models")
public class ProductModel extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "product_model_id_gen", sequenceName = "product_model_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_model_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "video_url", length = 1000)
	private String videoUrl;

	@Column(name = "img_url", length = 1000)
	private String imgUrl;

	@Column(name = "img_urls", length = 10000)
	private String imgUrls;

	@Column(name = "color_name")
	private String colorName;

	@Column(name = "color_code")
	private String colorCode;

	@Column(name = "status")
	private Status status;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "product_model_id", referencedColumnName = "id")
	private List<ProductOption> productOptions = new ArrayList<>();

	@Override
	public Long getId() {
		return this.id;
	}
}
