package com.andriambavy.ecom.accessory.db.entity;


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
@Table(name = "accessory")
public class Accessory extends AbstractBaseEntity {

	private static final long serialVersionUID = 8151507194628385515L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "accessory_id_gen", sequenceName = "accessory_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "accessory_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "mainCategory")
	private String mainCategory;

	@Column(name = "subCategory")
	private String subCategory;

	@Column(name = "scale")
	private Double scale;

	@Column(name = "colors", length = 10000)
	private String colors;

	public Accessory() {
	}

	@Override
	public Long getId() {
		return id;
	}
}
