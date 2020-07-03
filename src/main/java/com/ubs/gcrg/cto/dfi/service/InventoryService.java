package com.ubs.gcrg.cto.dfi.service;

import com.ubs.gcrg.cto.dfi.model.DataFlow;

import java.util.List;

public interface InventoryService {

    List<DataFlow> listFlows();

    DataFlow saveDataFlow(DataFlow dataFlow);
}
