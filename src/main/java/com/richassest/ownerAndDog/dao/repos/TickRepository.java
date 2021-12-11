package com.richassest.ownerAndDog.dao.repos;

import com.richassest.ownerAndDog.dao.Tick;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TickRepository extends MongoRepository<Tick, String> {
}
