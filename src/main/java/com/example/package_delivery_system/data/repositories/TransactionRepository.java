package com.example.package_delivery_system.data.repositories;

import com.example.package_delivery_system.data.entities.Office;
import com.example.package_delivery_system.data.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
