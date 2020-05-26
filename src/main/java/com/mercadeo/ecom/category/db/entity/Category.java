package com.mercadeo.ecom.category.db.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mercadeo.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.mercadeo.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

	@Column(name = "image")
	private String imgUrl;

	@Column(name = "status")
	private Status status = Status.ACTIVE;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "parent_id")
	private Category parent;

//	@JsonManagedReference
//	@ManyToOne(mappedBy="parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval=true)
//	private Set<Category> children = new HashSet<>();

	public Long getParentId(){
		if(getParent() != null)
			return getParent().getId();
		return null;
	}

	@Override
	public Long getId() {
		return this.id;
	}
}
