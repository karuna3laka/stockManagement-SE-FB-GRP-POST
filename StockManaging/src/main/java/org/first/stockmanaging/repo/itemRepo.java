package org.first.stockmanaging.repo;

import org.first.stockmanaging.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepo extends JpaRepository<Item,Integer> {
}
