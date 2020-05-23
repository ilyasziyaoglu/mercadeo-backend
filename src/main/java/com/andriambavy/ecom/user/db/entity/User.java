package com.andriambavy.ecom.user.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
public class User extends AbstractBaseEntity implements UserDetails {

	private static final long serialVersionUID = 3842413573148772459L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "user_id_gen", sequenceName = "user_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "user_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;


	//TODO buraya gender, birthdate, country,  eklenecek
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "status")
	private Status status;

	@Column(name = "email")
	private String email;

	@Column(name = "gender")
	private String gender;

	@Column(name = "birthdate")
	private Date birthdate;

	@Column(name = "country")
	private String country;

	@Column(name = "phone")
	private String phone;

	@Column(name = "addresses", length = 10000)
	private String addresses;

	@Column(name = "roles")
	private String roles;

	public User() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		//TODO bu kismi ayarla kardesim yeter artik
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.stream(roles.split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}
}
