package org.first.stockmanagementservice.repository;

import org.first.stockmanagementservice.model.extraModels.StockWarning;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@ComponentScan
public interface ILimitWarningRepository extends JpaRepository<StockWarning, Long> {


}
