package com.tshangar.java.app;

import com.tshangar.java.restapi.HelloWorldService;
import com.tshangar.java.restapi.JavaRestfulService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ThayaashangarT on 02/01/2019.
 */
@ApplicationPath("/")
public class JavaRestApplication extends Application {
    private Set<Object> singletons = new HashSet<>();
    private Set<Class<?>> classes = new HashSet<>();

    public JavaRestApplication() {
        singletons.add(new JavaRestfulService());
        singletons.add(new HelloWorldService());

        classes.add(JavaRestfulService.class);
        classes.add(HelloWorldService.class);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
