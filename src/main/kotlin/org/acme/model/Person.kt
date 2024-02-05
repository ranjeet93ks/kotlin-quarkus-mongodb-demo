package org.acme.model

class Person {
    var id : Int ?= 0
    var name : String ?= null
    var email : String ?= null

    constructor(id: Int?, name: String?, email: String?) {
        this.id = id
        this.name = name
        this.email = email
    }

    constructor()

    override fun toString(): String {
        return "Person(id=$id, name=$name, email=$email)"
    }


}