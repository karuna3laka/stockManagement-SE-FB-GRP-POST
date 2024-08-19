package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IItemRepository extends JpaRepository<Item, Long> {
    // Add any custom queries if needed
}

