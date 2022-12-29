package com.example.shopdesk.controllers;

import com.example.shopdesk.models.Item;
import com.example.shopdesk.repositories.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {

	private ItemRepository itemRepository;
	ItemsController(ItemRepository itemRepository){
		this.itemRepository = itemRepository;
	}

	@GetMapping("api/items")
	public List<Item> GetItems(){
		return itemRepository.findAll();
	}

	@GetMapping("api/items/{id}")
	public Item GetItem(@PathVariable long id){
		return itemRepository.getReferenceById(id);
	}

	@PostMapping("api/items/")
	public Item SaveItem(@RequestBody Item item){
		return itemRepository.save(item);
	}

	@DeleteMapping("api/items/{id}")
	public void DeleteItem(@PathVariable long id){
		itemRepository.deleteById(id);
	}

}
