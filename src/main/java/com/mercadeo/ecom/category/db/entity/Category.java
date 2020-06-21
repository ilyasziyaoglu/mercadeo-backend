package com.mercadeo.ecom.category.db.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "categories")
public class Category extends AbstractBaseEntity {

	private static final long serialVersionUID = 2818358983516690819L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "categories_id_gen", sequenceName = "categories_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "categories_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "level")
	private Integer level;

	@Column(name = "order_value")
	private Integer order;

	@Column(name = "image")
	private String imgUrl;

	@Column(name = "status")
	private Status status = Status.ACTIVE;

	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	private Category parent;

	@JsonIgnore
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Category> children = new ArrayList<>();

	@Override
	public Long getId() {
		return this.id;
	}
}
