package com.mercadeo.ecom.color.db.entity;


import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
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
@Table(name = "colors")
public class Color extends AbstractBaseEntity {

	private static final long serialVersionUID = 208179233904178333L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "colors_id_gen", sequenceName = "colors_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "colors_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "imgUrl", length = 1000)
	private String imgUrl;

	public Long getId() {
		return this.id;
	}
}
