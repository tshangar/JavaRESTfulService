package com.tshangar.java.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by ThayaashangarT on 05/01/2019.
 */

// The Java class will be hosted at the URI path "JavaRestfulService/"
@Path("/")
public class JavaRestfulService {
    @Path("/")
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response helloWorldService() {
        return Response.status(200).entity("Welcome to Java Restful Service").build();
    }
}
