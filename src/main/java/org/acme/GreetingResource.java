package org.acme;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@RequestScoped
public class GreetingResource {

    @GET
    @Path("{iccid}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("iccid") final String iccid) {
        return "Hello from Quarkus REST" + iccid;
    }
}
