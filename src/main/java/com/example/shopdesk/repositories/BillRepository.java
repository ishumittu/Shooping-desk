package com.example.shopdesk.repositories;

import com.example.shopdesk.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
