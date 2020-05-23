package com.andriambavy.ecom.productmodel.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@Entity
@Table(name = "V_COLORS")
public class Color extends AbstractBaseEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "color_name")
	private String colorName;

	@Column(name = "color_code")
	private String colorCode;
}
