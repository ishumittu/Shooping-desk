package com.example.shopdesk.controllers;

import com.example.shopdesk.models.Inventory;
import com.example.shopdesk.repositories.InventoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {
	private InventoryRepository itemRepository;
	InventoryController(InventoryRepository itemRepository){
		this.itemRepository = itemRepository;
	}

	@GetMapping("api/inventory")
	public List<Inventory> GetItems(){
		return itemRepository.findAll();
	}

	@GetMapping("api/inventory/{id}")
	public Inventory GetItem(@PathVariable long id){
		return itemRepository.getReferenceById(id);
	}

	@PostMapping("api/inventory")
	public Inventory SaveItem(@RequestBody Inventory item){
		return itemRepository.save(item);
	}

	@DeleteMapping("api/inventory/{id}")
	public void DeleteItem(@PathVariable long id){
		itemRepository.deleteById(id);
	}
}
