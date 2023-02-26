package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "carts")
@Getter
@Setter
@ToString(exclude = {"cartOwner","cartItems"})
public class GiftCart extends BaseEntity {
	
	private int totalItems;
	private double totalCartPrice;
	@CreationTimestamp
	private LocalDate createdOn;
	@UpdateTimestamp
	private LocalDate updatedOn;
	
	
	//One customer has to be associated with one cart
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private User currentCartUser;

	//One Gift Cart will have multiple number of Gift Items
	@OneToMany(mappedBy = "myCart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemsInCart> cartItems = new ArrayList<>();
	

	
}
