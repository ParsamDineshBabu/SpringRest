package com.dinesh;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
