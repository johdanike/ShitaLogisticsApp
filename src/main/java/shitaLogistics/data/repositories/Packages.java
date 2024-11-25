package com.semicolon.africa.shitaLogistics.data.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

public abstract interface Packages extends   MongoRepository<Package, String> {

}