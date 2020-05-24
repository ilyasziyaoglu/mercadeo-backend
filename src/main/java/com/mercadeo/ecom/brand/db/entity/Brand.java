package com.mercadeo.ecom.brand.db.entity;


import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.enums.Status;
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
@Table(name = "brands")
public class Brand extends AbstractBaseEntity {

	private static final long serialVersionUID = 9124949861592919633L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "brands_id_gen", sequenceName = "brands_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "brands_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "logo_img_url")
	private String logoImgUrl;

	@Column(name = "status")
	private Status status;

	@Override
	public Long getId() {
		return this.id;
	}
}
