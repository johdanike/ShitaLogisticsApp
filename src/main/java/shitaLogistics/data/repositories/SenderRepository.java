package com.semicolon.africa.shitaLogistics.data.repositories;

import com.semicolon.africa.shitaLogistics.data.models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepository  extends MongoRepository<Sender, String> {
}
