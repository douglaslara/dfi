package com.ubs.gcrg.cto.dfi.repository;

import com.ubs.gcrg.cto.dfi.model.DataFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataFlowRepository extends JpaRepository<DataFlow, Long> {

}
