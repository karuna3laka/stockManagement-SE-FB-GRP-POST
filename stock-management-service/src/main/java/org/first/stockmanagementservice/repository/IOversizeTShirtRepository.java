package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.OversizeTShirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOversizeTShirtRepository extends JpaRepository<OversizeTShirt, Long>
{
}
