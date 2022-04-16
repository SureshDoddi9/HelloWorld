package com.suresh.repo;

import com.suresh.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,Integer> {
    User findByUserName(String username);
}
