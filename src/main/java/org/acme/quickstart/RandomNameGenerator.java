package org.acme.quickstart;

import com.github.javafaker.Faker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/randomname")
public class RandomNameGenerator {
    private Faker faker = new Faker();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String randomName() {
        return faker.firstName();
    }
}