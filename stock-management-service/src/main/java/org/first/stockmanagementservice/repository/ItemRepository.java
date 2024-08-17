package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< Updated upstream
public interface ItemRepository extends JpaRepository<Item, Long>
{
=======
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT p FROM Item p WHERE " +
            "LOWER(p.sellerName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.date) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.itemType) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Item> searchItemsByKeyword(@Param("keyword") String keyword);
>>>>>>> Stashed changes
}
