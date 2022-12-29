package com.example.shopdesk.repositories;

import com.example.shopdesk.models.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
