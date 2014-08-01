package br.com.rafaelmurata.config.guice;

import br.com.rafaelmurata.controller.HelloWorldServlet;

import com.google.inject.servlet.ServletModule;

public class GuiceServletModule  extends ServletModule{

	protected void configureServlets(){
	      serve("/hi").with(HelloWorldServlet.class);
	  }

}
