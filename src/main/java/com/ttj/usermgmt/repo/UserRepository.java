package com.ttj.usermgmt.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ttj.usermgmt.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{ 'userId' : ?0 }")
    public User findByUserId(String userId);
}
