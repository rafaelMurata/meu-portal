package br.com.rafaelmurata.controller;

import java.util.Date;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class TestClass {

  @Inject
  private Date date;
  
  public TestClass() {
  }
  
  public Date getDate() {
      return date;
  }
}
