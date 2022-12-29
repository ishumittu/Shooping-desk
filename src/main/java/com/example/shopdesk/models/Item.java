package com.example.shopdesk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Item {

	public Item(){}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String size;
	private float price;
	private float cost;
	private int quantity;
	private long billId;

	public Item(long id, String name, String size, float price, float cost, int quantity, long billId) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
		this.cost = cost;
		this.quantity = quantity;
		this.billId = billId;
	}

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return id == item.id && Float.compare(item.price, price) == 0 && Float.compare(item.cost, cost) == 0 && quantity == item.quantity && billId == item.billId && name.equals(item.name) && Objects.equals(size, item.size);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, size);
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +
				", size='" + size + '\'' +
				", price=" + price +
				", cost=" + cost +
				", quantity=" + quantity +
				", billId=" + billId +
				'}';
	}

}
