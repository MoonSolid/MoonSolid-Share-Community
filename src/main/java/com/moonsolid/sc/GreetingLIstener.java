package com.moonsolid.sc;

import java.util.Map;
import com.moonsolid.sc.context.ApplicationContextListener;

public class GreetingLIstener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("안녕하세요");
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("안녕히가세요");
  }

}
