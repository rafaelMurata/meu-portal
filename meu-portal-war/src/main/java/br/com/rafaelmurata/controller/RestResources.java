package br.com.rafaelmurata.controller;

import static com.googlecode.objectify.ObjectifyService.ofy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rafaelmurata.model.Movie;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;

@Path("/resources")
public class RestResources {
	  
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		ObjectifyService.register(Movie.class);   //Registers new entity within the service
		Movie m = new Movie(
				1L,
				"Guardiões da Galáxia",
				"Peter Quill (Chris Pratt) foi abduzido da Terra quando ainda era criança. Adulto, fez carreira como saqueador e ganhou o nome de Senhor das Estrelas. Quando rouba uma esfera, na qual o poderoso vilão Ronan, da raça kree, está interessado, passa a ser procurado por vários caçadores de recompensas. Para escapar do perigo, Quill une forças com quatro personagens fora do sistema: Groot, uma árvore humanóide (Vin Diesel), a sombria e perigosa Gamora (Zoe Saldana), o guaxinim rápido no gatilho Rocket Racoon (Bradley Cooper) e o vingativo Drax, o Destruidor (Dave Bautista). Mas o Senhor das Estrelas descobre que a esfera roubada possui um poder capaz de mudar os rumos do universo, e logo o grupo deverá proteger o objeto para salvar o futuro da galáxia.",
				"Ficção científica , Ação",
				"www.youtube.com/embed/b3isCLVghoI");
		ObjectifyService.ofy().save().entity(m);    // async without the now()
		System.out.println("foi");

		// Get it back
		Result<Movie> th = ofy().load().entity(m);  // Equivalent to ofy().load().key(get_key_of(entity));
		Movie fetched1 = th.now();    // Materialize the async value
		
		System.out.println(fetched1.id.toString());
		
	     return ("welcome resources");
	}
}
