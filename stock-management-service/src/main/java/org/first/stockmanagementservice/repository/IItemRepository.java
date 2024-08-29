package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findByItemType(String itemType);

    // OR if you want to use a custom query with a different method name
    @Query("SELECT i FROM Item i WHERE i.itemType = :type")
    Optional<Item> findByType(@Param("type") String type);
}

