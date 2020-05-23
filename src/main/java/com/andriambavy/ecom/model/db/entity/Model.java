package com.andriambavy.ecom.model.db.entity;


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
@Table(name = "model")
public class Model extends AbstractBaseEntity {

	private static final long serialVersionUID = 3842413573148772459L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "model_id_gen", sequenceName = "model_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "model_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "category")
	private String category;

	@Column(name = "colors", length = 10000)
	private String colors;

	public Model() {
	}

	@Override
	public Long getId() {
		return id;
	}
}
