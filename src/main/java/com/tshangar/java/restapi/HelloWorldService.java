package com.tshangar.java.restapi;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by ThayaashangarT on 02/01/2019.
 */

// The Java class will be hosted at the URI path "JavaRestfulService/HelloWorldService"
@Path("/HelloWorldService/")
public class HelloWorldService {
    @Path("/")
    @GET
    @Produces("text/plain")
    public Response helloWorldService() {
        return Response.status(200).entity("Welcome to Hello World Service").build();
    }

    @Path("/hello")
    @GET
    @Produces("text/plain")
    public String helloWorld() {
        // Return some cliched textual content
        return "Hello World!";
    }

    @Path("/welcome/{name}")
    @GET
    @Consumes("text/plain")
    @Produces("text/html")
    public String welcomeUser(@PathParam("name")String name) {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html>\n");
        builder.append("<html>\n");
        builder.append("   <head>\n");
        builder.append("       <title>Welcome to Hello World Service (Java)</title>\n");
        builder.append("   </head>\n");
        builder.append("   <body>\n");
        builder.append("       <h1> Welcome " + name + "</h1>\n");
        builder.append("   </body>\n");
        builder.append("</html>");

        return builder.toString();
    }
}
