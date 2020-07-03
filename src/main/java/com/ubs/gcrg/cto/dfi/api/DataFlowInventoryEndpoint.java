package com.ubs.gcrg.cto.dfi.api;

import com.ubs.gcrg.cto.dfi.model.DataFlow;
import com.ubs.gcrg.cto.dfi.service.InventoryService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dfi")
@AllArgsConstructor
public class DataFlowInventoryEndpoint {

  InventoryService inventoryService;

  @GetMapping
  public List<DataFlow> getInventory() {
    return inventoryService.listFlows();
  }

  @PostMapping
  public DataFlow saveDataFlow(DataFlow dataFlow){
    return inventoryService.saveDataFlow(dataFlow);
  }
}
