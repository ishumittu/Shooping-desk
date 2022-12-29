package com.example.shopdesk.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;


public class Dashboard {
	private int totalItems;
	private float totalWorth;
	private int totalBills;
	private float totalBillsValue;

	public List<Bill> yesterdayBills;
	public List<Bill> todayBills;
}
