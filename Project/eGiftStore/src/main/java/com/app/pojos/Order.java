package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
	@CreationTimestamp
	private LocalDate orderDate;
	
	private LocalDate deliveryDate;
	
	private double totalPrice;
	
	private double shippingFee;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private OrderStatus orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private User customer;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order",orphanRemoval = true)
	private List<GiftOrderDetails> orderDetailList=new ArrayList<>();
	//helper methods
	public void addOrderDetail(GiftOrderDetails detail)
	{
		orderDetailList.add(detail);
		detail.setOrder(this);
	}
	
	public void removeOrderDetail(GiftOrderDetails detail)
	{
		orderDetailList.remove(detail);
		detail.setOrder(null);
	}
	


}
