package com.andriambavy.ecom.jewelry.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "V_JEWELRY")
public class Jewelry extends AbstractBaseEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "video_url")
	private String videoUrl;

	@Column(name = "img_url")
	private String imgUrl;

	@Column(name = "img_urls")
	private String imgUrls;

	@Column(name = "color_name")
	private String colorName;

	@Column(name = "color_code")
	private String colorCode;

	@Column(name = "status")
	private Status status;
}
