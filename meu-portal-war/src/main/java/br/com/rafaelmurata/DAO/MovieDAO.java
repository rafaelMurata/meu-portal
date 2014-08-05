package br.com.rafaelmurata.DAO;

import br.com.rafaelmurata.model.Movie;

import com.googlecode.objectify.ObjectifyService;

public class MovieDAO {
 
    static
    {
        ObjectifyService.register(Movie.class);
    }
 
 
 
}