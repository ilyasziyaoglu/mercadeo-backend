package com.andriambavy.ecom.common.property.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;

import javax.persistence.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Entity
@Table(name = "property")
public class Property extends AbstractBaseEntity {

	private static final long serialVersionUID = 8143334651103894742L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "property_id_gen", sequenceName = "property_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "property_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "key")
	private String key;

	@Column(name = "value", length = 10000)
	private String value;

	public Property() {
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
