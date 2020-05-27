package com.mng.rpc.server;

import java.util.LinkedHashMap;
import java.util.Map;

public class EndpointCtx {

  private Map<String, String> invokeHistory;


  public EndpointCtx() {
    this.invokeHistory = new LinkedHashMap<>();
  }

  public Map<String, String> getInvokeHistory() {
    return invokeHistory;
  }
}
