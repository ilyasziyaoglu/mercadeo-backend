package com.mercadeo.ecom.sizes.db.entity;


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
@Table(name = "sizes")
public class Size extends AbstractBaseEntity {

	private static final long serialVersionUID = -6214363344868500566L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "sizes_id_gen", sequenceName = "sizes_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "sizes_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Override
	public Long getId() {
		return this.id;
	}
}
