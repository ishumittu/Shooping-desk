package com.example.shopdesk.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private float amount;
	private int quantity;
	@OneToMany(targetEntity = Item.class)
	List<Item> item;

}
