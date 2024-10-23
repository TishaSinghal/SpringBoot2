package com.learningspringboot.EngDigest.repository;

import com.learningspringboot.EngDigest.entity.JournalEntry;
import com.learningspringboot.EngDigest.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
