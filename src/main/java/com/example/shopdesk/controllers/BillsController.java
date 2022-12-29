package com.example.shopdesk.controllers;

import com.example.shopdesk.models.Bill;
import com.example.shopdesk.models.Item;
import com.example.shopdesk.repositories.BillRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillsController {
	BillRepository billRepository;
	BillsController(BillRepository billRepository) {
		this.billRepository = billRepository;
	}

	@GetMapping("api/bills")
	public List<Bill> GetItems(){
		return billRepository.findAll();
	}

	@GetMapping("api/bills/{id}")
	public Bill GetItem(@PathVariable long id){
		return billRepository.getReferenceById(id);
	}

	@PostMapping("api/bills/")
	public Bill SaveItem(@RequestBody Bill item){
		return billRepository.save(item);
	}

	@DeleteMapping("api/bills/{id}")
	public void DeleteItem(@PathVariable long id){
		billRepository.deleteById(id);
	}

}

