package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="gift_categories")
public class GiftOccassion extends BaseEntity{

	@Column(name="occassion_name",length = 30,unique = true)
	private String occassionName;
	
	
	//many to many will be used
	@OneToMany(mappedBy = "giftsOccassion", cascade = CascadeType.ALL, orphanRemoval = true																				 )
	private List<Gifts> gifts=new ArrayList<>();
	
}
