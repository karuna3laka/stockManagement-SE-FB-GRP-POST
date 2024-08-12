package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.CropTop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICropTopRepository extends JpaRepository<CropTop, Long>
{
}
