package com.andriambavy.ecom.modelaccessory.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
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
@Table(name = "model_accessory")
public class ModelAccessory extends AbstractBaseEntity {

	private static final long serialVersionUID = -5141127463123029918L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "model_accessory_id_gen", sequenceName = "model_accessory_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "model_accessory_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "model_id")
	private Long modelId;

	@Column(name = "accessory_id")
	private Long accessoryId;

	@Column(name = "props", length = 100000)
	private String props;

	public ModelAccessory() {
	}

	@Override
	public Long getId() {
		return id;
	}
}
