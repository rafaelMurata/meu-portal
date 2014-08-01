package br.com.rafaelmurata.controller;

import java.util.Date;

import javax.inject.Inject;

import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class SecondTest {

  @Inject
  private Date date;
  
  public SecondTest() {
  }
  
  public Date getDate() {
      return date;
  }

}