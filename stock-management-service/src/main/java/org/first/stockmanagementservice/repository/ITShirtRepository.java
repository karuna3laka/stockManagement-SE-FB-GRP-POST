package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.TShirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITShirtRepository extends JpaRepository<TShirt, Long>
{
}
