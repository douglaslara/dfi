package com.ubs.gcrg.cto.dfi.service.impl;

import com.ubs.gcrg.cto.dfi.model.DataFlow;
import com.ubs.gcrg.cto.dfi.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    JpaRepository<DataFlow, Long> dataFlowInventory;

    @Override
    public List<DataFlow> listFlows() {
        return dataFlowInventory.findAll();
    }

    @Override
    public DataFlow saveDataFlow(DataFlow dataFlow) {
        return dataFlowInventory.save(dataFlow);
    }
}
