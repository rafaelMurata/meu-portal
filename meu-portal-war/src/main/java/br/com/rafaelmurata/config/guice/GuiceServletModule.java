package br.com.rafaelmurata.config.guice;

import br.com.rafaelmurata.controller.HelloWorldServlet;
import br.com.rafaelmurata.controller.RestResources;

import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;

public class GuiceServletModule  extends ServletModule{

	protected void configureServlets(){
	      serve("/hi").with(HelloWorldServlet.class);

	  }

}
