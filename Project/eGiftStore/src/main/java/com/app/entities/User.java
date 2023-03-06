package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "users_tbl")
public class User extends BaseEntity {
	
	@Column(name = "first_name", length = 30)
	private String firstName;
	@Column(name = "last_name", length = 30)
	private String lastName;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 20, unique = true)
	private long mobile;
	@Column(length = 50)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Role role;
	
	@OneToOne(mappedBy = "currentCartUser",cascade = CascadeType.ALL,orphanRemoval = true)
	//@JoinColumn(name="customer_id")
	private GiftCart myCart;
	
	public void addCart(GiftCart cart)
	{
		setMyCart(cart);
		cart.setCurrentCartUser(this);
	}
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, long mobile, String password, Role role,
			GiftCart myCart) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.role = role;
		this.myCart = myCart;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public GiftCart getMyCart() {
		return myCart;
	}

	public void setMyCart(GiftCart myCart) {
		this.myCart = myCart;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role + "]";
	}
	

}
