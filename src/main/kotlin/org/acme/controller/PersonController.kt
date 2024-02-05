package org.acme.controller

import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.acme.model.Person
import org.acme.repository.PersonRepository

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class PersonController {

    @Inject
    lateinit var personRepository : PersonRepository

    @POST
    @Path("/save")
    fun savePerson(person : Person) : Person{
        personRepository.persist(person)
        return person
    }

    @GET
    @Path("/get/{name}")
    fun getPerson(@PathParam("name") name : String) : Person?{
        return personRepository.findByName(name)
    }

    @GET
    @Path("/get/all")
    fun getAllPersons() : MutableList<Person>?{
        return personRepository.findAll().list()
    }

}