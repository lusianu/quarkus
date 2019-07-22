package org.acme.controleAcesso;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String usuario() {
        return testeGustavo();
    }
    
    public String testeGustavo(){
        int valor = 1+5;
        return "o  é "+valor;
    }
}