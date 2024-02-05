package org.acme.repository

import io.quarkus.mongodb.panache.PanacheMongoRepository
import jakarta.enterprise.context.ApplicationScoped
import org.acme.model.Person

@ApplicationScoped
class PersonRepository : PanacheMongoRepository<Person> {
    fun findByName(name:String)=find("name", name).firstResult<Person>()
}