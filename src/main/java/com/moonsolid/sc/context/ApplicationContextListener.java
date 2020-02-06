package com.moonsolid.sc.context;

public interface ApplicationContextListener {

  void contextInitialized();
  
  void contextDestroyed();
}
