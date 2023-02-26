package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items_in-cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemsInCart extends BaseEntity {
	private int quantity;
	private double totalPrice;
	
	//Multiple gift items will be saved on one cart for one user
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private GiftCart myCart;
	@OneToOne
	@JoinColumn(name = "product_id")
	private Gifts gifts;
}
